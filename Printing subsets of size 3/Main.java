import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       // Type your code here
      Scanner in = new Scanner(System.in);
      int arr_size= in.nextInt();
      int arr[]= new int[arr_size];
      for(int i=0; i<arr_size; i++)
      {
        arr[i]= in.nextInt();
      }
      sub(arr_size,arr);
    }
  
  public static void sub(int arr_size, int arr[])
  {
    for(int i1=0; i1<=arr_size-2; i1++)
    {
      for(int i2=i1+1; i2<arr_size; i2++)
      {
        for(int i3=i2+1; i3<arr_size; i3++)
        {
          System.out.print("("+arr[i1]+ ","+ " "+arr[i2]+","+" "+arr[i3]+")"+" ");
        }
        
      }
      System.out.println();
    }
    }
}





