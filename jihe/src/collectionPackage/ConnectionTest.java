package collectionPackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ConnectionTest {
    
	public static void main(String[] args) {
		
		
		Collection<Object> arrayList = new ArrayList<Object>();
	    
		arrayList.add("aa");
		arrayList.add("bb");
		arrayList.add("cc");
		System.out.println(arrayList);
		//iterator迭代器接口
		Iterator<Object> iterator = arrayList.iterator();
		while(iterator.hasNext()) {
			
			
			Object next = iterator.next();
		
		
		    System.out.println(next);
		}
	    
		
		
	    
	   
		
		
	}
	
	
}
