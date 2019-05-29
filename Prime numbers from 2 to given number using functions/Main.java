import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner n= new Scanner(System.in);
      int x=n.nextInt();
      prime(x);
	}
  public static void prime(int y)
  {
    for(int j=2;j<=y;j++)
    {
       int flag=0;
         for(int i=2;i<=j/2;i++)
         {
           if(j%i==0)
           {
             flag=1;
             break;
           }
         }
      if(flag==0)
      {
        System.out.println(j);
      }
    }
}
}