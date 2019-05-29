import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		Scanner n = new Scanner(System.in);
      int x=n.nextInt();
      int y=n.nextInt();
      int z=n.nextInt();
      if(x>y && x>z)
      {
        System.out.print(x);
      }
      else if(y>x && y>z)
      {
        System.out.print(y);
      }
      else
      {
        System.out.print(z);
      }
      
    }
}