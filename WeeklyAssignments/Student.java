package Publish.WeeklyAssignments;

public class Student extends Person {
float marks;
Student(String name, int age, float marks)
{
	super(name,age);
	this.marks=marks;
}
void display()
{	
	System.out.println("Name: "+name);
	System.out.println("Age: "+age);
	System.out.println("Marks: "+marks);
}

}
