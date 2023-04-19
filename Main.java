import sortingAlgos.BubbleSort;
import sortingAlgos.SortingStrategy;

//client code which wants to sort an array
public class Main {
    public static void main(String[] args) {
        int[] arr = { 5, 2, 7, 1, 8 };
        System.out.println("inside client code...");

        //since array is small, we use bubble sort strategy
        SortingStrategy strategy = new BubbleSort();
        Sorter sorter = new Sorter(strategy);

        //this sort function will decide its implementation on runtime
        sorter.sort(arr);
    }
}