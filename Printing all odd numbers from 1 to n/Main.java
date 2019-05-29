import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     Scanner i=new Scanner(System.in);
      	 int x,y;
      	 x=i.nextInt();
         for(y=1;y<=x;y++)
         {
           if(y%2==1)
             System.out.println(y);
         }
	}
}