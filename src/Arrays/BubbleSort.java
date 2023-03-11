package Arrays;

import java.util.Arrays;
public class BubbleSort {

    public int [] sort(int[] array){

        for(int i=0; i<array.length-1; i++){
            for(int j=0; j< array.length-i-1; j++){
                if(array[j] > array[j+1]){
                    int temp = 0;
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }

            }
        }
        return array;
    }

    public static void main(String[] args) {
        int [] array = {2,6,4,9,5,10,7,3};
        BubbleSort bubbleSort = new BubbleSort();
        System.out.println(Arrays.toString(bubbleSort.sort(array)));
    }
}
