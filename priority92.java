//How to create PriorityQueue program in java
import java.util.*;

class hash92{
public static void main(String args[]){ 
    PriorityQueue<String> queue=new PriorityQueue<String>(); 
    queue.add("Rajendra");
    queue.add("Mahendra"); 
    queue.add("Raja"); 
    queue.add("Technolamror"); 
    queue.add("Rahul");
    System.out.println("head:"+queue.element());
    System.out.println("head:"+queue.peek()); 
    System.out.println("iterating the queue elements:"); 
    Iterator itr=queue.iterator();
    while(itr.hasNext()){ 
        System.out.println(itr.next());
    }
    queue.remove(); queue.poll();
    System.out.println("after removing two elements:"); 
    Iterator<String> itr2=queue.iterator(); 
    while(itr2.hasNext()){ 
        System.out.println(itr2.next());
    }
}
}
