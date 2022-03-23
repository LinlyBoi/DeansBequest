package Encryption;

import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.Base64;
import java.util.Scanner;

public class Encyptonator
{
    protected static Cipher ecipher;
    protected static Cipher dcipher;

    protected static SecretKey key;

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);


        try
        {

            // generate secret key using DES algorithm
//            key = KeyGenerator.getInstance("DES").generateKey();
            System.out.println("Enter key: ");
            key = convertKey(input.nextLine());


            ecipher = Cipher.getInstance("DES");
            dcipher = Cipher.getInstance("DES");

            // initialize the ciphers with the given key

            ecipher.init(Cipher.ENCRYPT_MODE, key);

            dcipher.init(Cipher.DECRYPT_MODE, key);

            System.out.println("Enter plaintext: ");
            String encrypted = encrypt(input.nextLine());

            String decrypted = decrypt(encrypted);
            System.out.println("Encrypted: " + encrypted);
            System.out.println("Decrypted: " + decrypted);


        } catch (NoSuchAlgorithmException e)
        {
            System.out.println("No Such Algorithm:" + e.getMessage());
        } catch (NoSuchPaddingException e)
        {
            System.out.println("No Such Padding:" + e.getMessage());
        } catch (InvalidKeyException e)
        {
            System.out.println("Invalid Key:" + e.getMessage());
        }

    }


    public static String encrypt(String str)
    {
        try
        {

            // encode the string into a sequence of bytes using the named charset

            // storing the result into a new byte array.

            byte[] utf8 = str.getBytes();

            byte[] enc = ecipher.doFinal(utf8);

// encode to base64

            enc = Base64.getEncoder().encode(enc);

            return new String(enc);

        } catch (Exception e)
        {

            e.printStackTrace();

        }

        return null;

    }

    public static String decrypt(String str)
    {

        try
        {

            // decode with base64 to get bytes

            byte[] dec = Base64.getDecoder().decode(str.getBytes());

            byte[] utf8 = dcipher.doFinal(dec);

// create new string based on the specified charset

            return new String(utf8, StandardCharsets.UTF_8);

        } catch (Exception e)
        {

            e.printStackTrace();

        }

        return null;

    }

    public static SecretKey convertKey(String HexaKey)
    {
        try
        {
            byte[] keyData = HexaKey.getBytes();
            SecretKeyFactory keyF = SecretKeyFactory.getInstance("DES");
            DESKeySpec desKeySpec = new DESKeySpec(keyData);


            return keyF.generateSecret(desKeySpec);


        } catch (NoSuchAlgorithmException | InvalidKeyException | InvalidKeySpecException e)
        {
            e.printStackTrace();
        }
        return null;
    }


}

