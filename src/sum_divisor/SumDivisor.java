package sum_divisor;
//���α׷��ӽ� �ڵ��׽�Ʈ ���� level 1 ����� ��
// https://programmers.co.kr/learn/courses/30/lessons/12928
class Solution {
	public int solution(int n) {
		int answer = n;
		for (int i = 1; i <= n/2; i++)
			if (n % i == 0)
				answer += i;
		return answer;
	}
}

public class SumDivisor {
	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.solution(12));//28
		System.out.println(s.solution(5));//5
	}
}
