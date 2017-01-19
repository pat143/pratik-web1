
import java.util.*;

class AgeComparator implements Comparator{  
public int compare(Object o1,Object o2){
	Student s1=(Student)o1;
	Student s2=(Student)o2;
if(s1.age==s2.age)  
return 0;  
else if(s1.age>s2.age)  
return 1;  
else  
return -1;  
}  
}  

class NameStudent implements Comparator<Student>{  
public int compare(Student s1,Student s2){  
	System.out.println(s1.name+""+s2.name);
return s1.name.compareTo(s2.name);  
}  
}  

public class comparator {

	public static void main(String[] args) {
		ArrayList<Student> al=new ArrayList<Student>();  
		al.add(new Student(101,"Vijay",23));  
		al.add(new Student(106,"Ajay",27));  
		al.add(new Student(105,"Jai",21));
		System.out.println("Sorting by Name...");  
		Collections.sort(al,new NameStudent());  
		for(Student st: al){  
		System.out.println(st.rollno+" "+st.name+" "+st.age);  
		}  
		  
		System.out.println("sorting by age...");  
		  
		Collections.sort(al,new AgeComparator());  
		for(Student st: al){  
		System.out.println(st.rollno+" "+st.name+" "+st.age);  
		}  
		  
	}

}
class Student
{
	int rollno;  
	String name;  
	int age;  
	Student(int rollno,String name,int age){  
	this.rollno=rollno;  
	this.name=name;  
	this.age=age;  
}
}
