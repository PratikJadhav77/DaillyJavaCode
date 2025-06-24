package ArraySort;

public class ArraySortWithoutinBuldMethod2 {
	public static void main(String[] args) {
		int[] Array = { 1, 3, 7, 930, 4 };

		int temp = 0;
		for (int i = 0; i < Array.length; i++) {
			for (int j = i + 1; j < Array.length; j++) {
				if (Array[i] > Array[j]) {
					temp = Array[i];
					Array[i] = Array[j];
					Array[j] = temp;
				}

			}

		}
		System.out.println();
		System.out.print("new Array=" + " ");
		for (int i = 0; i < Array.length; i++) {

			System.out.print(Array[i] + " ");

		}
	}
}
