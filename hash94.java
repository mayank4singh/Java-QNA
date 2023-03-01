//How to create LinkedHashMap program in java
import java.util.*;
    
class hash94{
public static void main(String args[]){
    LinkedHashMap<Integer,String> hm=new LinkedHashMap<Integer,String>(); 
    hm.put(100,"Mayank");
    hm.put(101,"Shahsank");
    hm.put(102,"Shubham");
    for(Map.Entry m:hm.entrySet()){ 
        System.out.println(m.getKey()+" "+m.getValue());
}
}
}
