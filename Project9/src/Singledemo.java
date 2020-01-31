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
		System.out.println("Student id:"+id+"\tAge of student is:"+age+"\tPercentage:"+per+"\tName of the student:"+name);
	}
}
class Teacher extends Person
{
	int salary;
	String name;
	public Teacher(int salary,String name)
	{
		this.salary=salary;
		this.name=name;
		
	}
	void display1()
	{
		System.out.println("Teacher id:"+id+"\tAge of Teacher is:"+age+"\tSalary:"+salary+"\t\tName of the Teacher:"+name);
	}
}
public class Singledemo {
	public static void main(String a[])
	{
	Student s=new Student(78.78f,"Junaid");
	Teacher t=new Teacher(50000,"Junaid1");
	t.add(1,35);
	s.add(1,21);
	s.display();
	t.display1();
}
}
