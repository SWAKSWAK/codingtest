package zero_modulo_array;

import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer;
        ArrayList<Integer> al = new ArrayList<Integer>();
        
        for (int i = 0 ; i<arr.length ; i++) {
        	if (arr[i]%divisor == 0) 
        		al.add(arr[i]);
        }
        
        if (al.size()==0) {
        	answer = new int[]{-1};
        	return answer;
        }
        
        answer = new int [al.size()];
        
        for (int i = 0 ; i < answer.length ; i++) {
        	answer[i] = al.get(i);
        }
        
        Arrays.sort(answer);
        return answer;
    }
}
public class ModuloZeroArray {
	public static void main(String[] args) {
		Solution s1 = new Solution();
		int []a1 = s1.solution(new int[] {5, 9, 7, 10}, 5);
		int []a2 = s1.solution(new int[] {2, 36, 1, 3}, 1);
		int []a3 = s1.solution(new int[] {3,2,6}, 10);
		
		for (int i : a1) {
			System.out.print(i + " ");
		}
		for (int i : a2) {
			System.out.print(i + " ");
		}
		for (int i : a3) {
			System.out.print(i + " ");
		}
	} 
}
