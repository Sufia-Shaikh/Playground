import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner scan= new Scanner(System.in);
      String  str= scan.nextLine();
      StringBuilder sb= new StringBuilder(str);
      int str_len= sb.length();
      int front=0;
      int end= str_len-1;
      boolean palin=true;
      while(front<end)
      {
        if(sb.charAt(front) != sb.charAt(end))
        {
          palin= false;
          break;
        }
        front++;
        end--;
      }
      
      
      if(palin==true)
      {
        System.out.println("Yes");
      }
      else
        System.out.println("No");
      }
        
    } 
