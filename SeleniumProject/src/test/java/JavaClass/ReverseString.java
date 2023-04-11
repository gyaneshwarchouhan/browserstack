package JavaClass;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Automation";
		String rev = "";
		char ch[]= str.toCharArray();
		for(int i=ch.length-1;i>=0;i--)	{
			rev+=ch[i];
			
		}
		System.out.println(rev);
		}

}
