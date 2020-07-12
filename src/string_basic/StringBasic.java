package string_basic;

class Solution {
	public boolean solution(String s) {
		boolean answer = false;
		String[] sa = s.split("");
		int cnt = 0;

		for (int i = 0; i < s.length(); i++) {
			try {
				Integer.parseInt(sa[i]);
			} catch (NumberFormatException e) {
				return false;
			}
			cnt++;
		}
		if (cnt == 4 || cnt == 6)
			answer = true;
		
		return answer;
	}
}

public class StringBasic {
	public static void main(String[] args) {
		Solution s = new Solution();
		boolean b1 = s.solution("a234");
		boolean b2 = s.solution("1234");
		System.out.println(b1 + "\n" + b2);
	}
}
