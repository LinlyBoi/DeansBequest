package Encryption;

import org.junit.jupiter.api.Test;

import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import static org.testng.AssertJUnit.assertEquals;

class EncyptonatorTest extends Encyptonator
{

    @Test
    void manyquestions()
    {
        try
        {

            // generate secret key using DES algorithm
//            key = KeyGenerator.getInstance("DES").generateKey();
            key = convertKey("3b3898371520f75e");
            String plaintext = "123abc456def7890";


            ecipher = Cipher.getInstance("DES");
            dcipher = Cipher.getInstance("DES");

            // initialize the ciphers with the given key

            ecipher.init(Cipher.ENCRYPT_MODE, key);

            dcipher.init(Cipher.DECRYPT_MODE, key);

            String encrypted = encrypt(plaintext);
            System.out.println(encrypted);

            String decrypted = decrypt(encrypted);
            assertEquals(decrypted, plaintext);
            String dec = decrypt("LJrviRhD0DtdRy9DL8HoxNHK37k7D3/t");
            assertEquals(plaintext, dec);
        }
        catch (NoSuchAlgorithmException e)
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

    @Test
    void encrypt()
    {

    }

    @Test
    void decrypt()
    {
    }

    @Test
    void convertStringToSecretKey()
    {
    }
}