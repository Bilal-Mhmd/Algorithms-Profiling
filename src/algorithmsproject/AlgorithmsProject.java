package algorithmsproject;

/**
 *
 * @author Bilal & Amro
 */
import java.util.Random;
import java.util.ArrayList;

public class AlgorithmsProject {
        
    
static ArrayList<Long> insertionList = new ArrayList<>();//TO RECORED DATA FOR INSERTION
static ArrayList<Long> mergeList = new ArrayList<>();//TO RECORED DATA FOR MERGE
static ArrayList<Long> quickList = new ArrayList<>();//TO RECORED DATA FOR QUICK

    public static void main(String[] args) {
        int[] inputSize={100000,300000,500000,700000,900000,1100000,1300000,1500000,1700000,1900000,};
        for (int i = 0; i < inputSize.length; i++) {
             System.out.println("for array of size "+inputSize[i]);
             pass(inputSize[i]);
             System.out.println("************************************************");
            
        }
        
       //result list 
        System.out.println("The result running time (in milli second) for the size inputs: \n100k,300k,300k,500k,700k,900k,1.1M, 1.3M, 1.5M, 1.7M, 1.9M");
        System.out.print("Insertion Sort: ");
        for(Long a: insertionList )
        {
            System.out.print( a +" ");
        }
         System.out.print("\nMerge Sort: ");
         
         for(Long b: mergeList )
        {
            System.out.print( b +" ");
        }
          System.out.print("\nQuick Sort: ");
         for(Long c: quickList )
        {
            System.out.print( c +" ");
        }
         System.out.println("");
        
        
        //   printArray(arr);        
    }

    public static void calculateTime(int arr[]) {
      
        int temp[] = new int[arr.length];
        long timeDifference;
        for (int i = 0; i < arr.length; ++i) {
            temp[i] = arr[i];
        }

        System.out.println("Time needed:");
        //insertion sort
        long start = System.currentTimeMillis();
        InsertionSort ob = new InsertionSort();
        ob.sort(temp);
        long end = System.currentTimeMillis();
        timeDifference = end - start;
        insertionList.add(timeDifference);
        System.out.println("Insertion Sort = :" +timeDifference + " milli second");

        for (int i = 0; i < arr.length; ++i) {
            temp[i] = arr[i];
        }
        //Merge Sort hhh
        start = System.currentTimeMillis();
        MergeSort object = new MergeSort();
        object.sort(temp, 0, arr.length - 1);
        end = System.currentTimeMillis();
        timeDifference = end - start;
        mergeList.add(timeDifference);
        System.out.println("Merge Sort = :" + timeDifference + " milli second");

        for (int i = 0; i < arr.length; ++i) {
            temp[i] = arr[i];
        }
        
        //Quick Sort

        start = System.currentTimeMillis();
        QuickSort obj = new QuickSort();
        obj.sort(temp, 0, arr.length - 1);
        end = System.currentTimeMillis();
        timeDifference = end - start;
        quickList.add(timeDifference);
        System.out.println("Quick Sort = :" + timeDifference + " milli second");

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
