package Arrays;

import java.util.Arrays;
public class InsertIntoSortedArray {

    public static int insert(int[] array, int k, int n, int capacity){
        if(n > capacity){
            return -1;
        }

        int i;
        for(i = n-1; (i >=0 && array[i] > k); i--) {
            array[i + 1] = array[i];
        }
            array[i+1] = k;
        return  n+1;

    }

    public static void main(String[] args) {
        int[] array = new int[15];
        array[0] = 0;
        array[1] = 1;
        array[2] = 2;
        array[3] = 3;
        array[4] = 5;
        array[5] = 6;
        array[6] = 6;
        array[7] = 7;
        array[8] = 9;
        int capacity = array.length;
        int n = 9;
        int k = 8;

        System.out.print("\nBefore Insertion: ");
        for (int i = 0; i < n; i++)
            System.out.print(array[i] + " ");

        n = insert(array, k, n, capacity);

        System.out.print("\nAfter Insertion: ");
        for (int i = 0; i < n; i++)
            System.out.print(array[i] + " ");
    }
}
