import java.util.HashSet;
import java.util.Iterator;


public class Test {
   public static void main(String[] args) {
	   
	   VariantTest variantTest1 = new VariantTest();
	   VariantTest variantTest2 = new VariantTest();
	  
	   variantTest1=new VariantTest();
	   
	   
	  /* VariantTest variantTest = new VariantTest();
       VariantTest.staticVar++;
       variantTest.instanceVar++;
     
       VariantTest variantTest2 = new VariantTest();
       VariantTest variantTest3 = new VariantTest();
       VariantTest variantTest4 = new VariantTest();
       
       Integer integer = new Integer("11");
       
       Integer valueOf = Integer.valueOf("22");
       System.out.println(valueOf);*/
     
    /*  System.out.println(Math.round(-11.4)); 
      System.out.println(Math.floor(-10.9));*/
       
	   HashSet<Object> hashSet = new HashSet<>();
       hashSet.add("11");
       hashSet.add("22");
       hashSet.add("22");
       hashSet.add("33");

      Iterator<Object> iterator = hashSet.iterator();
      
       while(iterator.hasNext()) {
    	     Object next = iterator.next();
             System.out.println(next);
       
       }
       
       
       
       
}
}
