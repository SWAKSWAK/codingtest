package center_char;
class Solution {
    public String solution(String s) {
    	int i = s.length();
        if (i%2 == 0)	{ return s.substring((i-1)/2, (i-1)/2+2); }
        else			{ return s.substring(i/2, i/2+1); }
    }
}
public class CenterChar {
	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.solution("abcde"));
		System.out.println(s.solution("qwer"));
	}
}
