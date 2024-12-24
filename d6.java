//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class d6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        while (t-- > 0) {
            String s = sc.nextLine();
            String[] parts = s.split(" ");
            int[] nums = new int[parts.length];
            for (int i = 0; i < parts.length; i++) {
                nums[i] = Integer.parseInt(parts[i]);
            }
            Solution ob = new Solution();
            List<Integer> ans = ob.findMajority(nums);

            if (ans.size() == 0) {
                System.out.println("[]");
            } else {
                for (int i : ans) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}

// } Driver Code Ends


class Solution {
    // Function to find the majority elements in the array
    public List<Integer> findMajority(int[] nums) {
        // Your code goes here.
        
        
        int n=nums.length;
        int ot = n/3;
//Brute Force

        // List<Integer> l =new ArrayList<>();
        // for(int i=0;i<n;i++)
        // {
        //     int c=0;
            
        //     for(int j=0;j<n;j++)
        //     {
        //         if(nums[i] == nums[j]) {
        //             c++;
        //         }
        //     }
            
        //     if(c>ot && !l.contains(nums[i]))
        //     {
        //         l.add(nums[i]);
        //     }
        // }
        // Collections.sort(l);
        // return l;
        
        
//Better 
        List <Integer> l =  new ArrayList<>();
        
        HashMap<Integer, Integer>mpp=new HashMap<>();
        
        for(int i=0;i<n;i++)
        {
            int val=mpp.getOrDefault(nums[i],0);
            mpp.put(nums[i], val+1);
        }
        
        for(Map.Entry<Integer,Integer> it: mpp.entrySet())
        {
            if(it.getValue()>ot)
            {
                l.add(it.getKey());
            }
        }
        return l;
    }
}
