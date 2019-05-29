import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner i=new Scanner(System.in);
      int x,y=0,z=0;
      int sum=0;
      x=i.nextInt();
      y=x;
      z=x;
      
      while(y!=0)
      {
        y=y%10;
    
         sum=sum+y;
        y=z;
        y=y/10;
        z=y;
         }
      System.out.println(sum);
  
	}
}