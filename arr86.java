import java.util.*; 

class Arrylist_Technolamror{
    public static void main(String args[]){
    ArrayList<String> list=new ArrayList<String>();//Creating arraylist 
    list.add("Rajendra");//Adding object in arraylist 
    list.add("Mahendra");
    list.add("Raja"); 
    list.add("Technolamror");
    //Traversing list through Iterator 
    Iterator itr=list.iterator(); 
    while(itr.hasNext()){ 
        System.out.println(itr.next());
    }
    }
    }