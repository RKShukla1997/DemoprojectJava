import java.util.Scanner;
import java.lang.Math;
public class ArmstrongNo{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n;
		int count=0;
		int a,b,c=0;
		
		System.out.println("Enter the no to check for Armstrong no");
		n=sc.nextInt();
		int d=n;
		while(n!=0){
			count++;
			n=n/10;
		}
		n=d;
		while(n!=0){
			a=n%10;
			b=(int)Math.pow(a,count);
			c=c+b;
			n=n/10;
		}
		
		if(d==c){
		System.out.println("Entered No is a Armstrong No");	
		}
		else{
			System.out.println("Entered No is not a Armstrong No");
		}
		
	}
}
