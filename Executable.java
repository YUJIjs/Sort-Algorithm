import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Executable {

    static class SortsName {

        public final String BUBBLESORT = "バブルソート";
        public final String BUCKETSORT = "バケットソート";
        public final String QUICKSORT = "クイックソート";
        public final String SELECTSORT = "選択ソート";
        public final String MERGESORT = "マージソート";
        public final String INSERTIONSORT = "挿入ソート";
        public final String SHELLSORT = "シェルソート";
        public final String SHAKERSORT = "シェーカーソート";
        public final String COMSORT = "コムソート";
        public final String GNOMESORT = "ノームソート";
        public final String SELFBALANCINGBINARYSEARCHTREESORT = "平衡二分探索木ソート";
        public final String LIBRARYSORT = "図書館ソート";
        public final String INPLACEMERGESORT = "インプレースマージソート";
        public final String SMOOTHSORT = "スムースソート";
        public final String INTROSORT = "イントロソート";
        public final String PATIENCESORT = "ペイシェンスソート";
        public final String STRANDSORT = "ストランドソート";
        public final String ODDEVENSORT = "奇遇転置ソート";
        public final String SHARESORT = "シェアソート";

    }

    public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException, SecurityException {

        System.out.println("ソートの種類を選択してください");
        Field[] fields = Executable.SortsName.class.getDeclaredFields();
        int i = 0;
        for (Field field : fields) {
            if (!Modifier.isPublic(field.getModifiers())) {
                field.setAccessible(true);
            }
            System.out.print(i);
            System.out.println(":" + field.get(new SortsName()));
            i++;
        }

    }

    // Scanner scan = new Scanner(System.in);
    // List<Long> inputNumbers = new ArrayList<>();

}
