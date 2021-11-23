import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Map.Entry;

public class Executable {
    static Scanner scan = new Scanner(System.in);

    static class SortNames {

        public final String bubbleSort = "バブルソート";
        public final String bucketSort = "バケットソート";
        public final String quickSort = "クイックソート";
        public final String selectSort = "選択ソート";
        public final String mergeSort = "マージソート";
        public final String insertionSort = "挿入ソート";
        public final String shellSort = "シェルソート";
        public final String shakerSort = "シェーカーソート";
        public final String comSort = "コムソート";
        public final String gnomeSort = "ノームソート";
        public final String selfBalancingBinarySearchTreeSort = "平衡二分探索木ソート";
        public final String librarySort = "図書館ソート";
        public final String inPlaceMergeSort = "インプレースマージソート";
        public final String smoothSort = "スムースソート";
        public final String introSort = "イントロソート";
        public final String patienceSort = "ペイシェンスソート";
        public final String strandSort = "ストランドソート";
        public final String oddEvenSort = "奇遇転置ソート";
        public final String shareSort = "シェアソート";

    }

    public static void main(String[] args)
            throws IllegalArgumentException, IllegalAccessException, NoSuchAlgorithmException {

        String or;
        Scanner scan = new Scanner(System.in);

        do {
            // リストデータ作成部
            List<Integer> createList = create();

            // ソート条件取得部
            String selectSort = selectSort();

            // ソート実行部
            execute(createList, selectSort);

            System.out.println("終了:y/n");
            or = scan.next();
        } while (!"y".equals(or));
        scan.close();

    }

    /**
     * 取得した情報のソートとデータを取得、対応したソート呼び出す
     * 
     * @param createList
     * @param refrectionList
     */
    private static void execute(List<Integer> createList, String selectSort) {
        Sort sort = new SortImpl(createList, selectSort);

        System.out.println(selectSort);

        switch (selectSort) {
        case "バブルソート":
            sort.bubbleSort();
            break;
        case "バケットソート":
            sort.bucketSort();
            break;
        case "クイックソート":
            sort.quickSort();
            break;
        case "選択ソート":
            sort.selectSort();
            break;
        case "マージソート":
            sort.mergeSort();
            break;
        case "挿入ソート":
            sort.insertionSort();
            break;
        case "シェルソート":
            sort.shellSort();
            break;
        case "シェーカーソート":
            sort.shakerSort();
            break;
        case "コムソート":
            sort.comSort();
            break;
        case "ノームソート":
            sort.gnomeSort();
            break;
        case "平衡二分探索木ソート":
            sort.selfBalancingBinarySearchTreeSort();
            break;
        case "図書館ソート":
            sort.librarySort();
            break;
        case "インプレースマージソート":
            sort.inPlaceMergeSort();
            break;
        case "スムースソート":
            sort.smoothSort();
            break;
        case "イントロソート":
            sort.introSort();
            break;
        case "ペイシェンスソート":
            sort.patienceSort();
            break;
        case "ストランドソート":
            sort.strandSort();
            break;
        case "奇遇転置ソート":
            sort.oddEvenSort();
            break;
        case "シェアソート":
            sort.shareSort();
            break;
        default:
            System.out.println("どのソートにも一致しませんでした");
        }
    }

    /**
     * SortNamesの全てのフィールドをリフレクションで取得する。 リフレクションで取得後、Mapに格納 指定した番号のMapをreturnする。
     * 
     * @return List<String> returnList
     * @throws IllegalArgumentException
     * @throws IllegalAccessException
     */
    private static String selectSort() throws IllegalArgumentException, IllegalAccessException {
        Field[] fields = Executable.SortNames.class.getDeclaredFields();
        List<String> list = new ArrayList<>();
        Map<Integer, String> map = new HashMap<>();
        String str = "";
        int i = 0;

        for (Field field : fields) {
            if (!Modifier.isPublic(field.getModifiers())) {
                field.setAccessible(true);
            }
            System.out.println(i + ":" + field.get(new SortNames()));
            map.put(i, (String) field.get(new SortNames()));
            list.add(i, (String) field.get(new SortNames()));
            i++;
        }

        System.out.println("ソートアルゴリズムを選ぶ(数字)");
        int sortNum = scan.nextInt();
        for (Entry<Integer, String> entry : map.entrySet()) {
            if (sortNum == entry.getKey()) {
                System.out.println(entry.getValue() + "が選択されました");
                str = entry.getValue();
            }
        }
        return str;
    }

    /**
     * 指定した数字の数だけリストを作成する ランダムに数字を作成するか、自分で指定するかを決める、 1:指定した数だけ乱数を発生させ、リストに格納する
     * 2:指定した数だけ自分で数字を入力し、リストに格納する リストをreturnする
     * 
     * @return List<Integer> listArray
     * @throws NoSuchAlgorithmException
     */
    private static List<Integer> create() throws NoSuchAlgorithmException {
        System.out.print("作成する数字の個数を入力:");
        int num = scan.nextInt();
        List<Integer> listArray = new ArrayList<>();

        System.out.println("ランダムで生成する:1\n自分で生成する:2");
        int field = scan.nextInt();
        switch (field) {
        case 1:
            Random rand = SecureRandom.getInstanceStrong();
            for (int i = 0; i < num; i++) {
                int randomNumber = rand.nextInt(100);
                listArray.add(randomNumber);
            }
            break;

        case 2:
            for (int i = 0; i < num; i++) {
                System.out.println("i:");
                int inputNumber = scan.nextInt();
                listArray.add(inputNumber);
            }
            break;

        default:
            System.out.println("1と0以外の値が入力されました.");
            break;
        }

        return listArray;
    }
}
