package Arrays;

public class SearchElementArray {

    public int searchElement(int[] array, int key){
        for (int i = 0; i < array.length; i++) {
            if(array[i] == key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6,7,8,9};
        int key = 5;
        SearchElementArray searchElementArray = new SearchElementArray();
        int index = searchElementArray.searchElement(array,key);
        if(index == -1){
            System.out.println("Key not found");
        }else{
            System.out.println("key found at index: " + index);
        }
    }
}
