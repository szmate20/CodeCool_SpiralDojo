package spiralDojo;

import java.util.Arrays;

public class Spiral {
	Integer[][] array;
	
	public Integer[][] createSpiral(int N) {
		array = new Integer[N][N];
		if (!(N  < 1)) {
			int counter = 0;
			for (int i = 0; i < array.length; i++) {
				for (int j = 0; j < array[i].length; j++) {
					if (i == 0 && j < N) {
						counter++;
						array[i][j] = counter;
					}
					else if (i == N-1 && j < N)  {
						counter++;
						array[i][N-1] = counter - 1;
					}
					
				}
			}
		}
		return array;
	}
	
	public static void main(String[] args) {
		Spiral spiral = new Spiral();
		spiral.createSpiral(3);
		
		for (int i = 0; i < spiral.array.length; i++) {
			System.out.println(Arrays.toString(spiral.array[i]));
		}
	}
}
