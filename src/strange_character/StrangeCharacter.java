package strange_character;
//프로그래머스 코딩테스트 연습 level 1 이상만 문자 만들기
// https://programmers.co.kr/learn/courses/30/lessons/12930

class Solution {
	public String solution(String s) {
		StringBuffer sb = new StringBuffer();
		int index = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ') {
				sb.append(" ");
				index = 0;
			} else {
				if (index % 2 != 1) {
					sb.append(Character.toUpperCase(s.charAt(i)));
					index++;
				} else {
					sb.append(Character.toLowerCase(s.charAt(i)));
					index++;
				} 
			}
		}
		return sb.toString();
	}
}

public class StrangeCharacter {
	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.solution("try hello world"));
	}
}
