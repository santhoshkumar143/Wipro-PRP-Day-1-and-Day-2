import java.util.Scanner;
public class Fl5 {

	public static void main(String[] args) {
		long n,sum;
 	    Scanner s=new Scanner(System.in);
 	    System.out.println("Enter a number ");
 	    n=s.nextLong();
 	    for(sum=0 ;n!=0 ;n/=10)
 	    {
 	    	sum+=n%10;
 	    }
 	    System.out.println(sum); 
	}
}