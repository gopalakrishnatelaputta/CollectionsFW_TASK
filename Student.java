package Task1;

import java.util.ArrayList;
import java.util.Collections;

public class Student implements Comparable<Object> 
	{
	    private String studentname;
	    private int rollno;
	    private int studentage;

	    public Student(int rollno, String studentname, int studentage) 
	    {
	        this.rollno = rollno;
	        this.studentname = studentname;
	        this.studentage = studentage;
        }
	   
	   public int compareTo(Student comparestu)
	        {
	            int compareage=((Student)comparestu).getStudentage();
	            return this.studentage-compareage;
	    	}
	    	private int getStudentage() {
		
		    return 0;
	}

			@Override
	        public String toString() 
	    	{
	            return "[ rollno=" + rollno + ", name=" + studentname + ", age=" + studentage + "]";
	        }

			@Override
			public int compareTo(Object o) {
				// TODO Auto-generated method stub
				return 0;
			}
	}
	class ArraysListSorting
	{
		public static void main(String[] args) 
		{
			ArrayList<Student>al=new ArrayList<Student>();
			al.add(new Student(223,"Chaithanya",19));
			al.add(new Student(224,"Ravi",21));
			al.add(new Student(225,"Hemanth",19));
			al.add(new Student(226,"Jayanth",22));
			al.add(new Student(227,"Nagarjuna",20));
			al.add(new Student(228,"Bindu",18));
			
			Collections.sort(al);
		}
	}
