// travelling salesman problem
import java.lang.Math; // Math functions
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class salesman{
	public static void main(String[] args){

	}

}

class Graph{
	Graph(int n){
		// constructor method
		int points = [1000][1000];
		int starting_vertex = n;
		File file = new File("cities25");
		Scanner myReader = new Scanner(file);
      	while (myReader.hasNextLine()) {
	        String data = myReader.nextLine();
	        points[]
		}
		int curr_cost = 0
		for (int i=0;i<starting_vertex;i++){

		}
		int perm = [1000]

	}

	float euclid(p,q){
		float x = p[0]-q[0];
		float y = p[1]-q[1];
		return Math.sqrt(x*x+y*y);
	}

	float tourValue(){
		int temp = starting_vertex;
		for (int i=0;i<temp;i++){
			curr_cost += euclid(points[starting_vertex], points[i]);
			temp = points[i];
		}
		curr_cost += euclid(points[starting_vertex], points[0]);
		return curr_cost;
	}

	boolean trySwap(i){
		return (euclid(perm[i]) < perm[(i+1)]);
	}
}