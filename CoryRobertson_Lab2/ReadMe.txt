
Lab 2 Vending Machine

    Due Feb 5 by 1:30pm Points 10

 
Description

Write a program that simulates a vending machine.          

Vending MachineThe vending machine sells three types of food: 1) Potato chips $1.25; 2) Cookies $0.85; 3) Candies $0.95. The program will prompt for the buyer to enter the amount in quarters (25 cents), dimes (10 cents), and nickels (5 cents). The program will then present a selection menu for the foods. The buyer makes a selection. If the buyer selects a food that is sold out, the program will display a message and re-display the selection menu. If the buyer has put in enough money, the selected food will be dispensed, with a message "Please take a your (food)". If the amount is more than the cost, an appropriate amount of change (in quarter, dime or nickel) will be dispensed.

Every food is initialized with a quantity. The quantity is reduced by one every time the food is dispensed. When the quantity of a food is 0, no more should be sold, with an error stating "Sold out. Please make another choice".

Note:

1 dollar = 4 quarters = 10 dimes = 20 nickels
1 dollar = 100 cents
1 quarter = 25 cents
1 dime = 10 cents
1 nickel = 5 cents
Requirements

Please do all of the following:

1. Draw a flow chart or pseudo code depicting the algorithm.
2. Create a Java source code file named VendingMachine.java. Make sure the file compile correctly.
3. Test your program with the following test cases:
3.1. Buyer selects a food that is available, with exact amount as the price;
3.2 Buyer selects a food that is in stock, with less money than the price;
3.3 Buyer selects a food that is in stock, with more money than the price;
3.4 Buyer selects a food that is sold out;
3.5 Buyer selects a food that does not exist.
Repeat the test cases for all the foods. Capture the interactions and save in a file.

4. Submit all of the following:
   a. Source code
   b. Flow chart or pseudo code
   c. Test output
Grading

Grading will be based on the correctness, cleanness, clarity, and accuracy. Emphasis is placed on meeting the requirements.

9-10 points: All the requirements are met. The program is complete and clean.
8-9 points: Most requirements are met. The program works in general with a few errors.
7-8 points: Some requirements are met. One or more important features are missing. The program works in general with some errors.
6-7 points: The program only partially works.
0-6 points: The program does not work as specified. Syntax errors. Most requirements are not met.
