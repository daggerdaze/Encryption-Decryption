package encryptdecrypt;

public interface Algorithm {
    String encrypt(String str,int k);
    String decrypt(String str,int k);
}
