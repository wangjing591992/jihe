package fanxing;

import java.util.Comparator;

/**
 * 
 *需求:将字符串先按长度比较,若长度相同,再按自然顺序比较
 * @author wangjing
 * 比较器:实现  Comparator接口,给它一个泛型<string>
 * 重写compare方法
 */
public class ComparatorTest implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		//若长度相同,再按自然顺序比较内容
		if(o1.length()==o2.length()) {
			return o1.compareTo(o2);
		}
		return o1.length()-o2.length();
	}
   
}
