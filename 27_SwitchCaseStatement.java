/*
 Problem statement
Programming languages have some conditional / decision-making statements that execute when some specific condition is fulfilled.



Switch-case is one of the ways to implement them.



In a menu-driven program, the user is given a set of choices of things to do (the menu) and then is asked to select a menu item.



There are 2 choices in the menu:



Choice 1 is to find the area of a circle having radius 'r'.

Choice 2 is to find the area of a rectangle having dimensions 'l' and 'b'.



You are given the choice 'ch' and an array 'a'.



If ‘ch’ is 1, ‘a’ contains a single number ‘r’. If ‘ch’ is 2, ‘a’ contains 2 numbers, ‘l’ and ‘b’.
*/


public class Solution {
    public static double areaSwitchCase(int ch, double[] a) {
        // Write your code here
        switch(ch) {
            case 1:
                return Math.PI * a[0] * a[0]; // Area of circle
            case 2:
                return a[0] * a[1]; // Area of rectangle
            default:
                return 0.0;
        }
    }
}
