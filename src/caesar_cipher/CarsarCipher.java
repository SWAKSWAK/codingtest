package caesar_cipher;
//프로그래머스 코딩테스트 연습 level 1 시저암호
class Solution {
	public String solution(String s, int n) {
		char c;
		String atoz = ("abcdefghijklmnopqrstuvwxyz");//index 값 얻기 위한 a ~ z
		StringBuffer sb = new StringBuffer();
		
		for (int i = 0; i < s.length(); i++) {
			c = s.charAt(i);//s의 한글자씩 접근
			int index = atoz.indexOf(Character.toLowerCase(c) + "");//c의 a~z에서 인덱스값

			if (c == ' ')
				sb.append(c);//공백일 경우 바로 추가
				if (Character.isLowerCase(c))//소문자일경우
					sb.append(atoz.charAt((index + n) % 26));//추가 
				else//대문자일 경우
					sb.append(Character.toUpperCase(atoz.charAt((index + n) % 26)));//대문자로 변환 후 추가
				
			}
		return sb.toString();
	}
}

public class CarsarCipher {
	public static void main(String[] args) {
		Solution s = new Solution();
		String s1 = s.solution("AB", 1);
		String s2 = s.solution("z", 1);
		System.out.println(s1);
		System.out.println(s2); 
	}
}
