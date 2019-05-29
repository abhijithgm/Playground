import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner i=new Scanner(System.in);
      int x,y=0,z=0;
      int count=0,temp=1;
      x=i.nextInt();
      y=x;
      z=x;
      while(x>0)
      {
        x=x/10;
        count++;
      }
      while(count!=0)
      {
        temp=temp*10;
        count--;
      }
      temp=temp/10;
      y=y/temp;
      z=z%10;
      System.out.println(z+y);
	}
}