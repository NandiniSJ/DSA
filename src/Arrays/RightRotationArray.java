package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RightRotationArray {

    public int[] rightRotateAnArray(int [] array, int k){
        int n = array.length;
        int[] rightRotatedArray = new int[array.length];
        for (int i = 0; i < n ; i++) {
           if(i<k){
               rightRotatedArray[i] = array[n-k+i];
           }else{
               rightRotatedArray[i] = array[i-k];
           }
        }
        return rightRotatedArray;
    }

    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6,7,8};
        RightRotationArray rightRotationArray = new RightRotationArray();
        System.out.println(Arrays.toString(rightRotationArray.rightRotateAnArray(array, 3)));
    }
}
