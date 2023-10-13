/* this Code is the illustration of Boyer moore's voting algorithm to
find the majority element is an array that appears more than n/2 times in an array
where "n" is the length of the array.
For more information on the algorithm refer
https://en.wikipedia.org/wiki/Boyer%E2%80%93Moore_majority_vote_algorithm
 */
package com.thealgorithms.others;

import java.util.*;

public class BoyerMoore {

        public static List<Integer> findmajor(int[] nums) {
            int n = nums.length/2, count;
            List<Integer> ans = new ArrayList<>();
            for(int num:nums){
                count = 0;
                for(int i=0;i<nums.length;i++){
                    if(nums[i]==num){
                        count++;
                    }
                }
                if(n<count && !ans.contains(num)){
                    ans.add(num);
                }
            }
            return ans;
        }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = input.nextInt();
        }
        System.out.println("the majority element is " + findmajor(a));
        input.close();
    }
}
