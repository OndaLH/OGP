package HZ3_IntList;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IntListTest {

	@Test
	void intListTest() {
		//New array
		IntList array = new IntList();
		//Length should be 0
		assertEquals(array.getLength(),0);
		//Add 2 elements to array
		array.addElement(1);
		array.addElement(2);
		//Length should be 2
		assertEquals(array.getLength(),2);
		//Index 1 should be 2
		assertEquals(array.findByIndex(1),2);
		//Remove 1 element
		array.removeElement();
		//Length should be 1
		assertEquals(array.getLength(),1);
		//Array should be [1]
		IntList clone = new IntList();
		clone.addElement(1);
		assertArrayEquals(array.getArray(), clone.getArray());
	}

}
