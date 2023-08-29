class MissingNumber {
    public int MissingNumber(int[] A){
        int i = 0;
        while(i<A.length){
            if(A[i] <A.length && A[i]-1 != i){
                swap(A,(A[i]-1),i);
            }
            else{
                i++;
            }
        }

        for(int j = 0;j<A.length;j++){
            if(A[j] != j){
                return A[j];
            }
        }

        return A.length;
    }

    void swap(int[] A, int first, int second){
        int temp = A[first];
        A[first] = A[second];
        A[second] = temp;
    }
}