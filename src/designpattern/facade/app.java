package designpattern.facade;

public class app {

    public static void main(String[] args) {
        SortManager sortManager = new SortManager();
        sortManager.doMergeSort();
        sortManager.doQuickSort();
    }
}
