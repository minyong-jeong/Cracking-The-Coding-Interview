/*
 * Question 1.6
 */

public class MatrixRotation {
	public static boolean rotate(int[][] arr) {
		if (arr.length == 0 || arr.length != arr[0].length) {
			return false;
		}
		
		int n = arr.length;
		for (int layer = 0; layer < n / 2; layer++) {
			int first = layer;
			int last = n - 1 - layer;
			for (int i = first; i < last; i++) {
				int offset = i - first;
				int top = arr[first][i];
				arr[first][i] = arr[last-offset][first]; 			// left -> top
				arr[last-offset][first] = arr[last][last-offset]; 	// bottom -> left
				arr[last][last-offset] = arr[i][last]; 				// right -> bottom
				arr[i][last] = top; 								// top -> right
			}
		}
		
		return true;
	}
	
	public static void printArray(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		int[][] arr = new int[][]{
			{1, 2, 3, 4},
			{5, 6, 7, 8},
			{9, 10, 11, 12},
			{13, 14, 15, 16}
		};
		
		int[][] arr2 = new int[][]{
			{1, 2, 3, 4, 5},
			{6, 7, 8, 9, 10},
			{11, 12, 13, 14, 15},
			{16, 17, 18, 19, 20},
			{17, 18, 19, 20, 21}
		};
		
		if (rotate(arr)) printArray(arr);
		System.out.println();
		if (rotate(arr2)) printArray(arr2);
	}
}
