import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Scanner;

public class JavaDeque {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashSet<Integer> set = new HashSet<>();
        Deque<Integer> deque = new ArrayDeque<>();
        int n = in.nextInt();
        int m = in.nextInt();
        int max = 0;

        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            deque.offer(num);
            set.add(num);

            if(deque.size() > m){
                int temp = deque.pop();
                if(!deque.contains(temp)){
                    set.remove(temp);
                }
            }

            if(deque.size() == m){
                int unique = set.size();
                max = Math.max(unique, max);
            }
        }

        System.out.println(max);
    }
}
