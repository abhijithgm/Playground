import java.util.Scanner;
class Main { 
	public static void main(String[] args){
  		Scanner in = new Scanner(System.in);
  		int n=in.nextInt();
        int m=0,num=0;
         for(int cur_row=0;cur_row<n;cur_row++)
         {
           for(int cur_col=0;cur_col<=cur_row;cur_col++)
           {
             if(num%2==0)
             {
               System.out.print("*");
             }
             else
             {
               System.out.print("#");
             }
          
             num=num+1;
           }
             System.out.print("\n");
         }
             
      
    }
}