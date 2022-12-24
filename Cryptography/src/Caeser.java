import java.util.StringTokenizer;

public class Caeser extends Cipher{
    private String encode;
    private String decode;



    public static int alphabetToNumber(char a) {
        return a - 65;
    }
    public static char numberToAlphabet(int i) {
        return (char) (i + 65);
    }
    public static String encode(String s)
    {
        String temp="";

        for (int i = 0; i < s.length(); i++) {

            temp=temp+numberToAlphabet(alphabetToNumber(s.charAt(i))+3);

        }
        return temp;

    }
    public static String decode(String s)
    {
        String temp="";

        for (int i = 0; i < s.length(); i++) {

            temp=temp+numberToAlphabet(alphabetToNumber(s.charAt(i))-3);

        }
        return temp;

    }

}
