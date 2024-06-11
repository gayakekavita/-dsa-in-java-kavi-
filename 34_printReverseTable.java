/*

While loop is another loop like for loop but unlike for loop it only checks for one condition.

Here, we will use a while loop and print a number n's table in reverse order.

Example 1:

Input:
1

Output:
10 9 8 7 6 5 4 3 2 1
*/
class Geeks {
	 static void printTable (int n) 
	 {
            int multiplier=10;
            while(multiplier>0)
            {
                //Your code here
                System.out.print( multiplier*n + " ");
                multiplier--;
                
            }
       System.out.println();
	 }

}
