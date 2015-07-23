# RobotWars
Code Challenge where Humans battle against Robots (not an original notion I'll grant you!)
Create your own branch, write your code, and push it

Write a program named GameApp.java which contains a main method. The main method should call a non-static method runProgram().

Your program should be able to keep track of two types of Lifeform: Human and Robot. Humans and robots have a power value in the range 0..100 inclusive. Both also have a UniqueID.
Humans have a name. Robots have a model name (TypeA, TypeB).

Your program should create 1000 Lifeforms in equal proportion with randomly assigned values for power. The Lifeforms will do battle, and the winner will be the Lifeform type that has the highest total power.

Updated requirement:
Provide the user with an option to choose another gametype:  The winner is the last man/robot standing i.e. keep the battle going until one species is eliminated.
After each battle the victor will lose 0.5 power value units. E.g. 88 -> 87.5
