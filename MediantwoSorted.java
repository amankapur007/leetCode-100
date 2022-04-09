public class MediantwoSorted{
    public static void main(String[] args) {
       int[] nums1 =  {-5, 3, 6, 12, 15};//{2, 3, 5, 8};
       int[] nums2 = {-12, -10, -6, -3, 4, 10};//{10, 12, 14, 16, 18, 20};
       int l = (nums1.length+nums2.length)/2;
       int mid=0;
       int prev=0;
       int start1 = 0;
       int start2 = 0;
       int c = 0;
       if((nums1.length+nums2.length)%2!=0){
           while(start1<nums1.length && start2<nums2.length && c<=l){
               if(nums1[start1]<=nums2[start2]){
                   mid = nums1[start1];
                   start1++;
               }else{
                   mid = nums2[start2];
                   start2++;
               }
               c++;
           }
           while(start1<nums1.length && c<=l){
               mid = nums1[start1];
               start1++;
               c++;
           }
           while(start2<nums2.length && c<=l){
            mid = nums2[start2];
            start2++;
            c++;
           }
        System.out.println(mid);
       }else{
        while(start1<nums1.length && start2<nums2.length && c<=l){
            prev = mid;
            if(nums1[start1]<=nums2[start2]){
                mid = nums1[start1];
                start1++;
            }else{
                mid = nums2[start2];
                start2++;
            }
            c++;
        }
        while(start1<nums1.length && c<=l){
            prev = mid;
            mid = nums1[start1];
            start1++;
            c++;
        }
        while(start2<nums2.length && c<=l){
            prev = mid;
         mid = nums2[start2];
         start2++;
         c++;
        }    
        System.out.println(prev);
        System.out.println(mid);
        System.out.println((prev+mid)/2.0);
       }

    }
}