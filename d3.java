//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class d3 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());

        while (tc-- > 0) {
            String str[] = br.readLine().split(" ");
            int arr[] = new int[str.length];

            for (int i = 0; i < str.length; i++) arr[i] = Integer.parseInt(str[i]);
            Solution obj = new Solution();

            obj.reverseArray(arr);
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    public void reverseArray(int arr[]) {
        // code here
        int n = arr.length - 1;

    for (int i = 0; i < arr.length / 2; i++) 
    {
        // Swap arr[i] and arr[n]
        int temp = arr[i];
        arr[i] = arr[n];
        arr[n] = temp;
        n--;
    }

    }
}
