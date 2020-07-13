package sum_all_num;
/*
 * 프로그래머스 코딩테스트 연습 level 1 자릿수 더하기
 * https://programmers.co.kr/learn/courses/30/lessons/12931
 */
class Solution {
	public int solution(int n) {
		int answer = 0;
		String s = n + "";
		for (int i = 0; i < s.length(); i++) {
			int val = Integer.parseInt(s.charAt(i) + "");
			answer += val;
		}

		return answer;
	}
}

public class SumAllNum {
	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.solution(123));
		System.out.println(s.solution(987));
	}
}
