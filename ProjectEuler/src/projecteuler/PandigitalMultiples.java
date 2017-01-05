package projecteuler;

import java.io.IOException;
import java.util.Arrays;

public class PandigitalMultiples {
	public static void main(String args[]) throws IOException {
		long result = 0;
		for (long i = 9387; i >= 9234; i--) {
		    result = concat(i, 2*i);
		    if(isPandigital(result)){
		    	System.out.println(result);
		    	System.out.println(i);
		        break;
		    }
		}
	}
	
	public static long concat(long i, long j) {
		String concatenatedString = i+""+j;
		return Long.parseLong(concatenatedString);		
	}
	
	public static boolean isPandigital(long num) {
		String number = Long.toString(num);
		StringBuilder s = new StringBuilder(number);
        char[] chars = number.toCharArray();
        Arrays.sort(chars);
        String sorted = new String(chars);
        return sorted.equals("123456789") ? true : false;
		
	}
}
