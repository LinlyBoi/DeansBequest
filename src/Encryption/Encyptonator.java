package Encryption;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Encyptonator
{
       private static Cipher ecipher;
    private static Cipher dcipher;

    private static SecretKey key;


    public static String encrypt(String str)
    {

        try {

            // encode the string into a sequence of bytes using the named charset

            // storing the result into a new byte array.

            byte[] utf8 = str.getBytes(StandardCharsets.UTF_8);

            byte[] enc = ecipher.doFinal(utf8);

// encode to base64

            enc = Base64.getEncoder().encode(enc);

            return new String(enc);

        }


  catch (Exception e)
  {

    e.printStackTrace();

  }

  return null;

    }

    public static String decrypt(String str) {

  try {

    // decode with base64 to get bytes

byte[] dec = Base64.getDecoder().decode(str.getBytes());

byte[] utf8 = dcipher.doFinal(dec);

// create new string based on the specified charset

return new String(utf8, StandardCharsets.UTF_8);

  }

  catch (Exception e) {

    e.printStackTrace();

  }

  return null;

    }
    public static SecretKey convertStringToSecretKey(String encodedKey)
    {
        byte[] decodedKey = Base64.getDecoder().decode(encodedKey);
        SecretKey originalKey = new SecretKeySpec(decodedKey,0,decodedKey.length,"DES");
        return originalKey;
    }

}

