# Mortgage Calculator

This is a simple Java program that calculates the monthly mortgage payment based on the principal amount, annual interest rate, and loan period (in years).

## Getting Started

### Prerequisites

- Java Development Kit (JDK) installed on your system.

### Running the Program

1. Clone the repository or download the source code.
2. Navigate to the directory containing the `mortgagecalculator.java` file.
3. Compile the Java file using the following command:javac mortgagecalculator.java
4. Run the compiled program with the following command:java mortgagecalculator
5. The program will prompt you to enter the following information:
   - Principal amount (between $1,000 and $1,000,000)
   - Annual interest rate (between 0.1% and 30.0%)
   - Loan period in years (between 1 and 30 years)

6. After providing the required input, the program will calculate and display the monthly mortgage payment amount.

## How It Works

The program uses the following formula to calculate the monthly mortgage payment:M = P * (r * (1 + r)^n) / ((1 + r)^n - 1)
Where:
- `M` is the monthly mortgage payment
- `P` is the principal amount
- `r` is the monthly interest rate (calculated from the annual interest rate)
- `n` is the total number of payments (calculated from the loan period in years)

The program handles invalid input by prompting the user to enter values within the specified ranges until valid input is provided.

## Dependencies

This program uses the `java.text.NumberFormat` and `java.util.Scanner` classes from the Java standard library.

## License

This project is licensed under the [MIT License](LICENSE).
