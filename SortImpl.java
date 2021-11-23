import java.util.List;

public class SortImpl implements Sort{

    private List<Integer> createList;
    private String selectSort;
    
    public SortImpl(List<Integer> createList, String selectSort) {
        this.createList = createList;
        this.selectSort = selectSort;
    }

    @Override
    public void bubbleSort(){
        System.out.println("bubbleSort");
        System.out.println(createList);
        System.out.println(selectSort);
    }

    @Override
    public void bucketSort() {
        System.out.println("bucketSort");
    }

    @Override
    public void heapSort() {
        System.out.println("heapSort");
    }

    @Override
    public void quickSort() {
        System.out.println("quickSort");
    }

    @Override
    public void selectSort() {
        System.out.println("selectSort");
    }

    @Override
    public void mergeSort() {
        System.out.println("mergeSort");
    }

    @Override
    public void insertionSort() {
        System.out.println("insertionSort");
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
}
