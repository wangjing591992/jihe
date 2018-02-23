package fanxing;
/**
 * 若是直接定义在泛型类上,则泛型就规定死了,在下面的write和show的泛型就会和类的泛型同步,
 * 不能满足write和show操作不同的数据类型
 * 所以将泛型放在方法上
 * @author wangjing
 *
 */
public class Demo3<T> {
	
	public void write(T t) {
		System.out.println("write==="+t);
	}
	//这里的T 是方法上的泛型,和类上的泛型Demo3<T>不冲突,只是名字相同
	public<T> void show(T t) {
		System.out.println("show==="+t);
	}
	
	//给静态方法定义泛型,在主函数里传的值不确定是什么类型,和上面类的泛型不冲突,优先看静态方法
	//的泛型,
	public static<T> void method(T t) {
		System.out.println("method==="+t);
	}
	
}
