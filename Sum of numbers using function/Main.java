import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n= in.nextInt();
      System.out.println(summ(n));
	}
  public static int summ(int a)
  {
    int sum1=0;
    for(int i=1; i<=a; i++)
  {
      sum1=sum1+i;
    }
    return sum1;
  }
}