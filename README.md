# Factorial Calculator

This Java program calculates the factorial of a given non-negative integer using recursion. A factorial is the product of all positive integers less than or equal to the number. For example, the factorial of 4 is \( 4 \times 3 \times 2 \times 1 = 24 \).

---

## Features

- Computes the factorial of non-negative integers using a recursive approach.
- Validates input to ensure it is a non-negative integer.
- Handles edge cases such as 0 and 1, returning 1 as the factorial.
- Throws an exception for invalid inputs, such as negative numbers.

---

## Requirements

- Java Development Kit (JDK) 8 or higher.

---

## Usage

### 1. Clone the Repository
```bash
git clone https://github.com/larisa-pozhilova/recursive-factorial.git
cd recursive-factorial
```

### 2. Compile the Code
```bash
javac Factorial.java
```

### 3. Run the Program
```bash
java Factorial
```

### Example Output
For an input of 4, the program will output:
```
24
```

---

## Code Explanation

### `factorial` Method
- **Purpose**: Calculates the factorial of a given non-negative integer.
- **Logic**:
    - If the input is 0 or 1, return 1 (base case).
    - Otherwise, recursively calculate \( n \times \text{factorial}(n-1) \).

### `main` Method
- Demonstrates the calculation of the factorial for the number 4.
- Prints the result to the console.

---

## Limitations

- The program uses the `long` data type, which can store values up to \( 2^{63} - 1 \) (approximately \( 9.2 \times 10^{18} \)).
- Factorials of numbers greater than 20 exceed this range, resulting in overflow and incorrect results.
- For larger factorials, consider using the `BigInteger` class.

---

## Future Improvements

- Implement an iterative approach to calculate factorials.
- Use `BigInteger` to support larger numbers.
- Add functionality to accept user input for dynamic calculations.

---

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---

## Contributing

Contributions are welcome! Please fork the repository and submit a pull request for any enhancements or bug fixes.

---

## Author

[Larisa Pozhilova](https://github.com/larisapozhilova)
