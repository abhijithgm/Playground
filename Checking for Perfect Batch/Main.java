import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner n=new Scanner(System.in);
    int m=n.nextInt();
    int arr[]=new int[m];
    for(int i=0;i<=m-1;i++)
    {
      arr[i]=n.nextInt();
    }
  
       int isperfect=0;
       isperfect=func(arr,m);
    if(isperfect==0)
    {
      System.out.println("Perfect Batch");
    }
    else
    {
      System.out.println("Not a Perfect Batch");
    }
    
  }
  public static int func(int list[],int n)
  {
    int perfectbatch=0;
    for(int i=0;i<=n-1;i++)
    {
      if(i==n-2)
      {
        break;
      }
     else if((list[i]+list[i+1]+list[i+2])==n)
      {
        perfectbatch=1;
       
        
      }
    }
    return perfectbatch;
  }
  }
      