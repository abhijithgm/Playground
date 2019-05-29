import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner n=new Scanner(System.in);
    int m=n.nextInt();
    int arr[]=new int[m];
    int largest=0;
    int index=0;
    for(int j=0;j<=m-1;j++)
    {
      arr[j]=n.nextInt();
    }
    for(int i=0;i<=m-1;i++)
    {
      if(arr[i]>=largest)
      {
        largest=arr[i];
        index=i;
      }
    }
    System.out.println(index);
      
      
  }
}