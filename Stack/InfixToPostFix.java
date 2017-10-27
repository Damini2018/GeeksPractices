import java.util.*;

public class InfixToPostFix{
public static void main(String[] args) {
	String sr="a+b*c+d";
	Stack<Character> s=new Stack<>();
	String res="";
	int n= sr.length();
	for(int i=0;i<n;i++){
		char c= sr.charAt(i);
		if(Character.isLetterOrDigit(c)){
			res+=c;
		}
		else if(c=='('){
			
				while(!s.isEmpty() && s.peek()!='('){
					res+=s.pop();
					}
					if(s.isEmpty() && s.peek()!='(')
					{	System.out.println("invalid");
					break;}
			       else s.pop();

		}
		else{
			while(!s.isEmpty() && precednse(c)<=precednse(s.peek() ))
				res+=s.pop();
			s.push(c);
		}
	}
	while(!s.isEmpty()) res+=s.pop();
	System.out.println(res);

}

public static int precednse(char ch){
	switch (ch) {
		case '+':
		case '-': return 1;
		case '*':
		case '/': return 2;
		case '^' : return 3;

	}
	return -1;
}

	
}