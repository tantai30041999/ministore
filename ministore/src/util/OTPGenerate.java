package util;

import java.util.Random;

public class OTPGenerate {

	
	public static char[] OTP(int len)
    {
      
        String numbers = "0123456789";
        Random rndm_method = new Random();
        char[] otp = new char[len];
        for (int i = 0; i < len; i++)
        {
       otp[i] = numbers.charAt(rndm_method.nextInt(numbers.length()));
        }
        return otp;
    }
	public static void main(String[] args) {
		System.out.println(OTP(6));
	}
}
