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
public class PythagoreanTriplet {
    public static void main(String args[]) throws IOException {
        int a=0,b=0,c=0;   
        boolean found = false;
        for(a=1; a<1000/3; a++) {
            for(b=a; b<1000/2; b++) {
                c=1000-b-a;
                if(Math.pow(a,2)+Math.pow(b,2)==Math.pow(c,2)){
                    found = true;
                    break;
                }
            }
            if(found) {
                break;
            }
        }
        System.out.println("a"+a+"b"+b+"c"+c);
        System.out.println("sum "+(a+b+c));
        System.out.println(a*b*c);
    }
}
