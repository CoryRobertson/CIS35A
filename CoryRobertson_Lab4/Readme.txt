
Lab 4 Implementing a Money Class

    Due Mar 10 by 11:30am Points 10

Problem Description

Write a class encapsulating the concept of money, assuming that money has the following attributes: dollars, cents

In addition to the constructors, the accessors and mutators,  write the following methods:

public Money()

public Money(int dollars, int cents)

public Money add(Money m)

public Money substract(Money m)

public Money multiply(int m)

public static Money[] multiply(Money[] moneys, int amt)

public boolean equals(Money money)

public String toString()

private void normalize() // normalize dollars and cents field

Add additional helper methods if necessary.
Testing

Use the following test driver program to test your Money class:
MoneyTester-1.javaPreview the document

Your output will look similar to this

lab 4 output.png
Submission

    Java source code (Money.java and MoneyTester.java).
    Output of the sample run using MoneyTester.java.
    Place item 1 and 2 in a folder named FirstnameLastname_Lab4 and copy the folder to the Dropbox on G drive: G:\vyu\cis35a\DropBox. Do not compress.

Grading

Grading will be based on the correctness, cleanness, clarity, and accuracy. Emphasis is placed on meeting the requirements.

9-10 points : All the requirements are met. The program is complete and clean.
8-9 points: Most requirements are met. The program works in general with a few errors.
7-8 points: Some requirements are met. One or more important features are missing. The program works in general with some errors.
6-7 points: The program only partially works.
0-6 points: The program does not work as specified. Syntax errors. Most requirements are not met.