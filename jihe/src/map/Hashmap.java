package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Hashmap {
    public static void main(String[] args) {
    	/*//hashmap可以使用null作为键和值,
		Map<String, String> hashmap = new HashMap<String, String>();
    	
		//在hashmap集合中,若存入的键相同,后一个键的值覆盖前一个的值,且会返回上一个相同的键对应的值,
		//eg:hashmap.put("01", "余罪")会返回上一个"01"对应的值,没有即返回null,
		//再存hashmap.put("01", "林宇婧"),返回上一个键01的值,即返回"余罪",同时后一个键对应的值"林宇婧"覆盖了"余罪"
		System.out.println(hashmap.put("01", "余罪"));
		System.out.println(hashmap.put("01", "林宇婧"));
		System.out.println(hashmap.put("01", "杨宇"));
		hashmap.put("02", "张三");
		hashmap.put("03", "李四");
		
		
    	System.out.println(hashmap);*/
    	
    	
    	/*Map<String,String> hashMap = new HashMap<String,String>();
    	hashMap.put("01", "张三");
    	hashMap.put("02", "李四");
    	hashMap.put("03", "王五");
    
    	hashMap.put("04", "天齐");
    	
    	//先获取hashmap集合中所有的键的set集合,用keyset方法
    	Set<String> keySet = hashMap.keySet();
    	
    	//有了set集合,就可以使用迭代器取值
    	Iterator<String> iterator = keySet.iterator();
    	while(iterator.hasNext()) {
    		String key = iterator.next();
    	    //取到键再通过键取值
    		String value = hashMap.get(key);
    		sop(value);
    	}*/
    	
    	HashMap<String,String> hashMap = new HashMap<String,String>();
    	
    	hashMap.put("01", "张三");
    	hashMap.put("02", "李四");
    	hashMap.put("03", "王五");
        hashMap.put("04", "天齐");
        
        //用entrymap获取key-value的映射关系,在该映射关系里有键的集合和值的集合
        Set<Map.Entry<String, String>> entrySet = hashMap.entrySet();
    	
        Iterator<Entry<String, String>> iterator = entrySet.iterator();
        while(iterator.hasNext()) {
        	Entry<String, String> next = iterator.next();
            //用getkey()获取键的集合
        	String key = next.getKey();
        	//用getvalue获取值的集合
            String value = next.getValue();
            
            sop(key+"  "+value);
        }
    	
    	
    	
    	
    	
    	
	}
    
    public static void sop(Object obj) {
    	System.out.println(obj);
		
    }
}
