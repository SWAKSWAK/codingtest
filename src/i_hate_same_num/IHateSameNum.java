	package i_hate_same_num;

import java.util.ArrayList;

class Solution {
    public int[] solution(int []arr) {
    	
    	int temp = 10;
        int[] a;
        
        ArrayList<Integer> al = new ArrayList<Integer>();
        
        for ( int i = 0 ; i < arr.length ; i++) {
        	if (arr[i] != temp) {
        		al.add(arr[i]);
        		temp=arr[i];
        	}
        }
        a = new int[al.size()];
        for (int i = 0 ; i < a.length ; i++) {
        	a[i]=al.get(i);
        }
        return a;
    }
}

public class IHateSameNum {
	public static void main(String[] args) {
		Solution s = new Solution();
		int [] a1 = s.solution(new int[]{1,1,3,3,0,1,1});
		int [] a2 = s.solution(new int[] {4,4,4,3,3});
		
		for (int i : a1) {
			System.out.print(i + " ");
		}
		System.out.println();
		for (int i : a2)
			System.out.print(i + " ");
		}
}
