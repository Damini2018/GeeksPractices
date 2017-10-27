public class ToggleCharCase{
	public static void main(String[] args) {
		String s="helloOOOPPPc";
		String n="";
		for(int i=0;i<s.length();i++){
			int c=(int)s.charAt(i);
			if(c>64 && c<91){
				c=c+32;
				//s=s.substring(0,i)+(char)c+s.substring(i,s.length());
				n=n+(char)c;
			}
			else{
				 c=c-32;
				// s=s.substring(0,i)+(char)c+s.substring(i,s.length());
				n=n+(char)c;
			}
			if(i!=s.length()-1 && i!=0)
				s=s.substring(0,i)+(char)c+s.substring(i+1,s.length());
			else if(i==0) s=(char)c+s.substring(i+1,s.length());
			else if(i==s.length()-1) s=s.substring(0,i)+(char)c;
		}

		System.out.println(n);
		System.out.println("hello the testing is "+s);

	}
}