import java.util.*;
public class ShiftFirstOneToLastQueue {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
java.util.LinkedList<Integer> queue=new java.util.LinkedList<>();
        for(int i=1;i<n;i++){
            queue.offer(arr[i]);
        }
        queue.offer(arr[0]);
        for(int val:queue){
            System.out.print(val+" ");
        }
        sc.close();
}
}