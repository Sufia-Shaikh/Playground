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
      int val= in.nextInt();
      pair(arr_size,arr,val);
    }
  
  public static void pair(int arr_size, int arr[], int val)
  {
    for(int i1=0; i1<arr_size; i1++)
    {
      for(int i2= i1 + 1; i2<arr_size; i2++)
      {
        if(arr[i1]+arr[i2]==val)
        {
          System.out.print(arr[i1] + "," + " " + arr[i2]);   
          System.out.println();
        } 
      }  
    }
  }
    }

    