import java.util.Scanner;
class Main{
	public static void main (String[] args){
      Scanner x=new Scanner(System.in);
      int n=x.nextInt();
	    int i, j;
    int count;
    count = n ;
    for(i=1; i<=count; i++)
    {
        for(j=1; j<=count; j++)
        {
            if(j==i || (j==count - i + 1))
            {
                System.out.print("*");
            }
            else
            {
                System.out.print(" ");
            }
        }

        System.out.print("\n");
	}
}
}