
/*
Problem Description::
205. Isomorphic Strings
Solved
Easy
Topics
Companies
Given two strings s and t, determine if they are isomorphic.

Two strings s and t are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.
Example 1:

Input: s = "egg", t = "add"
Output: true
Example 2:

Input: s = "foo", t = "bar"
Output: false
Example 3:

Input: s = "paper", t = "title"
Output: true
*/
//solution
class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length())
            return false;
        
        HashMap<Character, Character> map = new HashMap<>();
        
        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);
            
            if (map.containsKey(charS)) {
                if (map.get(charS) != charT)
                    return false;
            } else {
                if (map.containsValue(charT))
                    return false;
                map.put(charS, charT);
            }
        }
        
        return true;
    }
}

//input and output explanation::

Input: s = "egg", t = "add"
Output: true
 -- for above example there are two strings called s and t 
 -- first character of string "s" is "e" is converted into "a" .
-- second character of string "s" is  "g" is converted into "d".
-- third character of string "s" is  "g" which is also converted into "d".
-- that's why both strings are isomorphic.
--so it returns "true" as output.

  
  
Example 2:
Input: s = "foo", t = "bar"
Output: false
  -- here first character of string "s" is 'f' which is converted into character 'b' in string "t".
  --second character of string "s" is 'o' which is converted into character 'a' in string "t"
  -- third character of string "s" is  again 'o' which is convetred into 'r' in string "t".
     which is actually wrong character 'o' should be write as 'a' in string "t" 
     but here it is writing as 'r' thats' why string "s" and "t" are not isomorphic strings .
  -- that's why it is returning "false" as output.


  /*
  implementation::
  Input: s = "egg", t = "add"
  Output: true
  1.
   if (s.length() != t.length())
            return false;
   here length of "s" and "t" are 3 so this statement is  not executed .
   program cursor goes to next line.
            
        
   2. here we are creating a map which in intially 
      this map is used to key value pairs of characters 
      here we are storing characters of string "s"   as keys 
      and characters of string "t" as values .
      
     HashMap<Character, Character> map = new HashMap<>();


    3.now we are applying for loop 
        
        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);
            
            if (map.containsKey(charS)) {
                if (map.get(charS) != charT)
                    return false;
            } else {
                if (map.containsValue(charT))
                    return false;
                map.put(charS, charT);
            }
        }
        
      4. i=0
         char charS=e;
         char charT=a;

           if (map.containsKey(charS))
           {
             //here this if block is skipped because intially map[] is emppty 
            // so map does not contain  key 'e'.
           }
           else
           {
                if(map.containsValue(charT))
                {
                    return false 
                    //this if also skipped because noe map[] is empty so value 'a' is not present in map.
                }
                map.put(charS,charT);
                // here we added "e":"a" as key vallue pair in map.
                //map ["e":"a"]
            ]
     5. i=1;
        char charS='g';
        char charT='d'
        if (map.containsKey(charS))
           {
             //here this if block is skipped because  map does not contain  key 'g'.
           }
           else
           {
                if(map.containsValue(charT))
                {
                    return false 
                    //this if also skipped because value 'd' is not present in map.
                }
                map.put(charS,charT);
                // here we added "g":"d" as key vallue pair in map.
                //map ["g":"d"]

       6. i=2 
          char charS='g'
          char charT= 'd'

          if (map.containsKey(charS))
          if(map.containsKey(g))  // map ["e":"a", "g":"d"
          {
                //we come inside if block because our map contains key 'g'.
                 if (map.get(charS) != charT)
                 if(map.get('g')!='d')
                 if('d'!='d')
                    return false;
                here return statement is not  executed beacause d!=d .
          
                
          }

        7. i=3 ; i< 3 here for loop breaks 
           so at last it return "true" as output.
  */
