package HZ4en5_Matrix;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;


class MatrixTest {
	Matrix matrix;
	
	@BeforeEach
	void initMatrix() {
		double[] data = {1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0};
		matrix = new Matrix(3,3, data);
		/**[1.0  2.0  3.0]
		 * [4.0  5.0  6.0]
		 * [7.0  8.0  9.0]
		 */
	}
	
	@Test
	void getRowsTest() {
		assertEquals(matrix.getRows(),3);	
	}
	
	@Test
	void getColsTest() {
		assertEquals(matrix.getCols(),3);
	}
	
	@Test
	void getElementTest() {
		assertEquals(matrix.getElement(0, 0),1);
		assertEquals(matrix.getElement(1, 1),5);
		assertEquals(matrix.getElement(2, 2),9);
	}
	
	@Test
	void rowMajorOrderTest() {
		double[] result = {1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0};
		double[] rowmajor = matrix.rowMajorOrder();
		for(int i=0; i<9;i++) {
			assertEquals(rowmajor[i],result[i]);
		}
	}
	
	@Test
	void colMajorOrderTest() {
		double[] result = {1.0,4.0,7.0,2.0,5.0,8.0,3.0,6.0,9.0,};
		double[] rowmajor = matrix.colMajorOrder();
		for(int i=0; i<9;i++) {
			assertEquals(rowmajor[i],result[i]);
		}
	}
	
	@Test
	void rowArrayTest() {
        double[][] result = {{1.0, 2.0, 3.0}, {4.0, 5.0, 6.0}, {7.0, 8.0, 9.0}};
        double[][] rowArray = matrix.rowArray();

        for (int i = 0; i < matrix.getRows(); i++) {
            for (int j = 0; j < matrix.getCols(); j++) {
                assertEquals(result[i][j], rowArray[i][j]);
            }
        }
    }

}
