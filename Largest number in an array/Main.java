import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner n=new Scanner(System.in);
         int x=n.nextInt();
      int arr[]=new int[x];
      int largest=0;
      for(int l=0;l<=x-1;l++)
      {
        arr[l]=n.nextInt();
      }
      
      for(int l=0;l<=x-1;l++)
      {
        if(largest<=arr[l])
        {
          largest=arr[l];
        }
     
      }
      
      System.out.println(largest);
        
    }
}