// Java program to remove punctuation from a given string
 
public class PunctucationRemove
{
    public static void main(String[] args)
    {
        // input string
        String str = "Welcome ???@@##$ to#$% Geeks%$^for$%^&Geeks";
         
        // similar to Matcher.replaceAll
        str = str.replaceAll("\\p{Punct}","");
         
        System.out.println(str);
        System.out.println("I \n m \n a \n girl");
    }
     

}
// This code is contributed by Gaurav Miglani
