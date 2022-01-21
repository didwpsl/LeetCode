package leet.code.easy;

import java.util.HashMap;
import java.util.Map;

/*
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target 
 * You may assume that each input would have exactly one solution and you may not use the same element twice. 
 */

public class TwoSum {
	
	public int[] twoSum(int[] nums, int target) {
	for(int i = 0; i<nums.length; i++) {
		for(int j=i+1; j<nums.length; j++) {
			int complement = target - nums[i];
			
			if(nums[j] == complement) {
				return new int[] {i, j};
				}
			}
		}
	 throw new IllegalArgumentException("no match found");
	}
	
	//Better solution (make time faster) 
	public int[] twoSum2(int[] nums, int target) {
		Map<Integer, Integer> num_map = new HashMap<>();
		
		for(int i = 0; i<nums.length; i++) {
			int complement = target - nums[i];
			
			if(num_map.containsKey(complement)) {
				return new int[] {num_map.get(complement), i};
			}
			
			num_map.put(nums[i], i);
		}
		
		throw new IllegalArgumentException("no match found!");
	}
}

