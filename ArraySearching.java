import java.util.Scanner;
public class ArraySearching{
	
	public static void main(String[] args){
	
	Scanner	sc = new Scanner(System.in);
	int x[] = new int[7];
	int i;
	int a;
	
	x[0] = 1;
	x[1] = 4;
	x[2] = 6;
	x[3] = 7;
	x[4] = 8;
	x[5] = 9;
	x[6] = 10;
	
	System.out.println("Enter the no to search");
	a = sc.nextInt();
	for(i=0;i<7;i++){
		if(x[i]==a){
			System.out.println("Number found");
			}
																																																																																																								}
}
}