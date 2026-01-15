# Check Whether N Is an Exact Multiple of M

## Problem Statement
Write a Java program to check whether a given number **N** is an **exact multiple** of another given number **M**.

If either of the numbers is zero, the program should return a specific value indicating invalid input.

---

## Logic Description
- The program uses a method with parameters and a return type.
- If either `N` or `M` is `0`, the method returns `3`.
- If `N` is exactly divisible by `M` (`N % M == 0`), the method returns `2`.
- Otherwise, the method returns `1`.

---

## Input
- Two integer values `N` and `M`

---

## Output
- Returns `3` if either `N` or `M` is zero
- Returns `2` if `N` is an exact multiple of `M`
- Returns `1` otherwise