
class Animal {
 void eat()
 {
	 System.out.println("Eating");
 }
}
 public class Dog extends Animal
 {
	 void sleep()
	 {
		 System.out.println("Sleeping");
	 }
 
 public static void main(String a[])
 {
	 Dog d= new Dog();
	 d.eat();
	 d.sleep();
	 
 }
}

