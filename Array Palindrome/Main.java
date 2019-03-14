import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner in= new Scanner(System.in);
      int arr_size= in.nextInt();
      int arr[]= new int[arr_size];
      for(int i=0; i<=(arr_size-1);i++)
      {
        arr[i]= in.nextInt();
      }
      if(palin(arr,0, arr_size-1)==1)
      System.out.print("Yes");
      else 
        System.out.print("No");
      
    }
  public static int palin(int arr[], int begin, int end)
  {
    if(begin>=end)
    {
      return 1;
    }
    if(arr[begin]== arr[end])
    {
      return palin(arr, begin+1, end-1);
    }
    else
    {
      return 0;
    }
  }
}