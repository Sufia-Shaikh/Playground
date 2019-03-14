import java.util.Scanner;
class Main
{
public static void main(String args[])
  {
    Scanner in= new Scanner(System.in);
    int n1= in.nextInt();
    int n2= in.nextInt();
    int ans= exp(n1,n2);
    System.out.println(ans);
  }
  public static int exp(int a, int b)
  {    
    int power=1;
    while(b>=1)
    {
      power=power*a;
      b--;
    }
    return power;
  }
   
    
  }
