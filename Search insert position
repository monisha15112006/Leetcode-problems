import java.util.*;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        int n = sc.nextInt();

        int[] nums = new int[n];

        
        
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Input value to remove
        
        int val = sc.nextInt();

        // Call function
        int k = removeElement(nums, val);

        // Output result
        System.out.println(k);
        

        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }

        sc.close();
    }

    // Function to remove elements
    public static int removeElement(int[] nums, int val) {
        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }
}
