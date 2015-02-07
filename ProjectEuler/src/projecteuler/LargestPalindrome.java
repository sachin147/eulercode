/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuler;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sachin tripathi
 */
public class LargestPalindrome {
    public static void main(String args[]) throws IOException {
        int product =0,palindrome=0;
        List<Integer> palindromelist = new ArrayList<Integer>();
        for(int i=100; i<999; i++){
           for(int j=100; j<999; j++){
               product=i*j;
               islargestPalindrome(product, palindromelist);
           } 
        }
        System.out.println(palindromelist.get(palindromelist.size()-1));
        
    }
    
    public static void islargestPalindrome(int product, List<Integer> palindromelist){
       int largest=0;
       boolean isPalindrome = false;
       StringBuilder x = new StringBuilder(Integer.toString(product));
       if(Integer.toString(product).equals(x.reverse().toString())) {
           isPalindrome = true;
           if(product > largest){
               largest = product;
               palindromelist.add(largest);
           }
       }
    }
}
