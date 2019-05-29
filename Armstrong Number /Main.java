import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner n= new Scanner(System.in);
      	int x=n.nextInt();
        int count=0;
      int store=x,z,i,sum=0,a;
    while(x!=0)
    {
      x=x/10;
      count++;
    }
      x=store;
      
      while(x!=0)
      {
        z=x;
        x=x%10;
        a=1;
     for(i=0;i<count;i++)
     {
      a=a*x;
     }
        sum=sum+a;
        z=z/10;
        x=z;
      }
      if(sum==store)
      System.out.println("Armstrong Number");
         else
         System.out.println("Not a Armstrong Number");
}
}