package HZ1_JLearner;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class Objects {

	//Declare a class Vector such that an object of this class can be used to store a two-dimensional vector with integer coordinates x and y. 
	//(That is, declare a class Vector with a field x and a field y.)
	public static class Vectors {

		private int x;
		private int y;

		public Vectors(int x, int y) {
			this.x = x;
			this.y = y;
		}

		public int getX() {
			return x;
		}

		public int getY() {
			return y;
		}

		public void setX(int x) {
			this.x = x;
		}

		public void setY(int y) {
			this.y = y;
		}
	}

	//Declare a method that returns the magnitude (also known as the Euclidian length) (rounded down) of the vector stored in a 
	//given Vector object. (Use the square root method you declared earlier.)
	public static class EuclidianLength {
		static int euclidian(int x, int y) {
			int product = (x - y) * (x - y);
			return root(product);
		}

		static int root(int x) {
			int result = 0;
			for (int i = 0; i <= x; i++)
				if (i * i <= x)
					result = i;
			return result;
		}
	}

	//Declare a method that returns whether the vector stored in one given Vector object is larger than the vector stored in 
	//another given Vector object. Use the size method you declared in the previous exercise.
	public static class LargerThan {
		static boolean largerThan(int x1, int y1, int x2, int y2) {
			int vector1 = EuclidianLength.euclidian(x1, y1);
			int vector2 = EuclidianLength.euclidian(x2, y2);

			return vector1 > vector2;
		}
	}

	//Declare a method that returns a new Vector object that stores the sum of the vectors stored in two given Vector objects.
	public static class SumVectors {
		Vectors newvector(Vectors vector1, Vectors vector2) {
			int x3 = som(vector1.getX(), vector2.getX());
			int y3 = som(vector1.getY(), vector2.getY());

			return new Vectors(x3, y3);
		}

		int som(int x, int y) {
			return x + y;
		}
	}

	//Declare a method that translates (shifts) the vector stored in a given Vector object by the vector stored in another given Vector object. 
	//It updates the first Vector object; it does not create a new object.  
	public static class Shift{
		static Vectors shift(Vectors vector1, Vectors vector2) {
			int newx = vector1.getX() + vector2.getX();
			int newy = vector1.getY() + vector2.getY();

			vector1.setX(newx);
			vector1.setY(newy);

			return vector1;
		}
	}

	public static void main(String[] args) {
		//Set vector1
		Vectors vector1 = new Vectors(5, 1);
		System.out.println("Vector1: (" + vector1.getX() + ", " + vector1.getY() + ")");
		int x1 = vector1.getX();
		int y1 = vector1.getY();
		//Set vector2
		Vectors vector2 = new Vectors(1, 1);
		System.out.println("Vector2: (" + vector2.getX() + ", " + vector2.getY() + ")");
		int x2 = vector2.getX();
		int y2 = vector2.getY();

		//Length vector1
		int length1 = EuclidianLength.euclidian(x1, y1);
		System.out.println("Length of vector1: " + length1);
		//Length vector2
		int length2 = EuclidianLength.euclidian(x2, y2);
		System.out.println("Length of vector2: " + length2);

		//vector1 > vector2?
		boolean groter = LargerThan.largerThan(x1, y1, x2, y2);
		System.out.println("Is vector1 larger than vector2? " + groter);

		//Set vector3
		SumVectors sumVectors = new SumVectors();
		Vectors vector3 = sumVectors.newvector(vector1, vector2);
		System.out.println("Sum of vectors: (" + vector3.getX() + ", " + vector3.getY() + ")");

		//Shift vector1 door vector2
		System.out.println("Original Vector1: (" + vector1.getX() + ", " + vector1.getY() + ")");
		vector1 = Shift.shift(vector1, vector2);
		System.out.println("New Vector1: (" + vector1.getX() + ", " + vector1.getY() + ")");
		
		assertEquals(1,1);
	}
}

