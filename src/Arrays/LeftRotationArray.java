package Arrays;

import java.util.Arrays;

public class LeftRotationArray {

    public int [] leftRotateAnArray(int [] array, int k){
        int n = array.length;
        int [] leftRotatedArray = new int[n];
        for (int i = k; i < n; i++) {
            leftRotatedArray[i-k] = array[i];
        }
        for (int i = 0; i <k ; i++) {
            leftRotatedArray[n+i-k] = array[i];
        }

        return leftRotatedArray;
    }

    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6,7,8};
        LeftRotationArray leftRotationArray = new LeftRotationArray();
        System.out.println(Arrays.toString(leftRotationArray.leftRotateAnArray(array, 3)));
    }
}
