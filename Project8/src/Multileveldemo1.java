class Animal
{
	void eat() {
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
class Puppy extends Dog
{
	void help()
	{
		System.out.println("Help it!!");
	}
}
public class Multileveldemo1 {
	public static void main(String a[])
	
	{
		Puppy p1=new Puppy();
		p1.eat();
		p1.help();
	}

}
