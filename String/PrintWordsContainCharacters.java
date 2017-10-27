public class PrintWordsContainCharacters{
 	public static void main(String[] args) {
 		String s="sun";
   		String[] sr= {"sunday","utensile","sss","soup"};
   		boolean flag=false;
   		for(int i=0;i<sr.length;i++){
   			for(int j=0;j<s.length();j++){
   				char c =s.charAt(j);
   				if(sr[i].indexOf(c)>-1){flag=true;}
   				else {
   					flag=false;
   					break;}
   			}
   			if(flag) System.out.println(sr[i]);
   		}

 	}
}