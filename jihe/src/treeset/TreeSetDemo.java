package treeset;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * 给treeset集合中的元素排序,  姓名年龄相同是同一个人
 * 按照年龄排序
 * Treeset排序的第一种方式:让元素具备可比较性,对象所在的类实现Comparable接口,重写compareTo()方法,
 * @author wangjing
 *
 */
public class TreeSetDemo {
	public static void main(String[] args) {
		
		//TreeSet<Object> t = new TreeSet<Object>();
		
		TreeSet<Object> t = new TreeSet<Object>(new MyComparator());
		
		t.add(new Person("lisi2",22));
		t.add(new Person("lisi1",21));
		t.add(new Person("lisi4",24));
		t.add(new Person("lisi3",23));
		t.add(new Person("lisi6",23));
		t.add(new Person("lisi2",22));
		
		
		Iterator<Object> iterator = t.iterator();
		while (iterator.hasNext()) {
		   Person next =(Person)iterator.next();

		   System.out.println(next.getName()+"..."+next.getAge());
	
		
		}

	}
	
	

	
	
	
}


