public class Sort{
	
	public static void main(String[] args){
	int x[] = new int[8];
	x[0]=1;
	x[1]=1;
	x[2]=1;
	x[3]=1;
	x[4]=0;
	x[5]=0;
	x[6]=1;
	x[7]=0;
	int i,j;
	int temp =0;
	for(i=0;i<8;i++){
		for(j=i+1;j<8;j++){
		if(x[i]>x[j]){
			temp=x[i];
			x[i] = x[j];
			x[j]=temp;
		}		
		}
	}
	for(i=0;i<8;i++){
	System.out.println(""+x[i]);
	}
	}
}