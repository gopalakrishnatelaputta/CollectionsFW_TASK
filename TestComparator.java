package collectionsandframework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestComparator 
{
	public static void main(String[] args) 
	{
		ArrayList<Customer> al=new ArrayList<Customer>();
		
		al.add(new Customer(101,"Gopal",25,"Hyderabad",5000));
		al.add(new Customer(102,"Ramam",27,"Chennai",10000));
		al.add(new Customer(103,"Imran",24,"Pune",15000));
		al.add(new Customer(104,"Ravi",21,"punjab",8000));
		al.add(new Customer(105,"Krishna",28,"Banglore",12000));
		
		
		System.out.println("=======================================================");
		System.out.println("=============Sorting by Name of the Customer  :===========");
		System.out.println();
		System.out.println("Cus_id     "+"Cus_Name     "+"Cus_Age     "+"Cus_city     "+"Cus_Money       ");
		System.out.println();
		Collections.sort(al,new nameComparator());
		java.util.Iterator<Customer> i=al.iterator();
		while(i.hasNext())
		{
			Customer cs=(Customer)i.next();
			System.out.println(String.format("%s %15s %7s %15s %12s",cs.id,cs.name,cs.age,cs.city,cs.money));
		}
		System.out.println();
		System.out.println("======================================================================");
		System.out.println();
		System.out.println("==================     Sorting by Age of the Customer    :=============");
		System.out.println();
		System.out.println("Cus_id     "+"Cus_Name     "+"Cus_Age     "+"Cus_city     "+"Cus_Money       ");
		System.out.println();
		Collections.sort(al,new Agecomparator());
		Iterator<Customer> i1=al.iterator();
		while(i1.hasNext())
		{
			Customer cs1=(Customer)i1.next();
			System.out.println(String.format("%s %15s %7s %15s %12s",cs1.id,cs1.name,cs1.age,cs1.city,cs1.money));
			
		}
		
		System.out.println();
		System.out.println("======================================================================");
		System.out.println();
		System.out.println("==================     Sorting by Money of the Customer (Desc) :=============");
		System.out.println();
		System.out.println("Cus_id     "+"Cus_Name     "+"Cus_Age     "+"Cus_city     "+"Cus_Money       ");
		System.out.println();
		Collections.sort(al,new MoneyComparator());
		Iterator<Customer> i2=al.iterator();
		while(i2.hasNext())
		{
			Customer cs2=(Customer)i2.next();
			System.out.format(String.format("%s %15s %7s %15s %12s",cs2.id,cs2.name,cs2.age,cs2.city,cs2.money+"\n"));
			
		}
		
		
		
	}

}
