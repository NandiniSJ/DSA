package Arrays;



import java.util.Arrays;
public class SecondLargestElement {

    public void findSecondLargest(int[] array){
        if(array.length<2){
            System.out.println("Invalid input");
        }

        Arrays.sort(array);
        int n = array.length;
        for (int i = n-2; i <=n-1 ; i++) {
            if (array[i] != array[n - 1]) {
                System.out.println("Second max element is" + array[i]);
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {1,6,7,2,9,3,4};
        SecondLargestElement secondLargestElement = new SecondLargestElement();
        secondLargestElement.findSecondLargest(array);
    }
}
