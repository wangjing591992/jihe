package fanxing;

public class Fx2 {
    public static void main(String[] args) {
		Utils2<Work2> utils2 = new Utils2<Work2>();
		
		utils2.setObject(new Work2());
		Work2 work = utils2.getObject();
		work.setName("余罪");
		String name = work.getName();
		System.out.println(name);
		
		
	} 
	
	
	
	
}
