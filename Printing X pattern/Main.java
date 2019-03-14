import java.util.Scanner;
class Main {
	public static void main (String[] args){
        // Type your code here
      Scanner in  = new Scanner(System.in);
	    int n = in.nextInt();
 
	    for(int row = 1; row <= n; ++row)
	    {
             // Handle stars for each row
	         for(int col = 1; col <= n; ++col)
	         {
                
	                // When row no and col no are equal, print "*"
                    // Otherwise print space
	                if((row == col) ||
	                  (row + col == n + 1))
	                {
	                    System.out.print("*");
	                }
                    
	                else
	                {
	                    System.out.print(" ");
	                }
	         }
	         System.out.println();
	    }
	}
}
