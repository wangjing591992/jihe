import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;


public class Xh {
    public static void main(String[] args) {
    /* 
     String string1 = new String("aa");
     String string2 = new String("aa");
      System.out.println(string1==string2);
      System.out.println(string1.equals(string2));
      
      Person person1 = new Person();
      person1.setName("张三"); 
      person1.setAge(1);
      
      Person person2 = new Person();
      person2.setName("张三"); 
      person2.setAge(1);	
      
    	System.out.println(person1==person2);//false
    	
    	System.out.println(person1.equals(person2));//false
    	
    	
    	System.out.println("aa".equals("aa"));*/
    	
    	
    	
    /*	long round = Math.round(-5.6);
    	System.out.println(round);
    
    	System.out.println(Math.floor(-5.8));*/
    	
    	
    	 LinkedList<Object> linkedList = new LinkedList<>();
    	    //linkedlist特有的方法addfirst(),addlast()   
    	        linkedList.addFirst("33");
    	    	 linkedList.addLast("aa");
    	    //用getfirst(),getlast()取第一个和最后一个元素
    	       System.out.println("first"+linkedList.getFirst());
    	    	 System.out.println("last"+linkedList.getLast());
    	   //用removeFirst(),removeLast()删除元素,会打印出要删除的元素,然后再删除它 
    	    // 用这个方法时,如果集合中元素为空,(已经被remove调了),则会报异常:
    	//Exception in thread "main" java.util.NoSuchElementException
    	    System.out.println("removeFirst="+linkedList.pollFirst());
    	    	 System.out.println("removeLast="+linkedList.pollLast());
    	    	 System.out.println("removeLast="+linkedList.pollLast());
    	    	 System.out.println("size"+linkedList.size());
    	    	 for(int i=0;i<linkedList.size();i++) {
    	    		 System.out.println(linkedList.get(i));
    	    	 }
    	
    	
	}
}
