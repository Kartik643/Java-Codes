import java.util.Arrays;

public class QuickSort {
    private static int com = 0;
    public static void main(String[] args) {
        int[] A = {5,8,1,2,4,6,0};
        sort(A, 0, A.length-1);
        System.out.println(Arrays.toString(A));
        System.out.println("number of comparisions are : " + com);
     }

    static void swap(int[] arr, int first, int last){
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last]=temp;
}
    static void sort(int[] nums, int low, int hi){
        if(low>=hi){
            return;
        }

        int s = low;
        int e = hi;
        int m = s+(e-s)/2;
        int pivot = nums[m];

        while(s<=e){
            while(nums[s]< pivot){
                s++;
                com++;
            }
            while(nums[e] > pivot){
                e--;
                com++;
            }


            if(s<=e){
                swap(nums, s, e);
                s++;
                e--;
            }
        }
        sort(nums, low,e);
        sort(nums, s,hi);
    }
    public static void Rsort(int[] nums, int low, int hi){
        if(low>=hi){
            return;
        }
        int s = low, e = hi;
        int r = (low) + (int)(Math.random() * (hi - low + 1));
        swap(nums, r, low);
        int pivot = low;
        while(s<e){
            while(nums[pivot]>nums[s] && s<=hi){
                s++;
                com++;
            }
            while(nums[pivot]<=nums[e] && e>low){
                e--;
                com++;
            }
            if(s<e){
                swap(nums, e, s);
            }
        }
        swap(nums, e, pivot);
        Rsort(nums, low, e-1);
        Rsort(nums, e+1, hi);

    }
}
