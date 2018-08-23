import java.util.Scanner;
public class PrimeNo{
	
	public static void main(String[] args){
		int n=0;
		int a,count = 0;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		for(int i = 1; i <= a; i++)
		{
			count = 0;
			for(int j = 1; j <= i; j++)
			{
				if(i % j == 0) count++;
			}
			if(count == 2)
			System.out.println(" "+i);
		}	
	}
}