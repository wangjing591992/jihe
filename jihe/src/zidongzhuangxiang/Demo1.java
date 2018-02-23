package zidongzhuangxiang;

public class Demo1 {
	public static void main(String[] args) {
		/*Integer x = new Integer("111");
		Integer y = new Integer(111);

		// ==是比较两侧的对象是否是同一个对象,比较的是内存地址
		// 上面x,y是new的两个对象,内存地址不一样
		sop("x==y" + (x == y));// false

		// equals是对象里的方法,比较对象的值是否相同,都是111
		sop("x.equals(y)" + x.equals(y));// true

		System.out.println(null == null);*/
		
		/*Integer x=4;  //这里的4是基本数据类型,而integer是类类型,将4自动
		              //装箱,就不需要再Integer x=new Integer(4)了
		              //x+2,x本来是引用数据类型,有一个自动拆箱,将类类型拆成
		               //基本数据类型,就能参与运算了
		System.out.println(x+2);*/
		
		
		
		Integer x=128;
		Integer y=128;
		//128自动装箱后,==是判断对象的内存地址,这里相当于new了两个对象,所以为false
		sop("x==y"+(x==y));
		
		
		//在jdk1.5以后,针对byte类型(-128--127)数据类型,指向同一个对象(相当于new了一个对象)
		//==比较相同
		Integer x1=127;
		Integer y1=127;
		
		sop("x1==y1"+(x1==y1));
		
		
		

	}

	public static void sop(String str) {
		System.out.println(str);
	}
}
