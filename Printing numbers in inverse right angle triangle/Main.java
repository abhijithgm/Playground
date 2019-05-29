import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner x= new Scanner(System.in);
      int n=x.nextInt();
      int num=n;
      for(int row_no=1;row_no<=n;row_no++)
      {
        
        
        
       int num2=num;
        for(int col_no=1;col_no<=num;col_no++)
        {
          
          System.out.print(num2);
         num2--;
          
        }
        num--;
        System.out.print("\n");
        }
      }
	}
