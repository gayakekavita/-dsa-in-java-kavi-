/*
   Example 1:

Input: arr = [0,1,0]

Output: 1

Example 2:

Input: arr = [0,2,1,0]

Output: 1

Example 3:

Input: arr = [0,10,5,2]

Output: 1
*/
//solution
class Solution {
    public int peakIndexInMountainArray(int[] arr) {

        int start=0;
        int end=arr.length-1;
        while(start<end)
        {
            int mid= start +(end-start)/2;
            if(arr[mid]> arr[mid+1])
            {
                end= mid;
            }
            else
            {
                start= mid+1;
            }
        }
        return start;
    }
}

/*
Input: arr = [0,10,5,2]
start=0;
end=3;
1.    0<3{
     mid= 0 +(3-0)/2
        = 0+ (3/2)
        = 0 + 1
        = 1
      arr[1]>arr[2}
      10>5{
       end =mid
           = 1
     }
2. 0<1{
          mid= 0+ 1/2
             = 0
             =0
             arr[0]>arr[1]
             0>10
             {
               
             }
             {
                start=mid+1
                     = 0+1
                    = 1
             }
 3. 1<1 
     return start or end 
     return 1;
             
     }
*/
