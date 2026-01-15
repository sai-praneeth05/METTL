# Return Second Last Digit of a Given Number

## Problem Statement
Write a Java program to return the **second last digit** of a given integer number.

If the number contains **only one digit**, the program should return `-1`.  
The program should work correctly for both **positive and negative** numbers.

---

## Logic Description
- The program uses a method with parameters and a return type.
- First, the absolute value of the number is checked to ensure it has at least two digits.
- The number is divided by 10 to remove the last digit.
- The remainder when divided by 10 gives the second last digit.
- If the number has only one digit, the method returns `-1`.

---

## Input
- An integer value `n`

---

## Output
- Returns the **second last digit** of the number
- Returns `-1` if the number has only one digit
