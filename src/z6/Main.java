package z6;
import java.util.Arrays;
import java.util.Random;
public class Main {
    public static void main(String args[]){
        Random random;
        random = new Random();
        int arr[] = new int[10];
        for (int i=0;i<arr.length;i++) {
            arr[i] = random.nextInt(100 - 10+1) + 10;
        }
        System.out.println("Unsorted: ");
        System.out.println(Arrays.toString(arr));
        randomize(arr);
        System.out.println("Sorted: ");
        print_arr(arr);
    }

    private static int[] randomize(int arr[]){
        Arrays.sort(arr);
        return arr;
    }

    private static void print_arr(int arr[]){
        System.out.println(Arrays.toString(arr));
    }

}
