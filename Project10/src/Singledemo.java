class Person
{
	int id;
	int age;
	void add(int id,int age)
	{
		this.id=id;
		this.age=age;
	}
}
class Student extends Person
{
	float per;
	String name;
	public Student(float per,String name)
	{
		this.per=per;
		this.name=name;
	}
	void display()
	{
		System.out.println("Student id:"+id+"\tAge of student is:"+age+"\tPercentage:"+per+"\t\tName of the student:"+name);
	}
}
public class Singledemo {
	public static void main(String a[])
	{
	
	
	Student s=new Student(78,"Junaid");
	s.add(1,21);
	s.display();
}
}