import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     Scanner s= new Scanner (System.in);
      	 int x=s.nextInt();
         int sum=0;
        for(int y=0;y<=x;y++)
        {
         sum=sum+y;
        }
      System.out.println(sum);
	}
}