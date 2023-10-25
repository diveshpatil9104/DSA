# Binary to Decimal Conversion

Binary to decimal conversion is the process of converting a binary (base-2) number into its decimal (base-10) equivalent.

## Steps to Convert Binary to Decimal

1. Start from the rightmost digit (the least significant digit) of the binary number.
2. Assign a positional value of 2^0 to the rightmost digit, 2^1 to the next digit to the left, 2^2 to the next one, and so on.
3. Multiply each digit of the binary number by its corresponding positional value.
4. Sum up all the results from step 3 to get the decimal equivalent.

### Example: Binary to Decimal Conversion

Let's convert the binary number 1101 to decimal:

- 1 * 2^3 = 1 * 8 = 8
- 1 * 2^2 = 1 * 4 = 4
- 0 * 2^1 = 0 * 2 = 0
- 1 * 2^0 = 1 * 1 = 1

Now, add up these results: 8 + 4 + 0 + 1 = 13

So, the decimal equivalent of binary 1101 is 13.

# Decimal to Binary Conversion

Decimal to binary conversion is the process of converting a decimal (base-10) number into its binary (base-2) equivalent.

## Steps to Convert Decimal to Binary

1. Divide the decimal number by 2.
2. Record the remainder (0 or 1).
3. Repeat the division until the quotient becomes 0, recording the remainders along the way.
4. The binary equivalent is obtained by reading the remainders in reverse order (from bottom to top).

### Example: Decimal to Binary Conversion

Let's convert the decimal number 27 to binary:

- 27 / 2 = 13 with a remainder of 1
- 13 / 2 = 6 with a remainder of 1
- 6 / 2 = 3 with a remainder of 0
- 3 / 2 = 1 with a remainder of 1
- 1 / 2 = 0 with a remainder of 1

Now, read the remainders in reverse order: 11011

So, the binary equivalent of decimal 27 is 11011.

These are the basic steps for converting binary to decimal and decimal to binary. You can use these steps to perform conversions between these two number systems.
