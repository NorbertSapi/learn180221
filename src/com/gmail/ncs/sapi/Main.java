package com.gmail.ncs.sapi;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("the sum of the number's digit is: " + sumDigit(12578));
        System.out.println("the sum of the number's digit is: " + sumDigit(-156));
        System.out.println("the sum of the number's digit is: " + sumDigit(8));
        System.out.println("the sum of the number's digit is: " + sumDigit(125));
    }
    public static int sumDigit(int number) {
        int sumNumberDigit = 0;
        if (number < 10) {
            return -1;
        }
        while (number >= 10) {
            int digit = number % 10;
            number /= 10;
            sumNumberDigit += digit;
            if (number < 10) {
                sumNumberDigit += number;
            }
            System.out.println(sumNumberDigit);
        }
        return sumNumberDigit;
    }
}

/*
public static int sumDigit(int number) {
    int sumNumber;
    if (number >= 10) {
        int a = number % 10;
        int b = ((number - a) / 10) % 10;
        int c = ((number - (b * 10 - a)) / 100)%10;
        int d = (number - (b * 10 + a + c * 100))/1000%10;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        sumNumber = a + b + c + d;
    }
    else {
        return -1;
    }
    return sumNumber;
}
 */