package fanxing;

public class Fx3 {
    public static void main(String[] args) {
		Demo3<String> demo3 = new Demo3<String>();
		demo3.write("haha");
		demo3.show(1);
		demo3.show(true);
		//这里write上没有定义泛型,就和类上的泛型是统一的,
		//上面类上传的泛型是<String>所以调用write方法也只能传string类型的值
		//传了int类型的值,编译不通过
		//demo3.write(22);
		
		demo3.method("22");
		demo3.method(false);
		demo3.method(11);
	}
}
