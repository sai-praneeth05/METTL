# Nth Prime Number

## Problem Statement
Write a Java program to find the **Nth prime number**.

A prime number is a number greater than `1` that has no positive divisors other than `1` and itself.

---

## Logic Description
- The program uses a method with a parameter and a return type.
- A variable `countPrime` keeps track of how many prime numbers have been found.
- A variable `i` starts from `2` and is incremented in a loop until the `n`th prime is found.
- For each `i`, a loop checks if it is divisible by any number from `2` to `i/2`.
- If `i` is prime, `countPrime` is incremented.
- When `countPrime` equals `n`, the current value of `i` is returned as the **Nth prime number**.

---

## Input
- A single integer value `n` representing the position of the prime number to find.

---

## Output
- Returns the **Nth prime number**.

---

## Example
Input:  
n = 5  

Output:  
The 5th prime number is:  
11
