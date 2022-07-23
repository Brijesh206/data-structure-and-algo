//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class MissingNumInArray {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().trim().split(" ");
            int[] array = new int[n - 1];
            for (int i = 0; i < n - 1; i++) {
                array[i] = Integer.parseInt(str[i]);
            }
            Solution sln = new Solution();
            System.out.println(sln.MissingNumber(array, n));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int MissingNumber(int array[], int n) {
        // Your Code Here
        // int arr[] = new int[n-1];
        // arr = array;
        // Arrays.sort(arr);
        // int returnVal=0;
        // for(int i=0; i<arr.length;i++){
        //     if(arr[i] != i+1){
        //         returnVal = i+1;
        //         break;
        //     }
        // }
        // return returnVal;
        
        int total=0, sum=0;
        for(int i=0; i<n; ++i) total += (i+1);
        for(int i=0; i<array.length; ++i) sum += array[i];
        return total-sum;
    }
}
