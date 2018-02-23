package treeset;

import java.util.Comparator;

/**
 * 比较器,实现Comparator接口,复写compare方法
 * 将比较器传递给treeset
 * @author wangjing
 *
 */
public class MyComparator1 implements Comparator<Object> {

	@Override
	public int compare(Object o1, Object o2) {
		//转成string类型
		 String s1=(String)o1;
		 String s2=(String)o2;
		 //长度相同,再按照自然顺序比较内容
		 if(s1.length()==s2.length()) {
			 return s1.compareTo(s2);
		 }
		 return s1.length()-s2.length();
		 
	}
   
}
