package JavaClass;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int no = 7;
int num =0;
for(int i=2; i<no-1;i++) {
	if(no%i==0) {
		num=num+1;
	}
}
System.out.println("prime number"  +no);
	}

}
