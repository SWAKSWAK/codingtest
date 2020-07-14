package reverse_sort_int;

// 프로그래머스 코딩테스트 연습 level 1 자연수 뒤집어 배열로 만들기
// https://programmers.co.kr/learn/courses/30/lessons/12932/solution_groups?language=java&type=my

import java.util.Arrays;

class Solution {
	public int[] solution(long n) {
		String str = n + "";
		int[] answer = new int[str.length()];
		for (int i = str.length()-1, j = 0 ; i >= 0 ; i--, j++) 
			answer[j] = Integer.parseInt(str.charAt(i)+"");		
		return answer;
	}
}

public class ReverseSortInt {
	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(Arrays.toString(s.solution(12345)));
	}
}
