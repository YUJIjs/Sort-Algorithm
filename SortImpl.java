import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;

public class SortImpl implements Sort{

    private List<Integer> createList;
    private Map<Integer, String> refrectionMap;
    
    public SortImpl(List<Integer> createList, Map<Integer, String> refrectionMap) {
        this.createList = createList;
        this.refrectionMap = refrectionMap;
    }

    @Override
    public void bubbleSort(){
        System.out.println("bubbleSortを呼び出しています");
        System.out.println(createList);
        System.out.println(refrectionMap);
    }

    // @Override
    // public void bucketSort() {
    // }

    // @Override
    // public void heapSort() {
    // }

    // @Override
    // public void quickSort() {
    // }

    // @Override
    // public void selectSort() {
    // }

    // @Override
    // public void mergeSort() {
    // }

    // @Override
    // public void insertionSort() {
    // }

    // @Override
    // public void shellSort() {
    // }

    // @Override
    // public void shakerSort() {
    // }

    // @Override
    // public void comSort() {
    // }

    // @Override
    // public void gnomeSort() {
    // }

    // @Override
    // public void selfBalancingBinarySearchTreeSort() {
    // }

    // @Override
    // public void librarySort() {
    // }

    // @Override
    // public void inPlaceMergeSort() {
    // }

    // @Override
    // public void smoothSort() {
    // }

    // @Override
    // public void voidroSort() {
    // }

    // @Override
    // public void patienceSort() {
    // }

    // @Override
    // public void strandSort() {
    // }

    // @Override
    // public void oddEvenSort() {
    // }

    // @Override
    // public void shareSort() {
    // }    
}
