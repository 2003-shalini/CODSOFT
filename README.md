# CODSOFT
Introduction:

This repository contains programs in java given by CodSoft for internship.Java is basically an Object Oriented Programming Language which can be easily implemented.The problems given by CodSoft have been completed using Java language.


1)Number Game:

Gameplay:
The game will prompt you to guess a randomly generated number within a specified range.
You have a limited number of attempts to guess the correct number.
After each attempt, the game will provide feedback on whether your guess is too high or too low.
If you guess the correct number, the game congratulates you and displays the number of attempts.
You can choose to play again or exit the game.

Customization:
You can customize the game parameters (e.g., lower and upper bounds, attempts limit) by modifying the relevant variables in the code.

For Compilations and Running:
javac NumberGame.java  java NumberGame

2)Student Grade Calculator:
This Java program calculates the total marks, percentage, and assigns grades based on the input marks for Tamil, English, Maths, Science, and Social subjects.

Usage:
The program will prompt you to enter marks for Tamil, English, Maths, Science, and Social subjects.
It calculates the total marks and percentage based on the entered marks.
The program then assigns a grade based on the calculated percentage.

Method Descriptions:
sumofmarks(int tam, int eng, int mat, int sci, int soc): int
Calculates and returns the total sum of marks for all subjects.

avgofmarks(int tam, int eng, int mat, int sci, int soc): double
Calculates and returns the percentage of marks based on the total marks out of 500.

grade(double percentage): void
Assigns a grade based on the calculated percentage and prints the corresponding grade.

For compiling and running:
javac StudentGradeCalculator.java  java StudentGradeCalculator

3)Atm Interface:
This Java program simulates a simple ATM system with basic banking operations, including withdrawal, deposit, and checking balance.

Features:
BankAccount Class:
Manages the user's bank account with methods for deposit, withdrawal, and checking the balance.
ATM Class:
Displays a simple menu for withdrawal, deposit, checking balance, and exiting the ATM.
Processes user input to perform the selected operation.

Usage:
The program initializes a bank account with an initial balance of $1000.
The user can choose options from the ATM menu:
1. Withdraw: Enter the withdrawal amount, and the program checks for sufficient funds.
2. Deposit: Enter the deposit amount to increase the account balance.
3. Check Balance: Displays the current account balance.
4. Exit: Exits the ATM program.

For compiling and running:
javac BankAccountImplement.java  java BankAccountImplement


