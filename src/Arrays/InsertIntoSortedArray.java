package Arrays;

public class InsertIntoSortedArray {

    public void insert(int[] array, int k, int low, int high){
        if(high < low){
            return;
        }
        int mid = (low + high)/ 2;
        if(k == array[mid]){
            for (int i = mid+1; i <=high ; i++) {
                array[i+1] = array[i];
            }
            array[mid] = array[mid+1];

        }
    }
}
