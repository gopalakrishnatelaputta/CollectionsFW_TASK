package collectionsandframework;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListwithComparator 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		al.add(25);
		al.add(32);
		al.add(59);
		al.add(64);
		al.add(77);
		al.add(85);
		
		Collections.sort(al,new IntComparator());
		System.out.println(al);
		
		
	}

}
