package leet.code.easy;

import java.util.HashMap;

/*
    Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
    For example, 2 is written as II in Roman numeral, just two one's added together. 12 is written as XII, which is simply X + II. 
    The number 27 is written as XXVII, which is XX + V + II.
	Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. 
	Instead, the number four is written as IV. Because the one is before the five we subtract it making four. 
	The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:
	Given a roman numeral, convert it to an integer.
 */

public class RomanToInteger {
	public int romanToInt(String s) {
		HashMap<Character, Integer> map = new HashMap<>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		
		//"IV" 
		//+1 -1 + 5 = 5 but the answer would have to be 4
		int sum = 0;
		
		for(int i = 0; i <s.length(); i++) {
			if (s.charAt(i) == 'V' || s.charAt(i) == 'X') {
				if (i > 0 && s.charAt(i-1) == 'I') sum -= 2;
			}
			if (s.charAt(i) == 'L' || s.charAt(i) == 'C') {
				if (i > 0 && s.charAt(i-1) == 'X') sum -= 20;
			}
			if (s.charAt(i) == 'D' || s.charAt(i) == 'M') {
				if (i > 0 && s.charAt(i-1) == 'C') sum -= 200;
			}
			sum += map.get(s.charAt(i));
		}
		return sum;
	}
}
