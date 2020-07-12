package mock_test;


class Solution{
	public int[] solution(int[] answers) {
		int s1, s2, s3;
		s1 = s1(answers);
		s2 = s2(answers);
		s3 = s3(answers);
		int[] answer = null;
		if (s1 > s2 && s1 > s3 ) {
			answer = new int[] {1};
		}else if (s2 > s3 && s2 > s1) {
			answer = new int[] {2};
		}else if (s3 > s2 && s3 > s1) {
			answer = new int[] {3};
		}else if (s1 == s2 && s1 > s3) {
			answer = new int[] {1, 2};
		}else if (s2 == s3 && s2 > s1) {
			answer = new int[] {2, 3};
		}else if (s1 == s3 && s1 > s2) {
			answer = new int[] {1, 3};
		}else {
			answer = new int[] {1, 2, 3};
		}
		
		
		
        
        return answer;
    }
	public int s1 (int[] answers) {
		int num = 1;
		int count = 0;
		int s1[] = new int[answers.length];

		for (int i = 0 ; i < answers.length ; i++, num++) {
			s1[i] = num;
			if (num == 5) {
				num=1;
			}
		}
		
		for (int i = 0 ; i < answers.length ; i++) {
			if (answers[i] == s1[i]) {
				count++;
			}
		}
		return count;
	}
	public int s2 (int[] answers) {
		int a[] = {1,3,4,5};
		int s2[] = new int[answers.length];
		int n = 0;
		int count = 0;
		for (int i = 0 ; i < answers.length ; i++) {
			if (i==0) {
				s2[i] = 2;
			}else if (i%2 != 0) {
				
				s2[i] = a[n];
				n++;
				
				if (n==5) {
					n=0;
				}
			}else {
				s2[i] = 2;
			}
		}
		for (int i = 0 ; i <answers.length ; i++) {
			if (answers[i] == s2[i]) {
				count++;
			}
		}
		return count;
	}
	
	public int s3 (int[] answers) {
		int a[] = {3,3,1,1,2,2,4,4,5,5};
		int s3[] = new int[answers.length];
		int n = 0;
		int count = 0;
		
		for (int i = 0 ; i < s3.length ; i++) {
			s3[i] = a[n];
			n++;
			if (n == a.length) {
				n = 0;
			}
		}
		for (int i = 0 ; i < answers.length ; i++) {
			if (answers[i] == s3[i]) {
				count++;
			}
		}
		return count;
	}
	
}


public class SolutionTest {
	public static void main(String[] args) {
		Solution s = new Solution();
		for (int i : s.solution(new int[] {1,3,2,4,2})) {
			System.out.println(i + " ");
		}
	}
	
}
