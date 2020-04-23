public class linear_search(){
	public int search(int arr[], int search){
		for (int i=0;i<arr.length;i++){
			if (arr[i] == search){
				return search;
			}
		}
		return -1;
	}

	public static void main(String[] args){
		int arr[] = {12,434,453,453,34}
		linear_search(arr, 5);
	}
}