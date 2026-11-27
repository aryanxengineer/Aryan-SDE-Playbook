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

    // Day 3 Problems

    public void maxAndMinElement (int[] arr) {
        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("Max " + max + " Min " + min);
    }

    public int secondLargest (int[] arr) {
        int largest = Math.max(arr[0], arr[1]);
        int larger = Math.min(arr[0], arr[1]);

        for (int i : arr) {
            if(i > largest) {
                larger = largest;
                largest = i;
            }
            else if (i < largest && i > larger) {
                larger = i;
            }
        }

        return larger;
    }

    public void reverseArray (int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[end];
            arr[end--] = arr[start];
            arr[start++] = temp;
        }
    }

    public int[] removeDuplicate (int[] arr) {
        int uni = 0;
        int tracer = 1;

        while (tracer < arr.length) {
            if(arr[tracer] != arr[uni]) {
                arr[++uni] = arr[tracer++];
            } else {
                tracer++;
            }
        }
        return arr;
    }

    public int[] moveZeroes (int[] arr) {
        int zeroTracer = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[zeroTracer];
                arr[zeroTracer++] = arr[i];
                arr[i] = temp; 
            }
        }
        return arr;
    }

}
