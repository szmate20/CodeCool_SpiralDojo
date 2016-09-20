package spiralDojo;

import java.util.Arrays;

public class Spiral {
	Integer[][] array;
	
	public void createSpiral(int N) {
		array = new Integer[N][N];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (i == 0 && j < N) {
					array[i][j] = j + 1;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Spiral spiral = new Spiral();
		spiral.createSpiral(5);
		
		for (int i = 0; i < spiral.array.length; i++) {
			System.out.println(Arrays.toString(spiral.array[i]));
		}
	}
}
