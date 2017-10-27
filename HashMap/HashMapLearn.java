import java.util.*;

public class HashMapLearn{
	public static void main(String[] args) {
			HashMap<Integer,String> map= new HashMap<>();
			print(map);
			map.put(1,"Daminee");
			map.put(2,"Mini");
			map.put(3,"Avi");
			map.put(3,"kajal");
			map.put(4,"kajal");
			print(map);
			printEntrySet(map);
			System.out.println("daminee   "+sortString("daminee"));
		}	

		public static void print(HashMap<Integer,String> hm){
			if(hm.size()==0){
				System.out.println("HashMap is empty");
			}
			else{
			Set<Integer> keySet1= hm.keySet();
			for(Integer i:keySet1){
				System.out.println(hm.get(i)+" ");
			}

			}
		}

		public static void printEntrySet(HashMap<Integer,String> hm ){
			if(hm.size()==0){
				System.out.println("HashMap is empty");
			}
			else{
				Set<Map.Entry<Integer,String>> ertyset=hm.entrySet();
				Iterator<Map.Entry<Integer,String>> it= ertyset.iterator();
				while(it.hasNext()){
					Map.Entry en= it.next();
					System.out.print(en.getKey()+" "+en.getValue());
				}


				/*Set<Map.Entry<Integer, String>> entrySet = hm.entrySet();
					for (Map.Entry entry : entrySet) {
					   System.out.println("------------------------------------------------");
					   System.out.println("looping HashMap in Java using EntrySet and java5 for loop");
					   System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
					         }
*/


			}
		}
}