package collectionsandframework;
import java.util.*;

public class nameComparator implements Comparator<Object>
{

	@Override
	public int compare(Object o1, Object o2) {
		Customer n1=(Customer)o1;
		Customer n2=(Customer)o2;
		
		return n1.name.compareTo(n2.name);
	}
	

}
