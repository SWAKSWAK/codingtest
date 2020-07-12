package supoja;

import java.util.ArrayList;
import java.util.Arrays;

class Solution{
	public int[] solution (int[] a) {
		int[][] supoja = null;
		ArrayList<Integer> al = new ArrayList<Integer>();
		supoja = new int[][]{{1,2,3,4,5},{2,1,2,3,2,4,2,5},{3,3,1,1,2,2,4,4,5,5}};
//		supoja[1] = new int[]{2,1,2,3,2,4,2,5};
//		supoja[2] = new int[]{3,3,1,1,2,2,4,4,5,5};
		int cnt[] = new int[3];
		int[] answer = null;
		int max = 0;
		int maxCnt = 0;
		
		
		for ( int i = 0 ; i < 3 ; i++) {
			int k=0;
			for (int j = 0 ; j < a.length ;j++, k++) {	
//				System.out.println("i= " +i+"      k = " + k);
				if (supoja[i][k] == a[j]) {
					cnt[i]++;
					
//					System.out.println((i+1) + "번 학생 정답 --- " + cnt[i]);
				}
				if (k!= a.length-1 && k==supoja[i].length-1) {
//					System.out.println(i+"[k초기화] k="+k+"\tsupoja["+i+"].length="+supoja[i].length);
					k=0;
				}
			}
		}
		
		for (int i = 0 ; i < cnt.length ; i++) {
//			System.out.println(cnt[i]);
			if (max < cnt[i]) {
				max = cnt[i];
//				System.out.println("max"+(i+1));
				al.add(i+1);
				maxCnt++;
			}
			else if (max == cnt[i]) {
				al.add(i+1);
				maxCnt++;
			}
		}
		if (maxCnt==0) {
			answer = new int [supoja.length];
			for (int i = 0 ; i < supoja.length ; i++) {
				answer[i] = i+1;
			}
				return answer;
		}
//		System.out.println(al.toString());
//		for (int i : al)
//			System.out.print(i + " ");
		answer = new int[maxCnt];
//		System.out.println(maxCnt);
		for (int i = 0 ; i < answer.length ; i++) {
			answer[i] = al.get(i);
//			System.out.print(answer[i]);
		}
		return answer;
		
	}
}

public class Supoja {
	public static void main(String[] args) {
		Solution s = new Solution();
//		for (int i : s.solution(new int[] {1,2,3,4,5})) {
//			System.out.println(i + " ");
//		}		
//		for (int i : s.solution(new int[] {1,3,2,4,2})) {
//			System.out.println(i + " ");
//		}
		//{{1,2,3,4,5},{2,1,2,3,2,4,2,5},{3,3,1,1,2,2,4,4,5,5}
		int [] a = s.solution(new int[] {1,2,3,4,5});
		int [] b = s.solution(new int[] {1,3,2,4,2});
		int [] c = s.solution(new int[] {1,3,3,5,5});
		int [] d = s.solution(new int[] {0,0,0,0,0});
		int [] e = s.solution(new int[] {2,1,2,3});
		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(c));
		System.out.println(Arrays.toString(d));
		System.out.println(Arrays.toString(e));
		
		
//		int[] a = s.solution(new int[] {1,2,3,4,5});
//		int[] b = s.solution(new int[] {1,3,2,4,2});
//		Arrays.toString(a);
//		Arrays.toString(b);
		
		
	}
}
