package Task1;

	import java.util.ArrayList;
	import java.util.HashMap;
	import java.util.HashSet;
	import java.util.Iterator;
	import java.util.ListIterator;
	import java.util.Map.Entry;



	public class HashMap2 
	{
		void Hash()
		{
			HashMap<Object,Object>hm=new HashMap<Object, Object>();
			
			hm.put(18, "Virat Kohli");
			hm.put(45, "Rohith sharma");
			hm.put(01, " KL Rahul");
			hm.put(63, "SKY");
			hm.put(41, "Shreyas ayyar");
			hm.put(32, "Ishan Kishan");
			hm.put(17, "Rishabh pant");
			hm.put(8, " Ravindra Jadeja");
			hm.put(20, "Axar patel");
			hm.put(99, "Ravi chandran Ashwin ");
			hm.put(93, "Jasprith bumrah");
			hm.put(15, "Bhuvaneswar kumar");
			
			System.out.println("==========================================================");
			System.out.println("Printing kay values in array format  :");
			System.out.println();
			System.out.println(hm);
			
			System.out.println("========================================================");
			System.out.println("Retriving keys from the HashMap");
			System.out.println("=========================================================");
			HashSet<Object>hs=new HashSet<>(hm.keySet());
			System.out.println();
			System.out.println("Keys present in the map are  :"+hs);
			System.out.println("==========================================================");
			System.out.println("Retriving all the keys from the Map  :");
			Iterator<Object> i=hs.iterator();
			while(i.hasNext())
			{
				System.out.println(i.next());
			}
			System.out.println("============================================================");
			System.out.println("Retriving key value pairs  :");
			System.out.println("------------------------------------------------------------");
			HashSet<Object>hs1=new HashSet<>(hm.entrySet());
			Iterator<Object>i1=hs1.iterator();
			while(i1.hasNext())
			{
				
				//System.out.println(i1.next());
				Entry e=(Entry)i1.next();
				System.out.println(e.getKey()+"  :  "+e.getValue());
				
			}
			System.out.println("============================================================");
			System.out.println("Converting into arrayList  :");
			System.out.println("Printing in farward direction ");
			System.out.println("------------------------------------------------------------");
			
			ArrayList<Object>al=new ArrayList<Object>(hs);
			ListIterator<Object>li=al.listIterator();
			while(li.hasNext())
			{
				System.out.println(li.next()+"  ");
			}
			System.out.println("Printing in backward direction  :");
			System.out.println("-------------------------------------------------------------");
			while(li.hasPrevious())
			{
				System.out.println(li.previous()+" ");
			}
			System.out.println("==============================================================");
			System.out.println("Converting into ArrayList and printing  :");
			System.out.println();
			ArrayList<Object>al1=new ArrayList<Object>(hs1);
			ListIterator<Object>li1=al1.listIterator();
			while(li1.hasNext())
			{
				Entry e1=(Entry)li1.next();
				System.out.println(e1.getKey()+"  "+e1.getValue());
			}
			System.out.println("----------------------------------------------------------------");
			System.out.println("Printing in reverse order :");
			System.out.println();
			while(li1.hasPrevious())
			{
				Entry e2=(Entry)li1.previous();
				System.out.println(e2.getKey()+"  "+e2.getValue());
			}
			System.out.println("=============================================================");
			System.out.println();
			System.out.println(hm.get(17));
			System.out.println(hm.get(45));
		}
		
		public static void main(String[] args) 
		{
			HashMap2 hset=new HashMap2();
			hset.Hash();
		}	
					
	}


