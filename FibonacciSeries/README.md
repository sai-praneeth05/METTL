# Fibonacci Series

## Problem Statement
Write a Java program to print the **Fibonacci series** up to the `n`th term.

The Fibonacci series is a sequence of numbers where each number is the **sum of the previous two numbers**.

Fibonacci series example:
0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ...

---

## Logic Description
- The program uses a **static method** with a parameter `n`.
- The first two Fibonacci numbers are initialized as `0` and `1`.
- The first two numbers are printed initially, and the calculation starts from the **3rd Fibonacci number**.
- A `for` loop runs from `3` to `n`.
- In each iteration, the next Fibonacci number is calculated as the sum of the previous two numbers, printed, and the previous values are updated.
- After the loop completes, the entire Fibonacci series up to the `n`th term is printed.

---

## Input
- A single integer value `n` representing the number of terms to print.

---

## Output
- Prints the **Fibonacci series** up to the `n`th term.

---

## Example
Input:  
n = 10  

Output:  
The Fibonacci series up to 10th term are:  
0, 1, 1, 2, 3, 5, 8, 13, 21, 34
