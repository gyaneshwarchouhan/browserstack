package JavaClass;

public class ArrayList {
	// maximum value find

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 12, 56, 89, 66 };
		int max = 0;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] > arr[j])
					max = arr[i];
			}
		}

		System.out.println(max);

	}

}
