package sum_two_num;

class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        if (a>b) {
        	int temp = a;
        	a = b;
        	b = temp;
        }
        for (int i = a ; i <=b ; i++) {
        	answer+=i;
        }
        return answer;
    }
}

public class SumTwoNum {

	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.solution(3, 5));
		System.out.println(s.solution(3, 3));
		System.out.println(s.solution(5, 3));
	}
}
