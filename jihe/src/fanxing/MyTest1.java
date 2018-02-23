package fanxing;

import java.util.Iterator;
import java.util.TreeSet;

public class MyTest1 {
      public static void main(String[] args) {
		  //一定要记得将比较器写在treeset初始化里
    	  TreeSet<String> treeSet = new TreeSet<String>(new ComparatorTest());
    	  //因为上面的泛型<string>,所以treeset里要存string类型
    	  treeSet.add("aaa");
    	
    	  treeSet.add("rtetre");
    	  treeSet.add("aed");
    	  treeSet.add("e");
    	  
    	   Iterator<String> iterator = treeSet.iterator();
    	  while(iterator.hasNext()) {
    		 String next = iterator.next();
    		  
    		  System.out.println(next);
    	  }
    	  
	}
}
