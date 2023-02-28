package Arrays;

import java.util.Arrays;

public class ReverseArray {

    public int[] reverseAnArray(int[] array){
        int temp;
        int start = 0;
        int end = array.length-1;
        while(start <end){
            temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end --;
        }

        return array;
    }

    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6};
        ReverseArray reverseArray = new ReverseArray();
        System.out.println(Arrays.toString(reverseArray.reverseAnArray(array)));
    }
}
