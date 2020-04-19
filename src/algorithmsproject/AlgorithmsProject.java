package algorithmsproject;

/**
 *
 * @author Bilal & Amro
 */
import java.util.Random;

public class AlgorithmsProject {

    
    public static void main(String[] args) {

        System.out.println("for array of size 10k:");
        pass(10000);
         System.out.println("*****************************");
        System.out.println("for array of size 20k:");
        pass(20000);
          System.out.println("*****************************");
        System.out.println("for array of size 30k:");
        pass(30000);
           System.out.println("*****************************");
        System.out.println("for array of size 40k:");
        pass(40000);
           System.out.println("*****************************");
        System.out.println("for array of size 50k:");
        pass(50000);
           System.out.println("*****************************");
        System.out.println("for array of size 60k:");
        pass(60000);
           System.out.println("*****************************");
        System.out.println("for array of size 70k:");
        pass(70000);
           System.out.println("*****************************");
        System.out.println("for array of size 80k:");
        pass(80000);
           System.out.println("*****************************");
        System.out.println("for array of size 90k:");
        pass(90000);
           System.out.println("*****************************");
        System.out.println("for array of size 100k:");
        pass(100000);
           System.out.println("*****************************");

        //   printArray(arr);        
    }

    public static void calculateTime(int arr[]) {
        int temp[] = new int[arr.length];

        for (int i = 0; i < arr.length; ++i) {
            temp[i] = arr[i];
        }

        System.out.println("Time needed:");
        //insertion sort
        long start = System.currentTimeMillis();
        InsertionSort ob = new InsertionSort();
        ob.sort(temp);
        long end = System.currentTimeMillis();
        System.out.println("Insertion Sort = :" + (end - start) + " milli second");

        for (int i = 0; i < arr.length; ++i) {
            temp[i] = arr[i];
        }
        //Merge Sort hhh
        start = System.currentTimeMillis();
        MergeSort object = new MergeSort();
        object.sort(temp, 0, arr.length - 1);
        end = System.currentTimeMillis();
        System.out.println("Merge Sort = :" + (end - start) + " milli second");

        for (int i = 0; i < arr.length; ++i) {
            temp[i] = arr[i];
        }
        //Quick Sort

        start = System.currentTimeMillis();
        QuickSort obj = new QuickSort();
        obj.sort(temp, 0, arr.length - 1);
        end = System.currentTimeMillis();
        System.out.println("Quick Sort = :" + (end - start) + " milli second");

    }

    public static void pass(int n) {
        Random data = new Random();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = data.nextInt(99999);
        }
        calculateTime(arr);

    }
    
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

}
