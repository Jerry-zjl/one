package xm.zjl.ciper;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5 {
	
	public static String md5() throws NoSuchAlgorithmException{
		MessageDigest digest = MessageDigest.getInstance("MD5");
		String digestString = digest.getAlgorithm();
		byte[] dString = digest.digest("朱建立".getBytes());
		System.out.println(dString.toString());
		System.out.println(digestString);
		System.out.println(digest.getProvider());
		return null;
	}
	public static void main(String[] args) throws NoSuchAlgorithmException {
		MD5.md5();
	}
}
