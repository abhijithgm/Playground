import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner n= new Scanner(System.in);
      int x=n.nextInt();
      int y=n.nextInt();
      int d; 
        d= prime(x,y);
      System.out.print(d);
	}
  public static int prime(int z,int a)
  {
    int constant_base=z;
    for(;a!=1;a--)
    {
      z=z*constant_base;
      
    }
    return (z);
  }
    
 }
