/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuler;

import java.io.IOException;

/**
 *
 * @author Sachin tripathi
 */
public class SumDigits {

    public static void main(String args[]) throws IOException {
        int temp = 0;
        int num =(int) Math.pow(2, 15);
        while (num != 0) {
            temp = temp + num % 10;
            num = num/10;
        }
        System.out.println(temp);
    }
}
