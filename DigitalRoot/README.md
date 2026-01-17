# Digital Root

## Problem Statement
Write a Java program to find the **digital root** of a given integer number.

The digital root is obtained by repeatedly finding the **sum of digits** of a number until the result becomes a **single-digit number**.

---

## Logic Description
- The program uses a method with a parameter and a return type.
- A `while` loop runs as long as the number has more than one digit (`n >= 10`).
- Inside the loop, a variable `sum` is initialized to `0`.
- Another `while` loop extracts each digit using the modulo operator (`n % 10`) and adds it to `sum`.
- The number is divided by `10` in each iteration to remove the last digit.
- After summing all digits, the value of `n` is updated to `sum`.
- This process repeats until `n` becomes a single-digit number.
- The final single-digit value is returned as the **digital root**.

---

## Input
- A single integer value `n`

---

## Output
- Returns the **digital root** of the given number.

---

## Example
Input:  
n = 84001  

Output:  
The digital root of 84001 is:  
4
