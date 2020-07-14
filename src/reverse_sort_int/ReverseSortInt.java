package reverse_sort_int;

// ���α׷��ӽ� �ڵ��׽�Ʈ ���� level 1 �ڿ��� ������ �迭�� �����
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
