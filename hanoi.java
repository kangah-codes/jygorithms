public class hanoi{
	static int steps = 0;
	static void Hanoi(int n, int start, int end) 
    { 
        if (n == 1) 
        { 
            System.out.println("Move disk 1 from " +  start + " to " + end); 
            return; 
        }
        Hanoi(n-1, start, 6-start-end); 
        System.out.println("Move disk " + n + " from " +  start + " to " + end); 
        Hanoi(n-1, 6-start-end, end); 
        steps++;
    } 
      
    //  Driver method 
    public static void main(String args[]) 
    { 
        int n = 20; // Number of disks 
        Hanoi(n, 1, 3);
        System.out.println("Completed in " + steps + " moves");
    } 
}