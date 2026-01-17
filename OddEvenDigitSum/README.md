# Sum of Even and Odd Digits Separately

## Problem Statement
Write a Java program to calculate the **sum of even digits** and the **sum of odd digits** present in a given integer number.

---

## Logic Description
- The program uses a method with a parameter and a return type.
- Two variables, `EvenCount` and `OddCount`, are initialized to `0`.
- A `while` loop runs until the number becomes `0`.
- In each iteration:
  - The last digit is extracted using the modulo operator (`n % 10`).
  - If the digit is **even** (`digit % 2 == 0`), it is added to `EvenCount`.
  - If the digit is **odd**, it is added to `OddCount`.
  - The number is divided by `10` in each iteration to remove the last digit.
- After processing all digits, the method returns an array containing `{EvenCount, OddCount}`.

---

## Input
- A single integer value `n`

---

## Output
- Returns an array of two integers:  
  - **First element:** sum of even digits  
  - **Second element:** sum of odd digits

---

## Example
Input:  
n = 1258  

Output:  
Sum of Even digits: 10  
Sum of Odd digits: 6
