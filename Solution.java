class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int size=nums1.length+nums2.length;
        int a[]=new int[size];
        int n=nums1.length;
        int temp=0;
        double sum=0;
        int m=nums2.length;
        
           for(int i=0;i<n;i++){
            a[i]=nums1[i];
           }
           for(int i=0;i<m;i++){
            a[nums1.length+i]=nums2[i];
           }
        for(int i=0;i<size;i++){
            for(int j=0;j<size-i-1;j++){
                if(a[j]>a[j+1]){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        if(size==1){
            sum=a[0];
            sum=sum/2;
        }
        if(size%2==0){
            sum=a[size/2]+a[(size/2)-1];
            sum=sum/2;
        }
        else {
            int n1=size/2;
            sum=a[n1];
        }
        return sum;
    }
}
