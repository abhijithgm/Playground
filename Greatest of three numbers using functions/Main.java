import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner x=new Scanner(System.in);
      int a=x.nextInt();
      int b=x.nextInt();
      int c=x.nextInt();
      a=greatest(a,b);
      if(a>c)
      {
        System.out.println(a);
	}
      else
         System.out.println(c);
        
}
  public static int greatest(int d,int c)
  {
     if(d>c)
      {
        return(d);
	}
      else
         return(c);
  }
}