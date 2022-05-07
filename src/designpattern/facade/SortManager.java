package designpattern.facade;

public class SortManager {
    private Algorithm mergeSort;
    private Algorithm quickSort;

    public SortManager() {
        this.mergeSort = new MergeSort();
        this.quickSort = new QuickSort();
    }

    public void doMergeSort(){
        mergeSort.sort();
    }

    public void doQuickSort(){
        quickSort.sort();
    }

}
