public class NextBinaryNumber{
	public static void main(String[] args) {
		String s="111";
		int len= s.length();
		boolean flag=false;
		for(int i=len-1;i>-1;i--){
			//System.out.println("inside for loop");
			if(s.charAt(i)=='1') {
				s=s.substring(0,i)+0+s.substring(i+1,s.length());

			}
			else if(s.charAt(i)=='0'){
				flag=true;
				s=s.substring(0,i)+1+s.substring(i+1,s.length());
				break;
			}
		}

		if(flag==false){
			s='1'+s;
		}
		System.out.println(s);
	}
}
