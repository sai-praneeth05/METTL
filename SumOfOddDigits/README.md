# Sum of Odd Digits

## Problem Statement
Write a Java program to calculate the **sum of all odd digits** present in a given number.

---

## Logic Description
- The program uses a method with parameters and a return type.
- The given number is processed digit by digit using a `while` loop.
- Each digit is extracted using the modulo operator (`% 10`).
- If the digit is **odd**, it is added to the sum.
- The number is reduced by dividing it by 10 after each iteration.
- After all digits are checked, the method returns the **sum of odd digits**.

---

## Input
- A single integer value `n`

---

## Output
- Returns the **sum of odd digits** in the given number

---

## Example
Input:
n = 1069

Odd digits:
1, 9

Calculation:
1 + 9 = 10

Output:
10
