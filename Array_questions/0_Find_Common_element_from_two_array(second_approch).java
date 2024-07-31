class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {

        int[] arr=new int[2];
        arr[0]=0;
        arr[1]=0;
        int count=0;
        for(int i=0;i<nums1.length;i++)
        {
            for(int j=0;j<nums2.length;j++)
            {
                if(nums1[i]==nums2[j])
                {
                    count++;
                    break;
                }
            }
        }
        arr[0]=count;
        int count1=0;
        for(int i=0;i<nums2.length;i++)
        {
            for(int j=0;j<nums1.length;j++)
            {
                if(nums2[i]==nums1[j])
                {
                    count1++;
                    break;
                }
            }
        }
        arr[1]=count1;
        return arr;
        
    }
}
