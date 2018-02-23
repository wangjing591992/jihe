package treeset;

import java.util.Comparator;

/**
 * treeset的第二种比较方式,定义一个比较器(定义一个类实现Comparator接口,重写compare方法),将比较器对象作为参数传递给Treeset集合的构造函数,在比较器里按一定
 * 规则比较对象,
 * treeset的两种比较方式,一是让对象具备可比较性,实现该对象所在的类实现Comparable接口,重写compareTo方法
 *                   二是比较器
 *                   都存在时,以比较器的为主
 * @author wangjing
 *
 */
public class MyComparator implements Comparator<Object> {

	@Override
	public int compare(Object o1, Object o2) {
		 Person p1=(Person)o1;
		 Person p2=(Person)o2;
		 
		 //先按姓名比,相同的话再比较年龄
		 int i = p1.getName().compareTo(p2.getName());
		 //名字相同
		 if(i==0) {
			  //再比较年龄
			 return p1.getAge()-p2.getAge();
		 }
		 return i;
		 
		 
		 
		 
	}
       
}
