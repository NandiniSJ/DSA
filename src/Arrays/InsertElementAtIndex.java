package Arrays;

import java.util.Arrays;

public class InsertElementAtIndex {

    public int[] insertAtGivenIndex(int[] array, int n, int k, int index){
        for (int i = n-1; i >index ; i--) {
            array[i+1] = array[i];
            array[index] = k;
        }
        return array;
    }

    public static void main(String[] args) {
        InsertElementAtIndex insertElementAtIndex = new InsertElementAtIndex();
        int[] array = new int[10];
        array[0] = 20;
        array[1] = 1;
        array[2] = 2;
        array[3] = 3;
        array[4] = 4;
        array[5] = 5;
        array[6] = 6;
        array[7] = 7;
        array[8] = 8;
        int n = 8;

        System.out.println(Arrays.toString(array));

        n=n+1;

        System.out.println(Arrays.toString(insertElementAtIndex.insertAtGivenIndex(array,n, 10, 3)));

    }
}
