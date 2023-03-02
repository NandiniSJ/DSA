package Arrays;

public class BinarySearch {

    public int binarySearch(int[] array, int key, int low, int high){
        if(high < low){
            return -1;
        }
        int mid = (low + high) / 2;
        if(key == array[mid]){
            return mid;
        }
        if(key > array[mid]){
            return binarySearch(array, key, mid+1, high);
        }
           return binarySearch(array,key,low, mid-1);
    }


    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};

        BinarySearch binarySearch = new BinarySearch();
        int index = binarySearch.binarySearch(array, 4, 0, 8);

        if(index == -1){
            System.out.println("Key not found");
        }else{
            System.out.println("Key found at index: " + index);
        }
    }
}
