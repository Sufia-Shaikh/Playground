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
      
      int mis=0;
      for(int i=0;i<arr_size;i++)
      {
        int a= arr[++i];
        int b= arr[i] + 1;
         if(a!=b)
         {
         mis=b;
           break;
         }
      }
      System.out.print(mis);
    }
}
     