package string_sort_desc;

import java.util.Arrays;
import java.util.Collections;

class Solution {
	public String solution(String s) {
		String answer = "";
		String[] a = s.split("");
		StringBuffer sb = new StringBuffer();
		Arrays.sort(a, Collections.reverseOrder());
		for (int i = 0; i < a.length; i++) {
			sb.append(a[i]);
		}
		answer = sb.toString();
		return answer;
	}
}

public class StringSortDESC {
	public static void main(String[] args) {
		Solution s = new Solution();
		String a = s.solution("Zbcdefg");
		System.out.println(a);
	}
}
