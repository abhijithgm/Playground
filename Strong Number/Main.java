import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner n= new Scanner(System.in);
      	int y=n.nextInt();
      int i,Product=1,z,Sum=0;
      int store=y;
      while(y!=0)
      {
        z=y;
        y=y%10;
     for(i=1;i<=y;++i)
     {
      Product=Product*i;
     }
      Sum=Sum+Product;
        Product=1;
        y=z;
        y=y/10;
      }
      if(store==Sum)
      System.out.println("Yes");
      else
        System.out.println("No");
      
}
}