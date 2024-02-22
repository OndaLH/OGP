package HZ1_JLearner;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class Arrays {
	//Declare a method that replaces each element in an array by its negation
	static int[] negation(int[] array){
		for(int index = 0; index < array.length; index++){
			array[index]  = -array[index] ;
			}
		return array;
		}
	
	//Declare a method that replaces each element in an array by its negation
	static int[] negation2(int[] array){
		  int[] negarray = new int[array.length];
		  for(int index = 0; index < array.length; index++){
		    negarray[index]  = -array[index] ;
		    }
		  return negarray;
		  }
	
	//Declare a method that counts the number of zeroes in a given array
	static int count(int[] haystack){
		  
		  int count = 0;
		  for(int index = 0; index < haystack.length; index++){
		    if (haystack[index] == 0)
		      count++;
		     }
		  return count;
		  } 
	
	public static void main(String[] args) {
		int[] numbers = {3, 13, 7, 2, 0};
		assertEquals(Arrays.count(numbers), 1);
		int[] numbers1 = {0, 0, 3, 13, 7, 2, 0};
		assert Arrays.count(numbers1) == 3;
		
	}
}
