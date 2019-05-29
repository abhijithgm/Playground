import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	
      
      Scanner n=new Scanner(System.in);
      int y=n.nextInt();
      System.out.println(square_num(y));
}
   public static int square_num(int x)
     {
       return (x*x);
	} 
}