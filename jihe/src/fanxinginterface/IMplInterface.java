package fanxinginterface;

public class IMplInterface<T> implements FanxingInterface<T>{

	@Override
	public void show(T t) {
	     System.out.println("show==="+t);
		
	}
      
}
