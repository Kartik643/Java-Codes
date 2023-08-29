public class BinarySortedArray {
    public static int countOnes(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == 1) {
                while (mid != 0 && arr[mid - 1] == 1) {
                    mid--;
                }
                return arr.length - mid;
            } else if (arr[mid] == 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return 0; // 
    }

    public static void main(String[] args) {
        int[] binarySortedArray = {0, 0, 0, 1, 1, 1, 1};
        System.out.println(countOnes(binarySortedArray));
    }
}
