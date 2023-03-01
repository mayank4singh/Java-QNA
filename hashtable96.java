//How to create Hashtable program in java
import java.util.*;
class Hashtable_Technolamror{
public static void main(String args[]){ 
    Hashtable<Integer,String> hm=new Hashtable<Integer,String>();
    hm.put(100,"Mayank");
    hm.put(101,"Priyanshii");
    hm.put(102,"Adil");
    hm.put(103,"Gyani");
    for(Map.Entry m:hm.entrySet()){ 
        System.out.println(m.getKey()+" "+m.getValue());
}
}
}

    

