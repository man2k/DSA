import java.util.ArrayList;
class medianOfTwoArr {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int p1 = 0;
        int p2 = 0;
        int size1 = nums1.length;
        int size2 = nums2.length;
        ArrayList<Integer> a = new ArrayList<>();
        int medi = (size1+size2)/2+1;
        for(int i = 0; i < medi; i++){
            if(p1>size1-1 && p2>size2-1){
                break;
            }else if(p1>size1-1){
                a.add(nums2[p2]);
                p2++;
            }else if(p2>size2-1){
                a.add(nums1[p1]);
                p1++;
            }else{
                if(nums1[p1]<nums2[p2]){
                    a.add(nums1[p1]);
                    p1++;
                }else if(nums1[p1]>nums2[p2]){
                    a.add(nums2[p2]);
                    p2++;
                }else if(nums1[p1] == nums2[p2]){
                    a.add(nums1[p1]);
                    a.add(nums2[p2]);
                    p1++;
                    p2++;
                }
            }
        }
        double median = 0.0;
        if((size1+size2)%2==0){
            int avg = a.get(medi-1)+a.get(medi-2);
            median = (double)avg/2;
        }else{
            median = (double)a.get(medi-1);
        }
        return median;
    }
}