//How to create LinkedList program in java

import java.util.*;


    public class linked87{
        public static void main(String args[]){
            LinkedList<String> al=new LinkedList();
                al.add("Rajendra");//Adding object in LinkedList 
                al.add("Mahendra");
                al.add("Raja");
                al.add("Technolamror");
                Iterator<String> itr=al.iterator(); 
                while(itr.hasNext()){ 
                    System.out.println(itr.next());
}
}
}
