package HZ1_JLearner;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class Methods {
	//Declare a method that computes the average (rounded toward zero) between two given integers 
	//(Note: in Java, if x and y are of type int, x / y is the quotient of x and y, rounded toward zero.)
	static int average(int x, int y){
		  int z = (x + y)/2;
		  return z;
		  }

	//Declare a method that computes x to the power of y, for nonnegative y (iterative implementation)
	static int powerite(int x, int y){
		  int result = x;
		  for(int i = 1; y>i; i++){
		      result = result * x;
		    }
		  return result;
		  }
	
	// Declare a method that computes x to the power of y, for nonnegative y (recursive implementation)
	static int powerrec(int x, int y) {
		  if (y == 0) {
		    return 1;
		  } else {
		    return x * powerrec(x, y - 1);
		  }
		}
	
	// Declare a method that computes the square root (rounded down) of a given nonnegative integer. 
	//(Find the largest integer whose square is not greater than the given number.)
	static int root(int x){
		  int result = 0;
		  for(int i=0;x>i;i++)
		    if(i*i <= x)
		      result = i;
		  return result;  
		}
	
	
	public static void main(String[] args) {
			assertEquals (Methods.average(3,3),3);
			assert Methods.average(2,4) == 3;
			assert Methods.average(5,1) == 3;
			
			//System.out.println(Methods.powerite(2, 3));
			assert Methods.powerite(2,3) == 8;
			//System.out.println(Methods.powerite(2, 4));
			assert Methods.powerite(2,4) == 16;
			//System.out.println(Methods.powerite(5, 1));
			//System.out.println(Methods.powerite(5, 2));
			assert Methods.powerite(5,2) == 25;
			
			assert Methods.powerrec(2,3) == 8;
			assert Methods.powerrec(2,4) == 16;
			assert Methods.powerrec(5,2) == 25;
			
			assert Methods.root(9) == 3;
			assert Methods.root(16) == 4;
			assert Methods.root(25) == 5;
		}

}

