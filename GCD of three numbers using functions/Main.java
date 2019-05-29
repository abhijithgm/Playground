import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
      Scanner x=new Scanner(System.in);
      int a=x.nextInt();
      int b=x.nextInt();
      int c=x.nextInt();
      int num3;
      int  numerator ;
        int denominator;
      int remainder;
        num3 =gcd(a,b);
      if (num3 > c)
    {
        numerator = num3;
         denominator = c;
    }
    else
    {
         numerator = c;
         denominator = num3 ;
    }
    remainder = numerator % denominator;
    while (remainder != 0)
    {
        numerator   = denominator;
        denominator = remainder;
        remainder   = numerator % denominator;
    }
    int gcd1 = denominator;
    System.out.println(gcd1);
	    
	}
  public static int gcd(int num1,int num2)
  {
     int  numerator ;
        int denominator ;
    int gcd1,remainder;
     if (num1 > num2)
    {
         numerator = num1;
         denominator = num2;
    }
    else
    {
         numerator = num2;
         denominator = num1;
    }
   remainder = numerator % denominator;
    while (remainder != 0)
    {
        numerator   = denominator;
        denominator = remainder;
        remainder   = numerator % denominator;
    }
    gcd1 = denominator;
    return (gcd1);
  }
}