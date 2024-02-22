package HZ1_JLearner;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

//Declare a class such that an object of this class can be used to store the age and the next oldest sibling of a person. (That is, declare a class Person with a field age and a field nextOldestSibling.) 
//(The next oldest sibling of a person is the oldest sibling of that person that is younger than that person.) If a person has no younger siblings, store null in the corresponding nextOldestSibling field.
public class OldestSibling{
	public class Person {
		private int age;
		private Person nextOldestSibling;

		public Person(int age) {
			this.setAge(age);
			this.nextOldestSibling = null;
		}

		public Person getNextOldestSibling() {
			return nextOldestSibling;
		}

		public void setNextOldestSibling(Person nextOldestSibling) {
			this.nextOldestSibling = nextOldestSibling;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		//Declare a method that counts the number of younger siblings of some person, given a Person object corresponding to that person (iterative implementation).	
		public int counterite() {
			int count = 0;
			Person currentSibling = nextOldestSibling;
			while (currentSibling != null) {
				count++;
				currentSibling = currentSibling.getNextOldestSibling();
			}

			return count;
		}


		//Declare a method that counts the number of younger siblings of some person, given a Person object corresponding to that person (recursive implementation). 
		public int counterrec() {
			Person currentSibling = nextOldestSibling;
			if (currentSibling == null) {
				return 0;
			} else {
				return 1 + currentSibling.counterrec();
			}
		}

		//Declare a method that counts the number of adult younger siblings of a some person, given a Person object corresponding to that person (iterative implementation).
		public int adultsiblint() {
			int count = 0;
			Person currentSibling = nextOldestSibling;
			while (currentSibling != null) {
				if(currentSibling.getAge()>=18) {
					count++;
				}currentSibling = currentSibling.getNextOldestSibling();
			}

			return count;
		}

		//Declare a method that counts the number of adult younger siblings of a some person, given a Person object corresponding to that person (recursive implementation).
		public int adultsiblrec() {
			Person currentSibling = nextOldestSibling;
			if (currentSibling == null) {
				return 0;
			} else if(currentSibling.getAge() < 18) {
				return currentSibling.counterrec();
			}else
				return 1 + currentSibling.counterrec();
		}

		//Declare a method that increments the age stored for some person, as well the ages stored for the person's younger siblings by one, given a Person object corresponding to that person (iterative implementation).
		public void ageupint() {
			age++;
			Person currentSibling = nextOldestSibling;
			while (currentSibling != null) {
				currentSibling.age++;
				currentSibling = currentSibling.getNextOldestSibling();
			}
		}

		//Declare a method that increments the age stored for some person, as well the ages stored for the person's younger siblings by one, given a Person object corresponding to that person (recursive implementation).
		public void ageuprec() {
			age++;
			if (nextOldestSibling != null) {
				nextOldestSibling.ageuprec();
			}
		}

		//Declare a method that updates the Person object corresponding to the youngest sibling of some person p to reflect the fact that a new sibling (age 0) was born, given a Person object corresponding to person p (iterative implementation).
		private Person findYoungestSibling() {
			Person currentSibling = nextOldestSibling;
			while (currentSibling != null && currentSibling.getNextOldestSibling() != null) {
				currentSibling = currentSibling.getNextOldestSibling();
			}
			return currentSibling;
		}
		public void updateYoungestSibling() {
			Person youngestSibling = findYoungestSibling();
			if (youngestSibling != null) {
				Person newSibling = new Person(0);
				youngestSibling.setNextOldestSibling(newSibling);
			}
		}

		//Declare a method that updates the Person object corresponding to the youngest sibling of some person p to reflect the fact that a new sibling (age 0) was born, given a Person object corresponding to person p (recursive implementation).
		public void updateYoungestSiblingRecursive() {
			Person youngestSibling = findYoungestSiblingRecursive(this);

			if (youngestSibling != null) {
				Person newSibling = new Person(0);
				youngestSibling.setNextOldestSibling(newSibling);
			}
		}
		private Person findYoungestSiblingRecursive(Person currentPerson) {
			if (currentPerson.getNextOldestSibling() == null) {
				return currentPerson;
			} else {
				return findYoungestSiblingRecursive(currentPerson.getNextOldestSibling());
			}
		}

	}

	public static void main(String[] args) {
		//Counters
		OldestSibling.Person person1 = new OldestSibling().new Person(25);
		OldestSibling.Person person2 = new OldestSibling().new Person(20);
		OldestSibling.Person person3 = new OldestSibling().new Person(18);

      person1.setNextOldestSibling(person2);
      person2.setNextOldestSibling(person3);

      assert person1.counterite() == 2;
      System.out.println("Int Counter:" + person1.counterite());
      assert person1.counterrec() == 2;
      System.out.println("Rec Counter:" + person1.counterrec());
      
      //AdultSiblingCount
      OldestSibling.Person person4 = new OldestSibling().new Person(25);
      OldestSibling.Person person5 = new OldestSibling().new Person(20);
      OldestSibling.Person person6 = new OldestSibling().new Person(18);

      person1.setNextOldestSibling(person5);
      person2.setNextOldestSibling(person6);

      assert person4.adultsiblint() == 1;
      System.out.println("Int Counter:" + person1.adultsiblint());
      assert person4.adultsiblrec() == 1;
      System.out.println("Rec Counter:" + person1.adultsiblrec());
      
      //AgeUp
      OldestSibling.Person person7 = new OldestSibling().new Person(25);
      OldestSibling.Person person8 = new OldestSibling().new Person(20);
      OldestSibling.Person person9 = new OldestSibling().new Person(18);

      person7.setNextOldestSibling(person2);
      person8.setNextOldestSibling(person3);

      person7.ageupint();
      System.out.println("Int Ages");
      assert person7.getAge() == 26;
      System.out.println("Person7:" + person7.getAge());
      assert person8.getAge() == 21;
      System.out.println("Person8:" + person8.getAge());
      assert person9.getAge() == 19;
      System.out.println("Person9:" + person9.getAge());
      
      person7.ageuprec();
      System.out.println("Rec Ages");
      assert person7.getAge() == 27;
      System.out.println("Person7:" + person7.getAge());
      assert person8.getAge() == 28;
      System.out.println("Person8:" + person8.getAge());
      assert person9.getAge() == 20;
      System.out.println("Person9:" + person9.getAge());
      
      //UpdateYoungestSibling
      OldestSibling.Person person10 = new OldestSibling().new Person(25);
      OldestSibling.Person person11 = new OldestSibling().new Person(20);

      person10.setNextOldestSibling(person11);

      person10.updateYoungestSibling();

      assert person10.counterite() == 2;
      assert person11.getNextOldestSibling().getAge() == 0;
      
      OldestSibling.Person person12 = new OldestSibling().new Person(25);
      OldestSibling.Person person13 = new OldestSibling().new Person(20);

      person12.setNextOldestSibling(person13);

      person12.updateYoungestSiblingRecursive();

      assertEquals (person12.counterrec(), 2);
      assert person13.getNextOldestSibling().getAge() == 0;
      
	}
}

