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
public class CountPrimeNumber {
    public static void main(String args[]) throws IOException {
       List<Integer> primeList = new ArrayList<Integer>();
       int i=0,count=0;
        while(true){
            boolean prime = true;
            for(int j=2; j<i; j++){
                if(i%j == 0){
                    prime=false;
                    break;
                }
            } 
            if(prime) {
                primeList.add(i);
                count++;
            }
            if(count == 10001)
                break;
            i++;
        }
        System.out.println("10001st "+ i);
    }
}
