package collectionPackage;

import java.util.LinkedList;

public class LinkedListTest {
     public static void main(String[] args) {
		 LinkedList<Object> linkedList = new LinkedList<>();
    	  //linkedlist特有的方法addfirst(),addlast()
		 linkedList.addFirst("11");
    	 linkedList.addFirst("22");
    	 linkedList.addFirst("33");
    	 linkedList.addLast("aa");
    	 
    	 boolean contains = linkedList.contains("aa");
    	
    	 
    	 
    	 /*System.out.println("peekfirst"+linkedList.peekFirst());
    	 System.out.println("peeklast"+linkedList.peekLast());*/
    	 
    	 System.out.println("pollfirst="+linkedList.pollFirst());
    	 System.out.println("pollfirst="+linkedList.pollLast());
    	 System.out.println(linkedList.size());
    	 
    	 System.out.println("pollfirst="+linkedList.pollFirst());
    	 System.out.println("pollfirst="+linkedList.pollLast());
    	 System.out.println(linkedList.size());
    	 System.out.println("pollfirst="+linkedList.pollFirst());
    	 
    	 
    	 
    	 
    	 for(int i=0;i<linkedList.size();i++) {
    		 System.out.println(linkedList.get(i));
    	 }
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 //用getfirst(),getlast()取第一个和最后一个元素
    	 System.out.println("first"+linkedList.getFirst());
    	 System.out.println("last"+linkedList.getLast());
    	
    	 
    	 
    	 //用removeFirst(),removeLast()删除元素,会打印出要删除的元素,然后再删除它
    	 System.out.println("removeFirst="+linkedList.removeFirst());
    	 System.out.println("removeLast="+linkedList.removeLast());
    	 System.out.println("size"+linkedList.size());
    	 
    	 
    	 System.out.println("removefirst1=="+linkedList.removeFirst());
    	 System.out.println("removelast1=="+linkedList.removeLast());
    	 
    	 for(int i=0;i<linkedList.size();i++) {
    		 System.out.println(linkedList.get(i));
    	 }
    	 
    	 System.out.println("size1="+linkedList.size());
    	 System.out.println(linkedList.removeFirst());
    	 
    	 
    	 for(int i=0;i<linkedList.size();i++) {
    		 System.out.println(linkedList.get(i));
    	 }
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
 	}  
}
