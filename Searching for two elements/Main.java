import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner n=new Scanner(System.in);
         int x=n.nextInt();
      int arr[]=new int[x];
      int element_1_index=-1;
      int element_2_index=-1;
      for(int l=0;l<=x-1;l++)
      {
        arr[l]=n.nextInt();
      }
      int k=n.nextInt();
      int m=n.nextInt();
      for(int l=0;l<=x-1;l++)
      {
        if(k==arr[l])
        {
          element_1_index=l;
        }
     
        if(m==arr[l])
        {
          element_2_index=l;
        }
      }
      
      System.out.println(element_1_index);
      System.out.println(element_2_index);
        
    }
}