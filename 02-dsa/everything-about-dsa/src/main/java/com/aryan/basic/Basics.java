package com.aryan.basic;

public class Basics {

    // Day 1 Problems

    public boolean isPrime(int number) {
        if (number <= 1)
            return false;

        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public int factorial(int number) {
        int fact = 1;

        while (number > 1) {
            fact *= number--;
        }
        return fact;
    }

    public int fibonacciNumber(int position) {

        if (position <= 1)
            return 0;
        if (position == 2)
            return 1;

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

    public int reverseNumber(int number) {
        int rev = 0;
        while (number > 0) {
            rev = (rev * 10) + (number % 10);
            number /= 10;
        }
        return rev;
    }

    public boolean isPalindrome(int number) {
        int rev = 0;
        int original = number;
        while (number > 0) {
            rev = (rev * 10) + (number % 10);
            number /= 10;
        }
        return original == rev;
    }

    // Day 2 problems

    private int digitMultiplier(int digit, int digitCount) {
        int multiplier = 1;
        for (int i = 0; i < digitCount; i++) {
            multiplier *= digit;
        }
        return multiplier;
    }

    public boolean armstrong(int number, int digitCount) {
        int sum = 0;
        int original = number;

        while (number > 0) {
            int lastDigit = number % 10;
            sum += digitMultiplier(lastDigit, digitCount);
            number /= 10;
        }
        return original == sum;
    }

    public int gcd(int largest, int larger) {

        while (larger > 0) {
            int temp = larger;
            larger = largest % larger;
            largest = temp;
        }
        return largest;
    }

    public int lcm(int largest, int larger) {

        return (larger + largest) / gcd(largest, larger);
    }

    public int digitSum (int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
