# Non-Repeated Digits Count

## Problem Statement
Write a Java program to find the **count of non-repeated digits** in a given integer number.

A digit is considered **non-repeated** if it appears **exactly once** in the number.

---

## Logic Description
- The program uses a method with a parameter and a return type.
- An integer array `freq` of size `10` is used to store the frequency of digits from `0` to `9`.
- A variable `count` keeps track of the number of non-repeated digits.
- A `while` loop extracts each digit of the number using modulo operation (`n % 10`) and increments its frequency.
- The number is divided by `10` in each iteration to remove the last digit.
- After processing all digits, a `for` loop checks the frequency array.
- If a digit’s frequency is exactly `1`, it is counted as non-repeated.
- The final value of `count` is returned.

---

## Input
- A single integer value `n`

---

## Output
- Returns the **count of non-repeated digits** in the given number.

---

## Example
Input:  
n = 1169  

Output:  
The non-repeated digits in 1169 are:  
2
