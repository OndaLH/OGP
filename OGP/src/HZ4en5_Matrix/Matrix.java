package HZ4en5_Matrix;

public class Matrix {
	private int rows;
    private int cols;
    private double[][] matrix;
	
    /**
     * Makes a matrix with 'rows' rows and 'cols' cols, fills it with the elements in data
     * 
     * @pre Rows and cols must be larger or equals to zero
     * 		| rows>= 0 && cols >= 0
     * @pre Data must contain as many elements as the resultant matrix can fit
     * 		|data.length == rows*cols
     */
	public Matrix(int rows, int cols, double[] data) {
		this.rows = rows;
        this.cols = cols;
        this.matrix = new double[rows][cols];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
               matrix[i][j] = data[i * cols + j];
            }
        }
	}
	
	/**
	 * Returns the amount of rows in the matrix
	 * 
	 * @return rows
	 */
	public int getRows() {
        return rows;
    }

	/**
	 * Returns the amount of columns in the matrix
	 * 
	 * @return cols
	 */
    public int getCols() {
        return cols;
    }

	/**
	 * Returns the element at index '[row][col]' in the matrix
	 * 
	 * @pre [row][col] must be defined in the matrix
	 * 		|row <= getRows() && col <= getCols()
	 */
    public double getElement(int row, int col) {
        return matrix[row][col];
    }
    
	/**
	 * Returns all elements in the matrix (line by line)
	 * 
	 * @post result must contain as many elements as the matrix
	 * 		|result.length == getCols()*getRows()
	 */
    public double[] rowMajorOrder() {
    	double[] result = new double[cols*rows];
    	for(int i=0; i<cols;i++) {
    		for(int j=0; j<rows;j++) {
    			result[i*cols +j] = matrix[i][j];
    		}
    	}
    	return result;
    }
    
	/**
	 * Returns all elements in the matrix (column by column)
	 * 
	 * @post result must contain as many elements as the matrix
	 * 		|result.length == getCols()*getRows()
	 */
    public double[] colMajorOrder() {
    	double[] result = new double[cols*rows];
    	for(int i=0; i<rows;i++) {
    		for(int j=0; j<cols;j++) {
    			result[j*rows + i] = matrix[i][j];
    		}
    	}
    	return result;
    }
    
	/**
	 * Returns all elements in the matrix (With each row as an array)
	 */
    public double[][] rowArray() {
    	double[][] result = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            System.arraycopy(matrix[i], 0, result[i], 0, cols);
        }
        return result;
    }
    
  
}
