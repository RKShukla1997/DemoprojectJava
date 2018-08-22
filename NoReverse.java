import java.util.Scanner;
public class NoReverse{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n;
		int a=0,b=0;
		n = sc.nextInt();
		while(n!=0){
			a=n%10;
			b=((b*10)+a);
			n=n/10;
		}
		System.out.println(""+b);
	}
}