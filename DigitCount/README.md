# Digit Count

## Problem Statement
Write a Java program to find the **number of digits** in a given integer number.

---

## Logic Description
- The program uses a method with a parameter and a return type.
- A variable `count` is initialized to `0` to keep track of the number of digits.
- A `while` loop runs as long as the number is greater than `0`.
- In each iteration, the number is divided by `10`, which removes the last digit.
- Each division increments the `count` by `1`.
- When the number becomes `0`, the loop stops.
- The final value of `count` is returned as the total number of digits.

---

## Input
- A single integer value `n`

---

## Output
- Returns the **count of digits** present in the given number.

---

## Example
Input:  
n = 1069  

Output:  
The number of digits in 1069 is:  
4
