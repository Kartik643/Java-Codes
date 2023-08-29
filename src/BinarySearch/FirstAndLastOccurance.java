//package BinarySearch;
//
//public class FirstAndLastOccurance {
//    public static void main(String[] args) {
//
//    }
//    public int[] searchRange(int[] nums, int target){
//
//    }
//
//    int search(int[] nums, int target, boolean firstStartIndex ){
//        int [] ans = {-1,-1};
//        int s = 0;
//        int h = nums.length-1;
//        while(s<=h){
//            int mid = s + (h-s)/2;
//            if(target <nums[mid]){
//                h = mid-1;
//            }
//            else if(target>nums[mid]){
//                s = mid+1;
//            }else{
//                return mid;
//            }
//        }
//        return ans;
//    }
//}
