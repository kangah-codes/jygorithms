import java.lang.Math; 

public class jump_search(){
	public int search(int arr[], int search){
		int n = arr.length;
		int jump = Math.sqrt(n);

		while (arr[Math.min(jump, n)-1] < search){
			prev = jump;
			jump += Math.sqrt(n);
			if (prev >= n){
				return -1;
			}
		}

		while (arr[prev] < search){
			prev += 1;
			if (prev == Math.min(jump, n)){
				return -1;
			}
		}

		if (arr[prev] == search){
			return arr[prev];
		}
	}

	public static void main(String args[]){
		int arr[] = {1,2,3,4,5,6};

		System.out.println(search(arr, 5));
	}
}