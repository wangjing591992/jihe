package collectionPackage;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist {
	
	public static void sop(Object obj) {
		System.out.println(obj);		
		
	}
	
	
	
    public static void main(String[] args) {
		ArrayList<Object> arrayList = new ArrayList<>();
		
		arrayList.add("11");
		arrayList.add("11");
		arrayList.add("22");
		arrayList.add("11");
		arrayList.add("22");
		arrayList.add("11");
		
		
		sop(arrayList);
		
		
		ArrayList<Object> singleElement = singleElement(arrayList);
		sop(singleElement);
	}
    
    //arraylist集合去重
    public static ArrayList<Object> singleElement(ArrayList<Object> arrayList){
    	//定义一个临时的集合
    	ArrayList<Object> list = new ArrayList<>();
    	
    	
    	
    	//迭代集合
    	Iterator<Object> iterator = arrayList.listIterator();
    	while(iterator.hasNext()) {
    		Object next = iterator.next();
    		//如果临时集合中不包含原来集合中的元素,就添加,避免了重复元素的添加
    		if(!list.contains(next)) {
    			list.add(next);
    		}
    		
    		
    	}
		return list;
    	
    	
    }
    
    



	
  
    
    
    
}
