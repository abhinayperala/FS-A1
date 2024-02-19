import java.util.*;
public class Teams {
    public static int countTeams(int[] arr) {
        int count = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++){
                    if(arr[i] < arr[j] && arr[j]<arr[k]){
                        count++;
                    }
                    else if(arr[i]>arr[j] && arr[j]>arr[k]){
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(countTeams(arr));
    }
}
