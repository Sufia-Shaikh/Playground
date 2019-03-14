import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	 // Type your code here   
      Scanner in =  new Scanner(System.in);
      int n= in.nextInt();
      int sod= square(n);
      n=sod;
      System.out.println(n);
	} 
  public static int square(int m)
  {
   int sqr= m*m;
    return sqr;
  }

}