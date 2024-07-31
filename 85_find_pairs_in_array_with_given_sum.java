// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void FindSum(int[] arr,int k)
    {
        
         int low=0;
         int high=arr.length-1;
         while(low<high)
         {
               if(arr[low]+arr[high] > k)
               {
                   high--;
               }
               else if(arr[low]+arr[high]<k)
               {
                   low++;
               }
               else
               {
                    System.out.println("Pair: " + "(" + arr[low] +"," + arr[high]+ ")");
                    low++;
                    high--;
               }
         }
        
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        FindSum(arr,9);
    }
}
