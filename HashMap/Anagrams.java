import java.util.*;
import java.io.*;
import java.net.*;

public class Anagrams
{
	public static void main(String[] args) throws IOException
	{
		URL url1 = new URL("http://andrew.cmu.edu/course/15-121/dictionary.txt");
		URL url2= new URL("https://alvinalexander.com/blog/post/java/java-how-read-from-url-string-text");
		Scanner sc = new Scanner( url2.openStream() );

		HashMap<String, ArrayList<String>> map =  new HashMap<String, ArrayList<String>>();
		int count=0;
		while( sc.hasNextLine()  && count<4 )
		{
			/*String word = sc.nextLine();
			String sortedWord = sortString(word); // this is a key

			ArrayList<String> anagrams = map.get( sortedWord );  //this is a value

			if( anagrams == null ) anagrams = new ArrayList<String>();

			anagrams.add(word);
			map.put(sortedWord, anagrams);
		}
		System.out.println(map.get(sortString("bread")));   //testing
		System.out.println(map);*/

		String sd= sc.nextLine();
		System.out.println(sd);
		count++;

	}
}
	private static String sortString( String w )
	{
		char[] ch = w.toCharArray();
		Arrays.sort(ch);
		return new String(ch);
	}
}