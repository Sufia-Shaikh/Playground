import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
       Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
	    for(int row = 1; row <= n; row++)
	    {
            // Handle numbers for each row
	        for(int col = 1; col <= n; col++)
	        {
                // Condition to print numbers
	            if(((row % 2 == 0) && (col == 1)) 
	                || ((row % 2 == 1) && (col == n)))
	            {
	                System.out.print(row + 1);
	            }
	            else{
	                System.out.print(row);
	            }
	        }
	        System.out.println();
	    }
	}
}





