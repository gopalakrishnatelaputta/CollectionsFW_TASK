package collectionsandframework;
import java.util.*;

public class MoneyComparator implements Comparator<Object>
{

	@Override
	public int compare(Object o1, Object o2) {
		Customer m1=(Customer)o1;
		Customer m2=(Customer)o2;
		
		//return m1.money.compareTo(m2.money);
		
		if(m1.money==m2.money)
			
			return 0;
		
		else if(m1.money<m2.money)
			
		    return 1;
		
		else 
			return -1;
		
	}
	

}
