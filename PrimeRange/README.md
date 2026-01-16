# Number of Primes in a Specified Range

## Problem Statement
Write a Java program to find the **number of prime numbers** between two given integers `n1` and `n2`.

A prime number is a number greater than `1` that has no positive divisors other than `1` and itself.

---

## Logic Description
- The program uses a method with two parameters (`n1` and `n2`) and a return type of `int`.
- A variable `primecount` keeps track of the total number of primes in the range.
- An outer loop runs from `i = n1` to `i = n2`, checking each number.
- For each `i`, an inner loop checks if it is divisible by any number from `2` to `i/2`.
- If no divisor is found (`count == 0`), the number is prime and `primecount` is incremented.
- After checking all numbers, the method returns the total count of prime numbers.

---

## Input
- Two integer values, `n1` and `n2`, representing the range to check for prime numbers.

---

## Output
- Returns the **count of prime numbers** between `n1` and `n2`.

---

## Example
Input:  
n1 = 2, n2 = 20  

Output:  
The prime numbers between 2 and 20 are:  
8
