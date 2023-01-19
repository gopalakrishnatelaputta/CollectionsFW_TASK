package collectionsandframework;
import java.util.ArrayList;
import java.util.Collections;

public class StudentComparable implements Comparable<StudentComparable>
{
	

	
	        @SuppressWarnings("unused")
			private String studentname;
		    int rollno;
		    int studentage;

		    public StudentComparable(int rollno, String studentname, int studentage) 
		    {
		        this.rollno = rollno;
		        this.studentname = studentname;
		        this.studentage = studentage;
	        }

			@Override
			public int compareTo(StudentComparable Stu) {
				if(studentage<Stu.studentage)
				return -1;
				else if(studentage<Stu.studentage)
					return 1;
				else
					return 0;
			}
		    
		}
		class ArraysListSorting1
		{
			public static void main(String[] args) 
			{
				ArrayList<StudentComparable>al1=new ArrayList<StudentComparable>();
				al1.add(new StudentComparable(223,"Chaithanya",19));
				al1.add(new StudentComparable(224,"Ravi",21));
				al1.add(new StudentComparable(225,"Hemanth",19));
				al1.add(new StudentComparable(226,"Jayanth",22));
				al1.add(new StudentComparable(227,"Nagarjuna",20));
				al1.add(new StudentComparable(228,"Bindu",18));
				
				Collections.sort(al1);
				for(StudentComparable Stu:al1)
				{
					System.out.println(Stu.rollno+Stu.studentage+Stu.studentage);
				}
			}
}


