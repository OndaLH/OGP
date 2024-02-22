package HZ3_IntList;

public class IntList {
	private int[] array;
	private int length;
    
	/**
	 * Returns an empty array.
	 * 
	 * @post Array is empty
	 * 		| getLength() == 0
	 */
    public IntList() {
    	array = new int[0];
    }
    
	/**
	 * Returns the length of the array.
	 */
    public int getLength() {
    	return array.length;
    }
    
	/**
	 * Returns the value at position 'index' in the array.
	 * 
	 * @pre Index must not be negative
	 * 		| index >= 0
	 * @pre Index must be smaller or equals to the length of the array
	 * 		| index >= getLength()
	 */
    public int findByIndex(int index) {
    	return array[index];
    }
    
	/**
	 * Returns the array.
	 * 
	 * @pre Array is nonzero
	 * 		| getArray() != null
	 */
    public int[] getArray() {
    	return array;
    }
    
	/**
	 * Adds element 'value' to the end of the array.
	 */
    public void addElement(int value) {
     	int [] clone = new int[array.length+1];
     	System.arraycopy(array, 0, clone, 0, length);
        array = clone;
        array[length++] = value;
    }
    
	/**
	 * Removes the last element of the array.
	 * 
	 * @pre The length of the array must be larger than 0
	 * 		|getLength() > 0
	 */
    public void removeElement() {
    	int [] clone = new int[array.length-1];
     	System.arraycopy(array, 0, clone, 0, length-1);
        array = clone;
    }
}
