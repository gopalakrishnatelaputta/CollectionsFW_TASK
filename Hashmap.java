package collectionsandframework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Hashmap 
{
	public static void main(String[] args) {
		
	
	HashMap<Integer,String>hm=new HashMap<Integer, String>();
	LinkedHashMap<Integer, String> sortedMap = new LinkedHashMap<>();
	 ArrayList<String> list = new ArrayList<>();
	hm.put(18, "Virat Kohli");
	hm.put(45, "Rohith sharma");
	hm.put(63, "SKY");
	hm.put(41, "Shreyas ayyar");
	hm.put(32, "Ishan Kishan");
	hm.put(17, "Rishabh pant");
	hm.put(20, "Axar patel");
	hm.put(99, "Ravi chandran Ashwin ");
	hm.put(93, "Jasprith bumrah");
	hm.put(15, "Bhuvaneswar kumar");
	
	for (Map.Entry<Integer, String> entry : hm.entrySet()) 
	{
        list.add(entry.getValue());
	}
	Collections.sort(list, new Comparator<String>() {
        public int compare(String str, String str1) {
            return (str).compareTo(str1);
        }
        });
	
	for (String str : list) {
        for (Entry<Integer, String> entry : hm.entrySet()) {
            if (entry.getValue().equals(str)) {
                sortedMap.put(entry.getKey(), str);
            }
        }
    }
    System.out.println(sortedMap);
}
}


	

