
Problem 1(ArrayTraverse.java):
==============================
Problem 1:Test Scenario 1:Given integer array {Integer.MIN_VALUE,23,45,56,102,Integer.MAX_VALUE} should return string array {"even","odd","odd","even","even","odd"}

Problem 1:Test Scenario 2:Given null should return string array {"array should not be null"}

Problem 1:Test Scenario 3:Given integer array {Integer.MIN_VALUE,23,45,-37,-56,102,Integer.MAX_VALUE+1} should return {"even","odd","odd","odd","even","even","even"}

Problem 1:Test Scenario 4:Given integer array {2,3,105,45,102,Integer.MAX_VALUE} should remove primes and return "105,45,102"

Problem 1:Test Scenario 5:Given integer array as null should return "array should not be null"

Problem 1:Test Scenario 6:Given integer array {Integer.MIN_VALUE,23,102,Integer.MAX_VALUE} should return reversing an array {"2147483647","102","23","-2147483648"}

Problem 1:Test Scenario 7:Given an array with negative integers {Integer.MIN_VALUE,-37,Integer.MAX_VALUE,-102} should return reverse array as {"-102","2147483647","-37","-2147483648"}

Problem 1:Test Scenario 8:Given integer array as null should return "array should not be null"


Problem 2(StringArrayOperations.java):
======================================
Problem 2:Test Scenario 1:Given two string arrays {"hello","hii","some","some","aa"},{"hello","hii","some","some","aa"} should return "arrays are similar"

Problem 2:Test Scenario 2:Given two string arrays {"hello","hii","some","some","aa"},null should return "array should not be null"

Problem 2:Test Scenario 3:Given string array {"hello","hii","some","hello"} should remove duplicates and return ""hello","hi","some""

Problem 2:Test Scenario 4:Given null should return "array should not be null"

Problem 2:Test Scenario 5:Given 2 string arrays {"hello","hii","some","some","aa"},{"hello","hii","some","some","aa"} should return {"hello","hii","some","some","aa","hello"}

Problem 2:Test Scenario 6:Given string arrays null,{"hello","hii","some","some","aa"} should return "array should not be null"

Problem 2:Test Scenario 7:Given string arrays {"hello","hii","some","some","aa"},{"hello","hii","some","some","aa"} should return {"some","hello","hii","some","some","aa"}

Problem 2:Test Scenario 8:Given string arrays null,{"hello","hii","some","some","aa"} should return "array should not be null"


Problem 3(StudentMarks.java):
=============================
Problem 4:Test Scenario 1:Given int array {99,89,67,66,89} should return "Entered grades are valid"

Problem 4:Test Scenario 2:Given int array {99,89,67,66,101}  should return "Enter marks between 0-100!!!"

Problem 4:Test Scenario 3:Given int array {-1,0,99,89,67,66,100} should return "Enter marks between 0-100!!!"


Problem 4(RemoveVowels.java):
=============================
Problem 4:Test Scenario 1:Given string "india,america,japan,germany,korea"
            should return string array {"Place Name without Vowels:0 ind","Place Name without Vowels:1 amrc",
                                        "Place Name without Vowels:2 jpn","Place Name without Vowels:3 grmny",
                                        "Place Name without Vowels:4 kr"}

Problem 4:Test Scenario 2:Given string "india,america, ,germany,korea" should return {"Input Should only be a String"}

Problem 4:Test Scenario 3:Given string "india,america,1,germany,korea" should return {"Input Should only be a String"}


Problem 5(CheckForConsecutiveNums.java):
========================================
Problem 5:Test Scenario 1: Given String "98,96,95,94,93" should return "98,96,95,94,93 non consecutive numbers"

Problem 5:Test Scenario 2: Given String "54,53,52,51,50,49,48" should return "54,53,52,51,50,49,48 are consecutive numbers"

Problem 5:Test Scenario 3: Given String "1,2,3,4,5,6,6" should return "1,2,3,4,5,6,6 non consecutive numbers"

Problem 5:Test Scenario 4: Given String "1,2,3,some,5,6,7" should return "Enter only integer values!!!"


Problem 6(ExceptionGenerator.java):
============
Problem 6: Test Scenario 1: Given Strign array {"-1","hello","hi","bye","some","text"} should return "Caught NegativeArraySizeException"

Problem 6: Test Scenario 2: Given Strign array {"4","hello","hi","bye","some","text","hello"} should return "Caught ArrayIndexOutOfBoundsException"

Problem 6: Test Scenario 3: Given null should return "Caught NullPointerException"