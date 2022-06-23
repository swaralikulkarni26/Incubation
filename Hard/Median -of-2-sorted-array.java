class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    int []arr=new int [nums1.length+nums2.length];
    for(int i=0;i<nums1.length;i++)
    {
        arr[i]=nums1[i];
    }
    
    for(int i=nums1.length, j=0; i<arr.length;i++,j++){
        arr[i]=nums2[j];
    }
    Arrays.sort(arr);
        
       if (arr.length%2!=0)
           
          return arr[arr.length/2];
           
        else
        	return (double)(arr[(arr.length/2)-1]+arr[(arr.length/2)])/2;
    }
}
