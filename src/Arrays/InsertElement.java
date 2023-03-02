package Arrays;
import java.util.Arrays;

public class InsertElement {

    public int[] insertAtEnd(int[] array, int x){
        int n = array.length;
        int[] newArray = new int[n+1];
        for (int i = 0; i < n; i++) {
            newArray[i] = array[i];
        }
        newArray[n] = x;
        return newArray;
    }

    public static void main(String[] args) {
        InsertElement insertElement = new InsertElement();
        int[] array = {1,2,3,4,5,6,7,8};
        System.out.println(Arrays.toString(insertElement.insertAtEnd(array,10)));

    }
}
