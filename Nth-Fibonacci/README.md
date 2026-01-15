# Nth Fibonacci Number

## Problem Statement
Write a Java program to find the **Nth Fibonacci number**.

The Fibonacci series is a sequence of numbers in which each number is the **sum of the previous two numbers**.

Fibonacci series:
0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ...

---

## Logic Description
- The program uses a method with parameters and a return type.
- The first two Fibonacci numbers are initialized as `0` and `1`.
- Since the first two values are already known, the calculation starts from the **3rd Fibonacci number**.
- A `for` loop runs from `3` to `n`.
- In each iteration, the next Fibonacci number is calculated and the previous two values are updated.
- After the loop completes, the final value is returned as the **Nth Fibonacci number**.

---

## Input
- A single integer value `n` representing the position of the Fibonacci number

---

## Output
- Returns the **Nth Fibonacci number**

---

## Example
Input:
n = 10

Fibonacci series up to 10th term:
0, 1, 1, 2, 3, 5, 8, 13, 21, 34

Output:
34
