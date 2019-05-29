import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner n= new Scanner(System.in);
      	int x=n.nextInt();
      int i,Product=1;
     for(i=1;i<=x;++i)
     {
      Product=Product*i;
     }
      System.out.println(Product);
}
}