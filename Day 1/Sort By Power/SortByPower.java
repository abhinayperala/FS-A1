import java.util.*;

public class SortByPower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" ");

        int lo = Integer.parseInt(str[0]);
        int hi = Integer.parseInt(str[1]);
        int k = Integer.parseInt(str[2]);
        int[] arr = new int[hi - lo + 1];
        for (int i = 0, j = lo; i < hi - lo + 1 && j <= hi; i++, j++) {
            arr[i] = j;
        }
        int[] powers = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int y = arr[i];
            int count = 0;
            while (y != 1) {
                if (y % 2 == 0) {
                    y = y / 2;
                    count++;
                } else {
                    y = 3 * y + 1;
                    count++;
                }
            }
            powers[i] = count;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (powers[j] > powers[j + 1]) {
                    int temp = powers[j];
                    powers[j] = powers[j + 1];
                    powers[j + 1] = temp;
                    int temp1 = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp1;
                }
            }
        }
        System.out.println(arr[k - 1]);
    }

}