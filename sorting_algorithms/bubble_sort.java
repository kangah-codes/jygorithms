// author = Joshua Akangah

public class bubble_sort{
    public static void BubbleSort(int [] arr){
        int length = arr.length;

        for (int i=0;i<length-1;i++){
            boolean swapped = false;

            for (int j=0;j<length-1;j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = arr[j+1];
                    swapped = true;
                }
            }

            if (!swapped){
                break;
            }
        }
    }

    void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
    } 

    public static void main(String args[]){
        bubble_sort array = new bubble_sort();

        int arr[] = {24,543,3245,6322,234,34};

        array.BubbleSort(arr);

        array.printArray(arr);
    }
}