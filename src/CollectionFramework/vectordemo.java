package CollectionFramework;
import java.util.Enumeration;
import java.util.Vector;
class Student
{
	int id;
	String name;
	int grade;
	
	public Student(int id, String name, int grade)
	{
		this.id = id;
		this.name = name;
		this.grade = grade;
	}
	public String toString()
	{
		String str="Student is ["+id+","+name+","+grade+"]";
		return str;
	}
}

public class vectordemo {

	public static void main(String[] args) {
		Vector v=new Vector();
		  Student s1=new Student(101,"Harry",10);
		Student s2=new Student(102,"Potter",10);
			v.addElement(s2);
			v.addElement(s1);
			v.addElement("999");
			v.addElement("999");
			v.addElement(new String("999"));
			
			Enumeration e=v.elements();
		    while(e.hasMoreElements())
		    {
		    	Object o=e.nextElement();
		    	System.out.println(o);
		    }

	}

}
