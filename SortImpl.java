import java.util.Iterator;
import java.util.List;

public class SortImpl implements Sort {

    private List<Integer> createList;
    private String selectSort;

    public SortImpl(List<Integer> createList, String selectSort) {
        this.createList = createList;
        this.selectSort = selectSort;
        System.out.println(selectSort+"を開始します");
    }

    @Override
    public void bubbleSort() {
        Iterator<Integer> bubbleSortList = createList.iterator();
        printIterable(bubbleSortList);

    }

    @Override
    public void bucketSort() {
    }

    @Override
    public void heapSort() {
        System.out.println(selectSort+"を開始します");
    }

    @Override
    public void quickSort() {
        System.out.println(selectSort+"を開始します");
    }

    @Override
    public void selectSort() {
        System.out.println(selectSort+"を開始します");
    }

    @Override
    public void mergeSort() {
        System.out.println(selectSort+"を開始します");
    }

    @Override
    public void insertionSort() {
        System.out.println(selectSort+"を開始します");
    }

    @Override
    public void shellSort() {
        System.out.println("shellSort");
    }

    @Override
    public void shakerSort() {
        System.out.println("shakerSort");
    }

    @Override
    public void comSort() {
        System.out.println("comSort");
    }

    @Override
    public void gnomeSort() {
        System.out.println("gnomeSort");
    }

    @Override
    public void selfBalancingBinarySearchTreeSort() {
        System.out.println("selfBalancingBinarySearchTreeSort");
    }

    @Override
    public void librarySort() {
        System.out.println("librarySort");
    }

    @Override
    public void inPlaceMergeSort() {
        System.out.println("inPlaceMergeSort");
    }

    @Override
    public void smoothSort() {
        System.out.println("smoothSort");
    }

    @Override
    public void voidroSort() {
        System.out.println("voidroSort");
    }

    @Override
    public void patienceSort() {
        System.out.println("bucketSort");
    }

    @Override
    public void strandSort() {
        System.out.println("bucketSort");
    }

    @Override
    public void oddEvenSort() {
        System.out.println("bucketSort");
    }

    @Override
    public void shareSort() {
        System.out.println("bucketSort");
    }

    @Override
    public void introSort() {
        System.out.println("bucketSort");
    }

    private static void printIterable(Iterator<Integer> iterator){
        while (iterator.hasNext()) {
            int s = iterator.next();
            System.out.print(s+",");
          }
    }
}
