package treeset;

/**
 * 要想让对象具备可比较性,实现该对象所在的类实现Comparable接口,重写compareTo方法
 * @author wangjing
 *
 */
public class Person implements Comparable<Object>{
   private String name;
   
   private int age;
public Person(String name, int age) {
	
	this.name = name;
	this.age = age;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}



@Override
public int compareTo(Object obj) {
	if(!(obj instanceof Person)) {
		throw new RuntimeException("不是person对象");
	}
	
	 Person p=(Person)obj;
	 
	 System.out.println(this.name+"compare"+p.name); 
	 
	if(this.getAge()>p.getAge()) {
		return 1;
	}
	if(this.getAge()==p.getAge()) {
		System.out.println(this.name+"--comparato--"+p.name);
		return this.name.compareTo(p.name);
	}
	
	return -1;
}  




 

/*//重写hashcode方法
public  int hashCode() {
	  System.out.println(this.name+"hashcode");
	  //调用string类的hashcode()方法,
	  //可能person1的name得到的hash值40,它的age是20,则hashcode值是60
	  //person2的name得到的hash值20,它年龄40,则它的hashcode值也是60,
	  //那么他两的hash值碰巧相同了,就还得比较equals()方法,效率低,所以这里*39保证hash值不重复
   return this.name.hashCode()+age*39;
}

//重写equals方法
 public boolean equals(Object obj) {
	
	  if(!(obj instanceof Person)) {
		  return false;
	  }
	  Person p =(Person) obj;
	  System.out.println(this.name+" equals"+p.name);
	return this.name.equals(p.name) && this.age ==p.age ;
	 
	 
 }
*/
   
}
