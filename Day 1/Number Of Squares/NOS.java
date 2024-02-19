import java.util.*;
public class NOS{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] strs = sc.nextLine().split(" ");
        int m = Integer.parseInt(strs[0]);
        int n = Integer.parseInt(strs[1]);
        int[][] arr = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(numberofsquares(arr));
    }
    public static int numberofsquares(int[][] matrix) {
        int i ,j;
        int max=0,m=matrix.length,n=matrix[0].length;
        int mat[][]= new int [m+1][n+1];
        if(m==0){
            return 0;
        }
        int ans = 0;
        for(i=1;i<=m;i++){
           for(j=1;j<=n;j++){
             if(matrix[i-1][j-1]==0){
                 mat[i][j]=0;
                 
             }
             else{
                 int kl = Math.min(mat[i-1][j-1],mat[i-1][j]);
                 mat[i][j]=Math.min(kl,mat[i][j-1])+1;
             }
             ans+=mat[i][j];
             
           }
       }
       return ans;
    }

    
}