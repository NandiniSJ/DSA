package Arrays;

import java.util.Arrays;

public class MoveZerosToEnd {

    public int[] moveZerosToEnd(int [] array){
        for(int i=0; i < array.length-1; i++){
            for(int j= 0; j< array.length-i-1; j++){
                if(array[j] == 0){
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
        int[] array = {1,0,6,4,0,8,3,0,6,0,0,0,6};
        MoveZerosToEnd moveZerosToEnd = new MoveZerosToEnd();
        System.out.println(Arrays.toString(moveZerosToEnd.moveZerosToEnd(array)));
    }
}
