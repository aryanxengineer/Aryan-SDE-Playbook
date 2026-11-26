## Basics in Data Structures & Algorithms

### Prime Numbers
> Prime number is a positive number greater than 1 and divisible by only with 1 and itself. If number has any other factor, then it is not a prime number.

- While checking why we traverse till root n
- If factor exists after root n, then another factor must exists before root n

### Factorial
> Factorial of a number is a product of all positive integers from 1 to n. It is represented by n!

### Fibonacci series
> Fibonacci series is a sequence where each number is obtained by the previous two numbers. This series usually starts with 0 and 1.

#### Why iterative over recursive ?
Iterative solution is better, because it uses constant space o(1), while recursive solution consumes extra start memory O(n).


### Reverse Number

- last digit = n % 10
- remove last digit = n / 10
- build new digit rev = rev x 10 + last digit

### Palindrome Number
> A palindrome number is a number that reads the same from left to right and right to left.

### Armstrong Number
> An armstrong number is a number whose sum of each digits raised to the power of total digits is equal to the original number.


### GCD (Greatest Common Divisor)
> The largest number that divides both number without leaving remainder. The most efficiet way to solve GCD is Euclid's algorithm where we repeatedly replace the larger number by the remainder until the remainder becomes 0.


### LCM (Lowest Common Factor)
> LCM is lowest common multiple that divides by the both numbers completely without leaving any remainder. The efficient way to find LCM is only using it's formula LCM = (a x b) / GCD.

### Digit Sum
> To find digit sum, I repeatedly extract last digit using modulo operator, then add to sum variable finally remove the digit using integer division.   