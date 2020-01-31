
class Animal
{
	void eat()
	{
		System.out.println("Eating");
	}
}
class Dog extends Animal
{
	void eat()
	{
		System.out.println("Eating1");
	}
}
public class Dynamicdemo {
	public static void main(String a[])
	{
		Animal a1=new Dog();
		a1.eat();
	}

}
