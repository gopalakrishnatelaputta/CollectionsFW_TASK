package collectionsandframework;

import java.util.LinkedHashMap;
 
public class LinkedHashMap1 
{
	public static void main(String[] args) 
	{
		LinkedHashMap<Integer,String> lhm=new LinkedHashMap<Integer,String>();
		
		lhm.put(51, "Gopala krishna");
		lhm.put(52, "krishna");
		lhm.put(57, "Sai Ram");
		lhm.put(53, "Naga raju");
		lhm.put(56, "Imran");
		lhm.put(54, "Mahesh");
		
		Integer id = 51;
		
		if(lhm.containsKey(id))
		{
			System.out.println("Customer Found with id   "+id+"Name of the customer is :"+lhm.get(id));
		}
		else
		{
			System.out.println(id+"id Does not exist");
		}
		String name="Naga raju";
		if(lhm.containsValue(name))
		{
			System.out.println();
			System.out.println("Customer found with name "+name+"  exists in the map");
			
		}
		else {
			System.out.println();
			System.out.println("Customer not fount with the name "+name);
		}
		id =53;
		lhm.put(id, "Dinesh");
		System.out.println();
		System.out.println(lhm);
		
	}

}
