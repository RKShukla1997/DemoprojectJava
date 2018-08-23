import java.util.Scanner;
public class EvenNo{
	
	public static void main(String[] args){
		//int n=0;
		int a,count = 0;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		for(int i = 1; i <= a; i++)
		{
			if(i%2==0){
				System.out.println(""+i);
			}
		}	
	}
}