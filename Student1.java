package Task1;


	import java.util.ArrayList;
	import java.util.Collections;

	public class Student1 implements Comparable<Student1> 
		{
		    private String studentname;
		    private int rollno;
		    private int studentage;

		    public Student1(int rollno, String studentname, int studentage) 
		    {
		        this.rollno = rollno;
		        this.studentname = studentname;
		        this.studentage = studentage;
	        }
		   
		   public int compareTo(Student1 comparestu)
		        {
		            int compareage=((Student1)comparestu).getStudentage();
		            return this.studentage-compareage;
		    	}
		    	private int getStudentage() {
			
			    return studentage;
		}

				@Override
		        public String toString() 
		    	{
		            return "[ rollno=" + rollno + ", name=" + studentname + ", age=" + studentage + "]";
		        }

				//public int compareTo1(Student1 o) {
					// TODO Auto-generated method stub
					//return 0;
				//}
		}
		class ArraysListSorting1 extends Student1
		{
			public ArraysListSorting1(int rollno, String studentname, int studentage) {
				super(rollno, studentname, studentage);
				// TODO Auto-generated constructor stub
			}

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

