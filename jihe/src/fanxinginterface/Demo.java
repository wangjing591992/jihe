package fanxinginterface;

public class Demo {
   public static void main(String[] args) {
	    IMplInterface<String> iMplInterface = new IMplInterface<String>();

         iMplInterface.show("haah");

         //给接口定义了泛型,且其实现类也是这个泛型,在这里指定泛型的类型为<String>,则传值int型编译报错
         //iMplInterface.show(22);
   
   } 
}
