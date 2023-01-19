package collectionsandframework;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetUserdefinedObjects1 {
		public static void main(String[] args) 
		{
			SortedSet<Employee>ss=new TreeSet<Employee>();
			
			ss.add(new Employee(1010, "Rajeev"));
	        ss.add(new Employee(1005, "Sachin"));
	        ss.add(new Employee(1008, "Chris"));
	        
	        System.out.println(" Sorting order According to Id's  :");
	        System.out.println(ss);
	        
	        System.out.println("=========================================================================================================");
			System.out.println("Sorting order According to the Names  :");
			
			ss=new TreeSet<>(Comparator.comparing(Employee :: getName));
			
			ss.add(new Employee(1010, "Rajeev"));
	        ss.add(new Employee(1005, "Sachin"));
	        ss.add(new Employee(1008, "Chris"));
			
			System.out.println(ss);
		}
}


