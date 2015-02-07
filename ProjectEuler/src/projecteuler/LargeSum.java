/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuler;

import java.io.IOException;
import java.math.BigInteger;

/**
 *
 * @author Sachin tripathi
 */
public class LargeSum {

    public static void main(String args[]) throws IOException {
        BigInteger nums = new BigInteger("37107287533902102798797998220837590246510135740250");
        BigInteger n;
        String a[]= new String[100];
        a[0] = "46376937677490009712648124896970078050417018260538";
        for (int i = 1; i <= 99; i++) {
            n = new BigInteger(a[0]);
            nums = nums.add(n);            
        }
        System.out.println(nums);
    }
}
