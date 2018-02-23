package treeset;

import java.util.Iterator;
import java.util.TreeSet;
/**
 * 需求:按照字符串的长度从小到大排序,若长度相同,还要按照自然顺序排序
 * 解决:用比较器
 * @author wangjing
 *
 */
public class TreeSetTest1 {
     public static void main(String[] args) {
    	//将比较器传递给treeset
		TreeSet<Object> treeSet = new TreeSet<>(new MyComparator1());
		
		treeSet.add("aaa");
		treeSet.add("11");
		treeSet.add("ab");
		treeSet.add("acd");
		treeSet.add("erfg");
		treeSet.add("bbfeds");
		treeSet.add("bafeds");
		
		Iterator<Object> iterator = treeSet.iterator();
		while(iterator.hasNext()) {
			Object next = iterator.next();
			System.out.println(next);
			
		}
		
		
	}
}
