//class DissapearedNum {
//    public List<Integer> findDisappearedNumbers(int[] A) {
//        int i = 0;
//        while(i < A.length){
//
//            if(A[i] < A.length && i != A[i]){
//                swap(A, i, A[i]);
//            }
//            else{
//                i++;
//            }
//        }
//        for(int j = 0;j<A.length;j++){
//            if(A[j] != j){
//                return j;
//            }
//        }
//        return A.length;
//    }
//    void swap(int[] A, int first, int second){
//        int temp = A[first];
//        A[first] = A[second];
//        A[second] = temp;
//    }
//}