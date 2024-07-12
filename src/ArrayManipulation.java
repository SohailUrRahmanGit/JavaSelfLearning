import java.util.Arrays;

public class ArrayManipulation {
    public static void main(String[] args) {
        int sum = 0;
        int [] arr = {100,200,300,101,202,303,404 };
        System.out.println(Arrays.toString(arr));

        for(int i = 0; i<arr.length; i++) {
            arr[i] = 1 + (int) (Math.random()*100);
            sum += arr[i];
        }

        System.out.println("Sum of arr elements " +sum);
    }
}
