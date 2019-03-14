import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
       Scanner scan= new Scanner(System.in);
      String  str= scan.nextLine();
     
      StringBuilder sb= new StringBuilder(str);
      int str_len= sb.length();
     reverse_string(sb,0,str_len-1);
      int start=0;
      for(int i=0; i<str_len; i++)
      {
        if(sb.charAt(i) == ' ' )
        {
          reverse_string(sb, start, i-1);
          start= i+1;
        }
        else if(i ==(str_len-1))
        {
          reverse_string(sb, start, i);
          start= i+1;
        }
      }
      System.out.print(sb);
    }
    
    // Function to reverse a string
    public static void reverse_string(StringBuilder sb, int start, int end_i)
    {
        // Type your code here
      int end= end_i;
      int front= start;
      while(front< end)
      {
        char temp= sb.charAt(front);
        sb.setCharAt(front,sb.charAt(end));
        sb.setCharAt(end, temp);
        front++;
        end--;
      }
    }
    }
    
