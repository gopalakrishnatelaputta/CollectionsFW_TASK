package Task1;

import java.util.LinkedList;
import java.util.ListIterator;

	public class LinkedList2 
	{
		public static void main(String[] args) 
		{
			LinkedList<Object>li=new LinkedList<>();
			
			li.add(101);
			li.add("ravi");
			li.add(300.00);
			li.add("SQL");
			li.add("SQL");
			li.add("JAVA");
			li.add("PYTHON");
			li.add("USER");
			
			ListIterator<Object>li1=li.listIterator();
			while(li1.hasNext())
			{
				System.out.println(li1.next());
			}
			//ListIterator<Object>li2=li.listIterator();
			System.out.println("==============reverse order===========================");
			while(li1.hasPrevious())
			{
				System.out.println(li1.previous());
			}
			System.out.println("==========================Size of vector========================");
			System.out.println(li.size());
			li.toArray();
			System.out.println(li);
          }	
}


