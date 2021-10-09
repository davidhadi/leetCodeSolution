// merge and find median of array

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i=0, j=0, k=0;
        
        int l1 = nums1.length;
        int l2 = nums2.length;
        
        int[] arr = new int[l1+l2];
        
       while(i < l1 && j < l2){
           if(nums1[i] > nums2[j])
               arr[k++] = nums2[j++];
           else
               arr[k++] = nums1[i++];
       }
        while(i < l1){
            arr[k++] = nums1[i++];
        }
        while(j < l2){
            arr[k++] = nums2[j++];
        }
        
        int mid = (arr.length-1)/2;
        int m, n;
            m =arr[mid];
        
        if(arr.length > 1)
            n = arr[mid+1];
        else
            n = 0;
        
        
        double median = (m+n)/2.0;
        double median1 = m;
        
        if(arr.length % 2 == 0 && arr.length>0)
            return median;
        else
            return median1;
    }
}