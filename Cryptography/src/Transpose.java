public class Transpose extends Cipher {
    private String encode;
    private String decode;
    public static String encode(String s)
    {
        return reverseWordInMyString(s);


    }

    public static String reverseWordInMyString(String str)
    {
        /* The split() method of String class splits
         * a string in several strings based on the
         * delimiter passed as an argument to it
         */
        String[] words = str.split(" ");
        String reversedString = "";
        for (int i = 0; i < words.length; i++)
        {
            String word = words[i];
            String reverseWord = "";
            for (int j = word.length()-1; j >= 0; j--)
            {
                /* The charAt() function returns the character
                 * at the given position in a string
                 */
                reverseWord = reverseWord + word.charAt(j);
            }
            reversedString = reversedString + reverseWord + " ";
        }

        return reversedString;
    }
    public static String decode(String s)
    {
        return reverseWordInMyString(s);

    }


}
