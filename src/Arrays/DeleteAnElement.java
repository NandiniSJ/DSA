package Arrays;

import java.util.Arrays;

public class DeleteAnElement {

    public int findIndex(int[] array, int k, int n){
        for(int i = 0; i < n; i++){
           if(array[i] == k){
               return i;
           }
        }
        return -1;
    }

    public int[] deleteElement(int[] array, int k, int n){
        final int index = findIndex(array, k, n);
        if(index == -1){
            System.out.println("Element not found");
        }else{
            for (int i = index; i <n ; i++) {
              array[i] = array[i+1];
            }
        }

        return array;
    }

    public static void main(String[] args) {
        DeleteAnElement deleteAnElement = new DeleteAnElement();
        int[] array = new int[12];
        array[0] = 20;
        array[1] = 1;
        array[2] = 2;
        array[3] = 3;
        array[4] = 4;
        array[5] = 5;
        array[6] = 6;
        array[7] = 7;
        array[8] = 8;
        int n = 9;

        int index = deleteAnElement.findIndex(array, 4, n);
        System.out.println(Arrays.toString(deleteAnElement.deleteElement(array, 4, n)));
    }
}
