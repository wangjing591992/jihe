package collectionPackage;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class ListTest {
     public static void main(String[] args) {
    	 
    	
    	
    	  
    	 //LinkedList<Object> list = new LinkedList<>();
 		List<Object> list = new ArrayList<>();
 	    list.add("aa");
 	    list.add("bb");
 	    list.add("cc");
 	    
 	  
 	    
 	  
 	    
 	    
 	    //list有索引,可以用遍历取值
 	    for(int i=0;i<list.size();i++) {
 	    	System.out.println("list[i]="+list.get(i));
 	    }
 	    
 	    //这里运行会报异常,原因:迭代器要往出取元素,而集合要往进存元素,并发操作
 	    //同理,在迭代的同时也不能remove(),
 	    //Exception in thread "main" java.util.ConcurrentModificationException
 	   
 	   /* Iterator<Object> iterator = list.iterator();
 	    while(iterator.hasNext()) {
 	    	Object next = iterator.next();
 	    	if(next.equals("cc")) {
 	    		list.add("ee");
 	    		
 	    	}
 	    	
 	        System.out.println("next="+next);
 	    }*/
 	    
 	    //list集合特有的迭代方法  listIterator()
 	    ListIterator<Object> listIterator = list.listIterator();
 	    while(listIterator.hasNext()) {
 	    	Object next = listIterator.next();
 	    	//这里用了listIterator,并发操作不会报错,但这是list集合特有的方法
 	        if(next.equals("bb")) {
 	        	
 	        	listIterator.set("tt");//修改并发
 	        	listIterator.add("ee");//添加并发
 	        	
 	        	
 	        }
 	      
 	    }
 	   System.out.println("listIterator="+list);
 	  
 	    
 	    
 	    
 	    
 	    
 	    
 	    
 	    
 	    
 	    
 	    
 	   //获取元素下标
 	     int indexOf = list.indexOf("ee");
 	     System.out.println("indexOf="+indexOf);
 	     
 	     //取下标之间的元素
 	     List<Object> subList = list.subList(1, 3);
 	     System.out.println("sublist="+subList);
 	    
 	    
 	    //在指定位置插入元素  2是索引下标
 	    list.add(2, "dd");
 	    
 	   System.out.println(list);
 	   
 	    //删除下标为1的元素
 	    list.remove(1);
 	   System.out.println(list);
 	    
 	    //修改
 	    list.set(1, "rr");
 	    System.out.println(list);
 	    
 	    
 	    
 	    //vector里特有的取值方式,枚举
 	    Vector<Object> vector = new Vector<>();
 	    
 	    vector.add(11);
 	    vector.add(22);
 	    vector.add(33);
 	    
 	    Enumeration<Object> elements = vector.elements();
 	    while(elements.hasMoreElements()) {
 	    	Object nextElement = elements.nextElement();
 	    	System.out.println("elements="+nextElement);
 	    }
 	    
 	    
 	    
	}
    
     
    
	
    
     
     
     
     
     
     
}
