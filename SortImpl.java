import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class SortImpl implements Sort {

    private List<Integer> createList;
    private ListIterator<Integer> sortList = createList.listIterator();
    private String selectSort;


    public SortImpl(List<Integer> createList, String selectSort) {
        this.createList = createList;
        this.selectSort = selectSort;
        System.out.println(selectSort+"を開始します");
    }

    @Override
    public void bubbleSort() {
        printIterable(sortList);

    }

    @Override
    public void bucketSort() {
    }

    @Override
    public void heapSort() {
    }

    @Override
    public void quickSort() {
    }

    @Override
    public void selectSort() {
    }

    @Override
    public void mergeSort() {
    }

    @Override
    public void insertionSort() {
    }

    @Override
    public void shellSort() {
    }

    @Override
    public void shakerSort() {
    }

    @Override
    public void comSort() {
    }

    @Override
    public void gnomeSort() {
    }

    @Override
    public void selfBalancingBinarySearchTreeSort() {
    }

    @Override
    public void librarySort() {
    }

    @Override
    public void inPlaceMergeSort() {
    }

    @Override
    public void smoothSort() {
    }

    @Override
    public void voidroSort() {
    }

    @Override
    public void patienceSort() {
    }

    @Override
    public void strandSort() {
    }

    @Override
    public void oddEvenSort() {
    }

    @Override
    public void shareSort() {
    }

    @Override
    public void introSort() {
    }

    private static void printIterable(Iterator<Integer> iterator){
        while (iterator.hasNext()) {
            int s = iterator.next();
            System.out.print(s+",");
          }
    }
}
