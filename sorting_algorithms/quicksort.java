// author = Joshua Akangah

public class quicksort{
    public static void QuickSort(int [] arr, int start, int finish){
        if (start < finish){
            p = partition(arr, start, finish);
            QuickSort(arr, start, p-1);
            QuickSort(arr, p+1, finish)
        }
    }

    int partition(int arr[], int start, int finish){
        int pivot = arr[finish];
        int i = start;

        for (int j=0;j>=start && j<=finish){
            if (arr[j] < pivot){
                // using a temp variable
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        int temp = arr[i];
        arr[i] = arr[finish];
        arr[finish] = temp;
        return i;
    }

    void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
    } 

    public static void main(String args[]){
        quicksort array = new quicksort();

        int arr[] = {24,543,3245,6322,234,34};

        array.QuickSort(arr, 0, arr.length-1);

        array.printArray(arr);
    }
}