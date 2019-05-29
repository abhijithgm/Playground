import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner n= new Scanner(System.in);
      	int x=n.nextInt();
      int i;
     for(i=1;i<=x;++i)
     {
       if(x%i==0)
       {
         System.out.println(i);
       }
     }
}
}