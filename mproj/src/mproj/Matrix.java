package mproj;


public class Matrix {
private double [][] arr;
private int num;

	public int num() {
		return num;
	}
	
	public Matrix(int n, int t) {
		arr = new double[n][t];
		for (int i = 0; i <= n-1; i++) {
			for (int j = 0; j <= t-1; j++) {
				arr[i][j] = 0;
			}
		}
	}
	public double re(int a, int b) {
		return this.arr[a][b];
	}
	public Matrix(double [][] aq) {
		arr = aq;
	}
	public double[][] Testing(Matrix m2) {
		double[][] asdf = new double[arr.length][arr[0].length];
		for (int i = 0; i <= arr.length - 1; i++) {
			for (int j = 0; j <= arr[0].length - 1; j++) {
				asdf[i][j] = arr[i][j] + m2.re(i, j);
			}
		}
		
		return asdf;
	}
	public void set(int i, int j, double k) {
		arr[i][j] = k;
	}
	public String tostring() {
		String s = "";
		
		for (int i = 0; i <= arr.length - 1; i++) {
			for (int j = 0; j <= arr[0].length - 1; j++) {
				s += Double.toString(arr[i][j]) + " ";
			
			s += "\n";
		}
		}
		return s;
	
}
	public int getColumns(){
        return arr[0].length;
    }
	public Object[] c(){
        Object[] columnNames = new Object[getColumns()];

        for (int i = 0; i < columnNames.length; i++){
            columnNames[i] = i + 1;
        }
        return columnNames;
    }

	public double[][] getMatrix() {
        return arr;
    }
	public Object[][] g() {
		Object[][] objectArray = new Object[getMatrix().length][getMatrix()[0].length];

        for(int i = 0; i < getMatrix().length; i++)
        {
            for(int j = 0; j < getMatrix()[0].length; j++)
                objectArray[i][j] = (Object) getMatrix()[i][j];
        }
        return objectArray;
	}
}
