//How to create TreeMap program in java
import java.util.*;

class Tree95{
public static void main(String args[]){ 
    TreeMap<Integer,String> hm=new TreeMap<Integer,String>(); 
    hm.put(100,"Mayank");
    hm.put(102,"Adil");
    hm.put(101,"Priyanshii"); 
    hm.put(103,"Gyani"); 
    for(Map.Entry m:hm.entrySet()){
    System.out.println(m.getKey()+" "+m.getValue());
    }
}
}
