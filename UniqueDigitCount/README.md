# Unique Digit Count

## Problem Statement
Write a Java program to find the **count of unique digits** in a given integer number.

A digit is considered unique if it appears **only once** while processing the number.

---

## Logic Description
- The program uses a method with a parameter and a return type.
- An integer array `freq` of size `10` is used to store the frequency of digits from `0` to `9`.
- A variable `count` keeps track of the number of unique digits.
- A `while` loop runs until the number becomes `0`.
- In each iteration, the last digit is extracted using the modulo operator (`n % 10`).
- If the digit has not appeared before (`freq[digit] == 0`), the unique digit count is incremented and the frequency is updated.
- The number is divided by `10` in each iteration to remove the last digit.
- After the loop ends, the final value of `count` is returned as the **unique digit count**.

---

## Input
- A single integer value `n`

---

## Output
- Returns the **count of unique digits** present in the given number.

---

## Example
Input:  
n = 1015  

Output:  
The unique digit count in 1015 is:  
3
