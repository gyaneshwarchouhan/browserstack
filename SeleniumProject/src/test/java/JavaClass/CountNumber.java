package JavaClass;

public class CountNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int num =  222676862;
		int count =0;
		while(num!=0) {
			num=num/10;
			count++;
		}
		
		System.out.println("number count...=="  + count);
	}

}
