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
public class NumberLetterCounts {

    public static void main(String args[]) throws IOException {
        String number = "";
        for (int i = 0; i <= 1000; i++) {
            if (i == 1000) {
                number += numToWords(i);
            }

            if (i < 20) {
                number += numToWords(i);
            }

            if (i >= 20 && i < 100) {
                if (i % 10 == 0) {
                    number += numToWords(i);
                } else {
                    number += numToWords((i / 10) * 10);
                    number += numToWords(i % 10);
                }
            }

            if (i >= 100 && i < 1000) {
                if (i % 100 == 0) {
                    number += numToWords(i / 100);
                    number += numToWords(100);
                } else {
                    number += numToWords(i / 100);
                    number += numToWords(100);
                    int num = i % 100;
                    if (num < 20) {
                        number += numToWords(num);
                    }
                    if (num >= 20 && num < 100) {
                        if ((num % 10) == 0) {
                            number += numToWords(num);
                        } else {
                            number += numToWords((num / 10) * 10);
                            number += numToWords(num % 10);

                        }
                    }
                }
            }
        }
        
        System.out.println(number.length());
    }

    public static String numToWords(int n) {
        switch (n) {
            case 1:
                return "One";
            case 2:
                return "Two";
            case 3:
                return "Three";
            case 4:
                return "Four";
            case 5:
                return "Five";
            case 6:
                return "Six";
            case 7:
                return "Seven";
            case 8:
                return "Eight";
            case 9:
                return "Nine";
            case 10:
                return "Ten";
            case 11:
                return "Eleven";
            case 12:
                return "Twelve";
            case 13:
                return "Thirteen";
            case 14:
                return "Fourteen";
            case 15:
                return "Fifteen";
            case 16:
                return "Sixteen";
            case 17:
                return "Seventeen";
            case 18:
                return "Eighteen";
            case 19:
                return "Nineteen";
            case 20:
                return "Twenty";
            case 30:
                return "Thirty";
            case 40:
                return "Forty";
            case 50:
                return "Fifty";
            case 60:
                return "Sixty";
            case 70:
                return "Seventy";
            case 80:
                return "Eighty";
            case 90:
                return "Ninety";
            case 100:
                return "Hundred";
            case 1000:
                return "Thousand";
            default:
                return "";
        }
    }
}
