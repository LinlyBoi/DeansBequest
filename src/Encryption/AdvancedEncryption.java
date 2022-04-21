package Encryption;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.crypto.*;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.*;
import java.util.Base64;

public class AdvancedEncryption
{


    private static final String CIPHER = "AES";

    private static Key getSecureRandomKey(String cipher, int keySize)
    {
        byte[] secureRandomKeyBytes = new byte[keySize / 8];
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextBytes(secureRandomKeyBytes);
        return new SecretKeySpec(secureRandomKeyBytes, cipher);
    }

    public static String encrypt(String algorithm, String input, SecretKey key) throws NoSuchPaddingException, NoSuchAlgorithmException,
            InvalidKeyException,
            BadPaddingException, IllegalBlockSizeException
    {

        Cipher cipher = Cipher.getInstance(algorithm);
        cipher.init(Cipher.ENCRYPT_MODE, key);
        byte[] cipherText = cipher.doFinal(input.getBytes(StandardCharsets.UTF_8));
        return Base64.getEncoder().encodeToString(cipherText);
    }

    public static String decrypt(String algorithm, String cipherText, SecretKey key) throws NoSuchPaddingException, NoSuchAlgorithmException,
            InvalidKeyException,
            BadPaddingException, IllegalBlockSizeException
    {

        Cipher cipher = Cipher.getInstance(algorithm);
        cipher.init(Cipher.DECRYPT_MODE, key);
        byte[] plainText = cipher.doFinal(Base64.getDecoder().decode(cipherText));

        return new String(plainText);
    }

    @Test
    void Key_Of_128_Speed()
            throws NoSuchAlgorithmException, IllegalBlockSizeException, InvalidKeyException,
            BadPaddingException, InvalidAlgorithmParameterException, NoSuchPaddingException
    {

        String input = "012345678901234567890012345678912";
        SecretKey key = (SecretKey) getSecureRandomKey("AES", 128);
        String algorithm = "AES/ECB/PKCS5Padding";
        String cipherText = encrypt(algorithm, input , key);
        long start = System.nanoTime();
        String plainText = decrypt(algorithm, cipherText, key);
        long finish = System.nanoTime();
        Assertions.assertEquals(input, plainText);
        long time = finish - start;
        System.out.println(time + " nanoseconds");
        System.out.println(cipherText);
        System.out.println(plainText);
    }

}

