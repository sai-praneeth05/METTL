# Return Last Digit of a Given Number

## Problem Statement
Write a Java program to find the **last digit** of a given integer number.

The program should work for both positive and negative numbers. The last digit is obtained by taking the **absolute value** of the number modulo 10.

---

## Logic Description
- The program uses a method with parameters and a return type.
- To find the last digit:
  - Take the number modulo 10: `n % 10`
  - Use `Math.abs()` to ensure the result is positive.
- The method returns the last digit as an integer.

---

## Input
- An integer value `n`

---

## Output
- Returns the **last digit** of the number
