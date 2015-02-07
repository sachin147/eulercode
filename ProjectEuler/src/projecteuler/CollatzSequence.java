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
public class CollatzSequence {
    public static void main( String args[]) throws IOException {
        List<Integer> list = new ArrayList<>();
        int num = 100;
        while(num != 1) {
            if(num % 2 == 0){
                num = num/2;
            } else {
                num = num*3 + 1;
            }
            
            list.add(num);
            
        }
        System.out.println(list);
    }
    
}
