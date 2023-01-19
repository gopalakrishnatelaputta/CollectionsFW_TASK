//     SORTING THE DATA OF HASH SET BY CONVERTING HASHSET TO ARRAYLIST AND TREESET



package collectionsandframework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class HashsetSorting1 implements Comparable<HashsetSorting1>
{
	 int id;
	 String name;
     Integer marks;
	
	
 public HashsetSorting1(int marks, String name, int id)
  {
	this.marks=marks;
  }
	@Override
	public int compareTo(HashsetSorting1 o) 
	{
		
		return o.marks.compareTo(this.marks);
	}


	

	
}
class TestHashset
{
	public static void main(String[] args) 
	{
		HashSet<Object>hs=new HashSet<Object>();
		
		hs.add(new HashsetSorting1(101,"Ravi",98));
		hs.add(new HashsetSorting1(102,"Sai ram",99));
		hs.add(new HashsetSorting1(108,"Gopala krishna",85));
		hs.add(new HashsetSorting1(104,"Taj",25));
		hs.add(new HashsetSorting1(103,"Jadeja",26));
		hs.add(new HashsetSorting1(105,"Ganesh",98));
		hs.add(new HashsetSorting1(107,"Sravani",98));
		hs.add(new HashsetSorting1(106,"Kouser",98));
		
		System.out.println("Before sorting the elemets  :"+hs);
		/*Iterator i=hs.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		ArrayList<HashsetSorting1>al=new ArrayList<HashsetSorting1>();
		
		Collections.sort(al);
		System.out.println(" "+al);
		*/
		
		TreeSet ts=new TreeSet();
		System.out.println(ts);
		
		
		
		
	}

	
}

