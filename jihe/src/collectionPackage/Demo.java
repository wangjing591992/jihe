package collectionPackage;

import java.util.HashSet;
import java.util.Iterator;
/**
 * 需求:同姓名,同年龄就是同一个人,不能存同一个人
 * @author wangjing
 *
 */
public class Demo {
	
	public static void sop(Object obj) {
		
		System.out.println(obj);
	}
	
	
	
    public static void main(String[] args) {
		
       
       HashSet<Object> hashSet = new HashSet<>();
       
       //存入四个对象,先调用hashcode()方法求hash值(即比较地址值)
       //如果hash值相同,再调用equals()方法,比较内容,若内容相同,就说明重复
       //若内容不同(但hash值相同),就在同一个hash值位置上顺延存储
       //注意要重写hashcode()和equals()
       hashSet.add(new Person("余罪1",21));
       hashSet.add(new Person("余罪2",22));
       hashSet.add(new Person("余罪1",21));
       hashSet.add(new Person("余罪4",24));
       
      
   
      /* 打印结果
       余罪1hashcode
       余罪2hashcode
       余罪1hashcode
       余罪1 equals余罪1 //这里余罪1和余罪1hash值相同了,就去equals比较内容
       余罪4hashcode
       余罪4...24
       余罪1...21
       余罪2...22*/
       
       
      Iterator<Object> iterator = hashSet.iterator();
       while(iterator.hasNext()) {
    	
    	    Person next = (Person)iterator.next();
            sop(next.getName()+"..."+next.getAge());
          
       }
       
       
       
       
       
       boolean contains = hashSet.contains(new Person("余罪1", 21));
       System.out.println(contains);
       
       
       boolean remove = hashSet.remove(new Person("余罪1", 21));
       System.out.println(remove);
	}
}
