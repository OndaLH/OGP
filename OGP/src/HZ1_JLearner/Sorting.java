package HZ1_JLearner;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.util.Arrays;

public class Sorting {
	public static class Checks {
		//Declare a method isSorted such that isSorted(array) returns true if and only if the values stored in array are stored in ascending order, i.e. for any two indices I and J, if I < J then array[I] <= array[j].
		static boolean isSorted(int [] array) {
			for(int index = 0; index < array.length-1; index++){
				if(array[index] > array[index+1]) {
					return false;
				}
			}
			return true; 
		}
		//Declare a method that counts the number of occurrences of a given value in a given array.
		static int count(int[] array, int value){
			int count = 0;
			for(int index = 0; index < array.length; index++){
				if (array[index] == value)
					count++;
			}
			return count;
		}
		//Declare a method that returns whether an array is a permutation of another array. This is the case if the arrays have the same length and for each element of the first array, 
		//the number of occurrences of that element in the first array equals the number of occurrences of that element in the second array.
		static boolean permutation(int[] array1, int[] array2){
			if (array1.length != array2.length) {
				return false;
			}
			for (int value : array1) {
				if (count(array1, value) != count(array2, value)) {
					return false;
				}
			}
			return true;
		}
		//Declare a method that returns whether an array is a sorted version of another array.
		static boolean sortedversion(int[] array1, int[] array2){
			if(permutation(array1,array2) != true) {
				return false;
			}
			if(isSorted(array2) != true) {
				return false;
			}
			return true;
		}
	}
	
	
	public static class InsertionSort {
	    //Declare a method insert such that insert(array, n, v) inserts value v into the sorted sequence of values stored at indices 0 (inclusive) through n (exclusive) of array, such that afterwards, 
		//the sequence of values stored at indices 0 (inclusive) through n + 1 (exclusive) is sorted. You will need to shift the elements of the sequence that are greater than v one position to the right. 
		//You may assume that the given array has length n + 1 or greater.
		static void insert(int[] array, int n, int v) {
			int index = n - 1;
			  for (; index >= 0 && array[index] > v; index--) {
			    array[index + 1] = array[index];
			  }
			  array[index + 1] = v;
		}
	    //Declare a method insertionSort such that insertionSort(array) replaces the sequence of values stored in array with a sorted version of that sequence. 
		//Hint: first use insert to insert the second element into the sequence at indices 0 (inclusive) through 1 (exclusive). Then use insert to insert the third element into the sequence at indices 0 (inclusive) through 2 (exclusive). 
		//And so on.
		static void insertionSort(int[] array) {
			  for (int index = 1; index < array.length; index++) {
			    insert(array, index, array[index]);
			  }
			}
	}
	
	
	public static class SelectionSort {
	    // Declare a method removeGreatest such that removeGreatest(array, n) returns the greatest element of the sequence of values stored at indices 0 (inclusive) through n (exclusive) in array, and removes one occurrence of that element from the sequence.
	    // You will need to shift the elements that appear after the removed element to the left by one position.
	    public static int removeGreatest(int[] array, int n) {
	        int greatest = array[0];
	        int pos = 0;

	        for (int i = 1; i < n; i++) {
	            if (array[i] > greatest) {
	                greatest = array[i];
	                pos = i;
	            }
	        }

	        for (int i = pos; i < n - 1; i++) {
	            array[i] = array[i + 1];
	        }

	        return greatest;
	    }

	    // Declare a method selectionSort such that selectionSort(array) replaces the sequence of values stored in array with a sorted version of that sequence.
	    // Hint: first use removeGreatest to remove the greatest element of the sequence and then put that element in the last position.
	    // Then use removeGreatest to remove the greatest element of the remaining sequence and then put that element in the one-but-last position. And so on.
	    static void selectionSort(int[] array) {
	        for (int i = array.length; i > 0; i--) {
	            int greatest = removeGreatest(array, i);
	            array[i - 1] = greatest;
	        }
	    }
	}

	public static class MergeSort {
	   // Declare a method merge such that merge(array1, array2) returns an array that satisfies the following properties:
	       // for each value V, the number of occurrences of V in the result array equals the number of occurrences of V in array1 plus the number of occurrences of V in array2
	        //if array1 and array2 are sorted (i.e. the elements in the array are stored in ascending order), then the result array is sorted as well.
		static int[] merge(int[] array1, int[] array2) {
	        int[] result = new int[array1.length + array2.length];
	        int great = SelectionSort.removeGreatest(array1, array1.length);
	        if(SelectionSort.removeGreatest(array2, array2.length) > great) {
	        	great = SelectionSort.removeGreatest(array1, array1.length);
	        }
	        int a = 0;
	        for(int i=0; i < great; i++) {
	        	for(int j=0; j <= array1.length;j++) {
	        		if(array1[j]==i) {
	        			result[a] = array1[j];
	        			a++;
	        		}
	        	}
	        	for(int j=0; j <= array1.length;j++) {
	        		if(array2[j]==i) {
	        			result[a] = array2[j];
	        			a++;
	        		}
	        	}
	        }
	        return result;
		}
		
	    //Declare a method subarray such that subarray(array, a, b) returns an array of length b - a that contains the elements at indices a (inclusive) through b (exclusive) of array.
		
	    //Declare a method mergeSort such that mergeSort(array) returns a new array that stores the sequence of values obtained by sorting the sequence of values stored in array. Hint: if the length of the array is 0 or 1, just return a copy of the array. 
		//Otherwise, use subarray to get the two halves of array, sort them using a recursive call of mergeSort, and then merge them using merge.

	}
	public static class HeapSort {
		//Declare a method heapAdd(array, n) that adds the element at index n to the heap at indices 0 (inclusive) through n (exclusive), using the sift up algorithm.
		
		//Declare a method heapRemove(array, n) that removes the root element (i.e. the greatest element) of the heap at indices 0 (inclusive) through n (exclusive) and returns its value.
		
		//Declare a method heapSort such that heapSort(array) sorts array using this heap sort algorithm.

	}
	public static class SearchTree {
	    //Declare a class TreeNode that represents a node in a search tree. Each node stores a reference to its first child node (or null if it has no children), its next sibling node (or null if it has no further siblings), and its value. 
		//The children of a node are the first child and the first child's siblings.
		
	    //Declare a method that counts the number of children of a given node.
		
	    //Declare a method that returns an array containing the sequence of children of a given node.
	    //A node is called a leaf if it has no children. Declare a method that counts the number of descendants of a given node that are leaves. (Hint: use recursion.)
		
	    //Declare a method addLeafValues(node, array, i) that writes the values of the descendants of node that are leaves into array starting at index i and returns the number of values written. (Hint: use recursion.)
		
	    //Declare a method that returns an array containing the values of the descendants of a given node that are leaves. One can think of the tree rooted in the given node as storing this set of values.
		
	    //Declare a method that checks that the values of all descendants of a given node that are leaves are less than or equal to a given value.
		
	    //Declare a method that checks that for each descendant D of a given node that has a next sibling, the values of the descendants of D that are leaves are less than or equal to the value of D. In this case, we say the tree is valid. 
		//We say a node is an interior node if it is not a leaf. The value of an interior node that has a next sibling serves as an upper bound on the values stored by the tree rooted in that node. 
		//(The value of an interior node that does not have a next sibling has no meaning.)
		
	    //A sequence of trees is called a forest. The sequence of the children of a given node is, in particular, a forest. 
		//Declare a method that returns whether a given value is the value of a leaf in the forest rooted at a given node. Use the values of the interior nodes for performance. Specifically:
	        //If the given node is a null reference, return false.
	        //If the given node is a leaf:
	            //If the given value is less than the node's value, return false.
	            //If the given value equals the node's value, return true.
	            //If the given value is greater than the node's value, recursively check the node's next sibling.
	        //If the given node is not a leaf:
	            //If the given node does not have a next sibling or the given value is not greater than the node's value, recursively check the node's first child.
	            //If the given node has a next sibling and the given value is greater than the node's value, recursively check the node's next sibling.
		
	    //Declare a method that adds a given value to the forest rooted in a given node and returns the new root node. Specifically:
	        //If the given node is a null reference (i.e. we are adding a value to an empty forest), create a new leaf node whose value is the given value and return it.
	        //If the given node is a leaf:
	            //If the given value is less than the node's value, create a new node with the given value as its value and the given node as its next sibling, and return the new node.
	            //If the given value equals the node's value, simply return the given node. (The tree already contains the value, so no modifications are required.)
	            //If the given value is greater than the node's value, recursively add the given value to the given node's next sibling, set the given node's next sibling reference to the return value, and return the given node.
	        //If the given node is not a leaf:
	            //If the given node does not have a next sibling or the given value is not greater than the node's value, recursively add the given value to the given node's first child, set the given node's first child reference to the return value, 
				//and return the given node.
	            //If the given node has a next sibling and the given value is greater than the node's value, recursively add the given value to the given node's next sibling, set the given node's next sibling reference to the return value, 
				//and return the given node.
		
	    //Declare a method that removes a given value from the forest rooted in a given node and returns the new root node.


	}
	public static class BalancedSearchTree {
	    //Declare a method that returns the maximum of the two given numbers.
		
	    //Declare a method that returns the height of the forest rooted in a given node. The height of a null pointer is zero. The height of a node is the maximum of one more than the height of the forest rooted in its first child 
		//and the height of its next sibling.
		
	    //Declare a method that returns whether a given forest is perfectly balanced. This is the case when each tree has the same height, and furthermore each tree's sequence of children is itself perfectly balanced.
		
	    //Declare a method that returns whether a given forest is two-three; this means that each interior node has either two or three children. An interior node with less than two children is called light, 
		//and a node with more than three children is called heavy.
		
	    //Declare a method that adds a given value to the forest rooted in a given node, while ensuring that if the forest was two-three before, it will again be two-three afterwards. Specifically, if after the operation, 
		//a tree has four children, replace it with two trees of two children. (Notice that this method does not change the height of the forest.)
		
	    //Declare a method that adds a given value to the forest rooted in a given node, while ensuring that if the forest was two-three and had at most three trees before, it will again be two-three and have at most three trees afterwards. 
		//Specifically, if the forest has four trees, combine the trees to create two higher trees. (Notice that this operation may change the height of the forest.)
		
	    //Declare a method that removes a given value from the forest rooted in a given node, while ensuring that if the forest was two-three before, it will again be two-three afterwards. 
		//Specifically, if after the operation, a tree has only one child, merge it with a sibling to obtain either two trees of two children (if the sibling had three children) or one tree with three children (if the sibling had two children). 
		//(Notice that this operation does not change the height of the forest.)
		
	    //Declare a method that removes a given value from the forest rooted in a given node, while ensuring that if the forest was two-three before, it will again be two-three afterwards and furthermore, if it has only one tree, that tree is a leaf. 
		//Specifically, if after the operation, there is only one tree, replace it with its children. (Notice that this operation may change the height of the forest.)


	}
	

	public static void main(String[] args) {
		assertEquals(1,1);
		int [] arraysorted = {1,2,3,4,5};
		int [] arrayunsorted = {1,2,3,4,5,4};
		int [] permutationsorted = {5,4,3,2,1};
		
		//Checks Tests
			//isSorted
			assert Checks.isSorted(arraysorted);
			System.out.println("isSorted, must return true: " + Checks.isSorted(arraysorted));
			assert Checks.isSorted(arraysorted);
			System.out.println("isSorted, must return false: " + Checks.isSorted(arrayunsorted)+"\n");
			
			//Count
			System.out.println("Count, must return 1: " + Checks.count(arraysorted, 4));
			System.out.println("Count, must return 2: " + Checks.count(arrayunsorted, 4)+"\n");
		
			//Permutation
			System.out.println("Permutation, must return true: " + Checks.permutation(arraysorted, permutationsorted));
			System.out.println("Permutation, must return false: " + Checks.permutation(arrayunsorted, permutationsorted)+"\n");
		
			//Sorted Version
			System.out.println("Sorted Version, must return true: " + Checks.sortedversion(permutationsorted,arraysorted));
			System.out.println("Sorted Version, must return false: " + Checks.sortedversion(arrayunsorted, arrayunsorted)+"\n");
			
		//InsertionSort Tests
			//Insert 
			int [] insertionarray = {1,2,3,4,5,7,8,9};
			System.out.println("Insert, before: " + Arrays.toString(insertionarray));
			InsertionSort.insert(insertionarray, 7, 6);
			System.out.println("Insert, after: " + Arrays.toString(insertionarray)+"\n");	
			//InsertionSort
			int [] arrayunsorted2 = {5,4,3,2,1,4};
			System.out.println("InsertionSort before: " + Arrays.toString(arrayunsorted2));
			InsertionSort.insertionSort(arrayunsorted2);
			System.out.println("InsertionSort after: " + Arrays.toString(arrayunsorted2) + "\n");
			
		//SelectionSort Tests
			//removeGreatest
			int [] greatarray = {1,2,3,4,9,5,6,7,8};
			System.out.println("Selectionsort before: " + Arrays.toString(greatarray));
			SelectionSort.selectionSort(greatarray);
			System.out.println("Selectionsort after: " + Arrays.toString(greatarray)+"\n");
		//MergeSort Tests
			//Merge
			int[] array3 = MergeSort.merge(arraysorted,arrayunsorted);
			System.out.println("Merge: " + Arrays.toString(array3)+"\n");
			
		//HeapSort Tests
		//SearchTree Tests
		//BalancedSearchTree Tests
	}
}


