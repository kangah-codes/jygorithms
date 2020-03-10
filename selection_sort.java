public class selection_sort{
	public static void SelectionSort(int [] arr){
		int n = arr.length;

		for (int i=0;i<n-1;i++){
			int min_index = i;

			for (int j=i+1;j<n;j++){
				if (arr[j] < arr[min_index]){
					min_index = j;
				}
			}

			int temp = arr[min_index];
			arr[min_index] = arr[i];
			arr[i] = temp;
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
        selection_sort array = new selection_sort();

        int arr[] = {24,543,3245,6322,234,34};

        array.SelectionSort(arr);

        array.printArray(arr);
    }
}