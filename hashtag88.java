//How to create Hashset program in java

import java.util.*;
class TestCollection9{
public static void main(String args[]){
//Creating HashSet and adding elements 
HashSet<String> set=new HashSet<String>(); 
set.add("Mayank");
set.add("Adil");
set.add("Priyanshii");
 set.add("Technolamror");
//Traversing elements 
Iterator<String> itr=set.iterator(); 
while(itr.hasNext()){ 
    System.out.println(itr.next());
}
}
}
