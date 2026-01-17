# Sum of Even Digits

## Problem Statement
Write a Java program to find the **sum of even digits** present in a given integer number.

---

## Logic Description
- The program uses a method with a parameter and a return type.
- A variable `sum` is initialized to `0`.
- A `while` loop runs until the number becomes `0`.
- In each iteration, the last digit is extracted using the modulo operator (`n % 10`).
- If the extracted digit is even (`digit % 2 == 0`), it is added to `sum`.
- The number is divided by `10` in each iteration to remove the last digit.
- After processing all digits, the final value of `sum` is returned.

---

## Input
- A single integer value `n`

---

## Output
- Returns the **sum of even digits** in the given number.

---

## Example
Input:  
n = 1258  

Output:  
The sum of even digits in 1258 is:  
10
