import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   Scanner n=new Scanner(System.in);
    int x=n.nextInt();
    for(int i=1;i<=x;i++)
    {
      System.out.print(i);
      if(i%3==0)
      {
        System.out.print(",");
      }
    }
  }
}

