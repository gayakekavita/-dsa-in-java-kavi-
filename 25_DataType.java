/*
  Problem statement
Data type refers to the type of value a variable has and the way the computer interprets it.



Each data type has a different size. You’ve studied 5 different data types and the sizes of the data types:

Integer: 4 bytes
Long: 8 bytes
Float: 4 bytes
Double: 8 bytes
Character: 1 byte
*/
import java.util.*;
public class Solution {
    public static int dataTypes(String type) {
        // Write your code here
        
         switch(type) {
            case "Integer":
                return 4;
            case "Long":
                return 8;
            case "Float":
                return 4;
            case "Double":
                return 8;
            case "Character":
                return 1;
            default:
                return -1; // Invalid data type
        }

    }
}
