public class Main {
    public static void main(String args[]){
        Caeser caesar = new Caeser();



        String plain = "this is the secret message";   // Here's the message

        String secret = caesar.encrypt(plain);
        //System.out.println(secret);
        System.out.println(" ********* Caesar Cipher Encryption *********");

        System.out.println("PlainText: " + plain);    // Display the results

        System.out.println("Encrypted: " + secret);

        System.out.println("Decrypted: " + caesar.decrypt(secret));// Decrypt





        Transpose transpose = new Transpose();

        secret = transpose.encode(plain);



        System.out.println("\n ********* Transpose Cipher Encryption *********");

        System.out.println("PlainText: " + plain);    // Display the results

        System.out.println("Encrypted: " + secret);

        System.out.println("Decrypted: " + transpose.decode(secret));// Decrypt

    }

}

