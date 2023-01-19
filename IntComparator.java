package collectionsandframework;

import java.util.Comparator;

public class IntComparator implements Comparator<Integer> {

	public int compare(Integer o1, Integer o2) {
		
		Integer i1=o1;
		Integer i2=o2;
		
		if(i1<i2)
			return -1;
		else 
		return 1;
	}

}
