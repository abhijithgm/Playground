import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     Scanner s= new Scanner (System.in);
      	 int x=s.nextInt();
        for(int y=0;y<=2*x;y++)
        {
          if(y%2==1)
            System.out.println(y);
        }
	}
}