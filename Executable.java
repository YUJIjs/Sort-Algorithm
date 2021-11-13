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

        public final String BUBBLE_SORT = "バブルソート";
        public final String BUCKET_SORT = "バケットソート";
        public final String QUICK_SORT = "クイックソート";
        public final String SELECT_SORT = "選択ソート";
        public final String MERGE_SORT = "マージソート";
        public final String INSERTION_SORT = "挿入ソート";
        public final String SHELL_SORT = "シェルソート";
        public final String SHAKER_SORT = "シェーカーソート";
        public final String COM_SORT = "コムソート";
        public final String GNOME_SORT = "ノームソート";
        public final String SELF_BALANCING_BINARY_SEARCH_TREE_SORT = "平衡二分探索木ソート";
        public final String LIBRARY_SORT = "図書館ソート";
        public final String INPLACE_MERGE_SORT = "インプレースマージソート";
        public final String SMOOTH_SORT = "スムースソート";
        public final String INTRO_SORT = "イントロソート";
        public final String PATIENCE_SORT = "ペイシェンスソート";
        public final String STRAND_SORT = "ストランドソート";
        public final String ODD_EVEN_SORT = "奇遇転置ソート";
        public final String SHARE_SORT = "シェアソート";

    }

    public static void main(String[] args)
            throws IllegalArgumentException, IllegalAccessException, NoSuchAlgorithmException {

        String or;
        Scanner scan = new Scanner(System.in);

        do {
            // リストデータ作成部
            List<Integer> createList = create();

            // ソート条件取得部
            Map<Integer, String> refrectionList = refrection();

            // ソート実行部
            execute(createList,refrectionList);

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
    private static void execute(List<Integer> createList, Map<Integer, String> refrectionList) {
        
    }

    /**
     * SortNamesの全てのフィールドをリフレクションで取得する。 リフレクションで取得後、Mapに格納 指定した番号のMapをreturnする。
     * 
     * @throws IllegalArgumentException
     * @throws IllegalAccessException
     */
    private static Map<Integer, String> refrection() throws IllegalArgumentException, IllegalAccessException {
        Field[] fields = Executable.SortNames.class.getDeclaredFields();
        Map<Integer, String> maps = new HashMap<>();
        Map<Integer, String> returnMap = new HashMap<>();
        int i = 0;

        for (Field field : fields) {

            if (!Modifier.isPublic(field.getModifiers())) {
                field.setAccessible(true);
            }
            System.out.println(i + ":" + field.get(new SortNames()));

            i++;
        }

        System.out.println("ソートアルゴリズムを選ぶ(数字)");
        int sortNum = scan.nextInt();

        for (Entry<Integer, String> entry : maps.entrySet()) {
            if (sortNum == entry.getKey()) {
                maps.put(sortNum, entry.getValue());
                System.out.println(entry.getKey() + ":" + entry.getValue());
                returnMap.put(sortNum, entry.getValue());
            }
        }
        return returnMap;
    }

    /**
     * 指定した数字の数だけリストを作成する ランダムに数字を作成するか、自分で指定するかを決める、 1:指定した数だけ乱数を発生させ、リストに格納する
     * 2:指定した数だけ自分で数字を入力し、リストに格納する リストをreturnする
     * 
     * @return listArray
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
