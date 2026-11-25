package com.aryan.basic;

public class Basics {
    
    public boolean isPrime (int number) {
        if (number <= 1) return false;

        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public int factorial ( int number ) {
        int fact = 1;

        while (number > 1) {
            fact *= number--;
        }
        return fact;
    }

    public int fibonacciNumber ( int position  ) {

        if(position <= 1) return 0;
        if(position == 2) return 1;

        int first = 0;
        int second = 1;
        int fibNum = 0;

        for (int i = 0; i < position - 2; i++) {
            fibNum = first + second;
            first = second;
            second = fibNum;
        }

        return fibNum;

    }

    public int reverseNumber ( int number  ) {
        int rev = 0;
        while (number > 0) {
            rev = (rev * 10 )+ (number % 10);
            number /= 10;
        }
        return rev;
    }

    public boolean isPalindrome ( int number ) {
        int rev = 0;
        int original = number;
        while (number > 0) {
            rev = (rev * 10 )+ (number % 10);
            number /= 10;
        }
        return original == rev;
    }
}
