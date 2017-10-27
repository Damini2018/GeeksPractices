import java.util.*;

public class TestCollection13{
 public static void main(String args[]){
 
  HashMap<Integer,Node> hm=new HashMap<Integer,Node>();

  hm.put(100,ne);
  hm.put(101,"Vijay");
  hm.put(102,"Rahul");
   hm.put(102,"Rahul");
  for(Map.Entry m:hm.entrySet()){
   System.out.println(m.getKey()+" "+m.getValue());
  }
 }
}

class Node{
	String value;
	int count;
	public 	Node(String s){
		this.value=s;
		this.count=0;
	}
}
