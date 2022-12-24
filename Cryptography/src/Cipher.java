import java.util.StringTokenizer;

public class Cipher {
    private String encrypt;
    private String decrypt;
    private String encode;
    private String decode;


    public String encrypt(String s) {

        StringBuffer result = new StringBuffer("");

        StringTokenizer words = new StringTokenizer(s);// Tokenize

        while (words.hasMoreTokens()) {        // Encode each word

            result.append(Caeser.encode(words.nextToken()) + " ");

        }

        return result.toString();        // Return result

    } // encrypt()*/
    public String decrypt(String s) {

        StringBuffer result = new StringBuffer("");

        StringTokenizer words = new StringTokenizer(s);// Tokenize

        while (words.hasMoreTokens()) {        // Encode each word

            result.append(Caeser.decode(words.nextToken()) + " ");

        }

        return result.toString();        // Return result

    } // encrypt()

    public String toString() {
        return "Cipher{" +
                "encrypt='" + encrypt + '\'' +
                ", decrypt='" + decrypt + '\'' +
                ", encode='" + encode + '\'' +
                ", decode='" + decode + '\'' +
                '}';
    }
}
