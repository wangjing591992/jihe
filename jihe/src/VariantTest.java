
public class VariantTest {
	//静态变量(类变量,在静态池中,先于对象存在,也称为类变量)
	public static int staticVar = 0; 
	//实例变量(某个对象的属性)
	public int instanceVar = 0; 
	
	public VariantTest(){
		staticVar++;
		instanceVar++;
		System.out.println("staticVar=" + staticVar + ",instanceVar=" + instanceVar);
	}
}
