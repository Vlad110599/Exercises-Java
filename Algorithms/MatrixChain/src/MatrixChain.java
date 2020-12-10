
public class MatrixChain {

	public static int minim(int[] p, int[][] t){

		return multiply(p, t, 1, p.length-1);
	}

	
	public static int multiply(int[] p, int[][] t, int i, int j) {
		if(i == j) return 0;
		
		int minValue = multiply(p, t, i, i) + multiply(p, t, i+1, j) + p[i-1]*p[i]*p[j];
		t[i][j] = i;
		for(int k=i+1; k<j; k++){
			int temp = multiply(p, t, i, k) + multiply(p, t, k+1, j) + p[i-1]*p[k]*p[j];
			if(temp < minValue){
				minValue = temp;
				t[i][j] = k;
			}
		}
		return minValue;
	}

	public static int matrixChain(int[] p, int[][] t){

		int[][] a = new int[p.length][p.length];
		for(int i=0; i<p.length; i++){
			for(int j=0; j<p.length; j++){
				a[i][j] = -1;
				t[i][j] = -1;
			}
		}

		for(int i=0; i<a.length; i++) a[i][i] = 0;

		for(int r=2; r<p.length; r++){
			for(int i=1; i<=p.length-r; i++){
				int j = i + r - 1;
				a[i][j] = a[i+1][j] + p[i-1]*p[i]*p[j];
				t[i][j] = i;
				for(int k=i+1; k<j; k++){
					int temp = a[i][k] + a[k+1][j] + p[i-1]*p[k]*p[j];
					if(temp < a[i][j]){
						a[i][j] = temp;
						t[i][j] = k;
					}
				}
			}
		}
		return a[1][p.length-1];
	}

	public static void traceback(int i, int j, int[][] t){
		if(i == j)	return;

		traceback(i, t[i][j], t);
		traceback(t[i][j]+1, j, t);

		System.out.print(i + "," + t[i][j] + " si ");
		System.out.print(t[i][j]+1);
		System.out.print("," + j);
		System.out.println();
	}

	public static void main(String[] args) {
		
		int[] matrixChain = {30, 35, 15, 5, 10, 20, 25};
		int matrixLength = matrixChain.length - 1;
		int[][] traceMatrix = new int[matrixLength+1][matrixLength+1];

		System.out.println("Matrice: ");
		System.out.print(matrixChain[0] + "×" + matrixChain[1]);
		for(int i=2; i<=matrixLength; i++){
			System.out.print("," + matrixChain[i-1] + "×" + matrixChain[i]);
		}
		System.out.println();
		int min = minim(matrixChain, traceMatrix);
		System.out.println("Inmultire minim: " + min);

		traceback(1, matrixLength, traceMatrix);
	}
	
}
