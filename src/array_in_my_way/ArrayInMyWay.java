package array_in_my_way;

import java.util.Arrays;

class Solution{
    public String[] solution(String[] s, int n) {
    	
    	String[] answer = Arrays.copyOf(s, s.length);
    	int[] a = new int[s.length];
//    	char[] c = new char[s.length];
        Arrays.fill(a, 0);
        
        for (int i = 0 ; i < s.length ; i++) {
        	System.out.println("<<<"+i+">>>");
        	for (int j = 0 ; j < s.length ;j++) {
        		String ci = s[i].substring(n, n+1);
        		String cj = s[j].substring(n, n+1);
        		String si = s[i].substring(n+1, s[i].length());
        		String sj = s[j].substring(n+1, s[j].length());
        		String soi = s[i].substring(0, n);
        		String soj = s[j].substring(0, n);
        		System.out.println("s[" + i +"]length : " + s[i].length());
        		if (ci.compareTo(cj) > 0) {
        			a[i]++;
        		}else if (ci.compareTo(cj) == 0) {
        			if (si.compareTo(sj) > 0) {
	        			a[i]++;
	        			System.out.println("if1, ["+ i+"]=" + si +"++ = "+a[i]+ "\t, ["+j+"]=" + sj);
        			}else if (si.compareTo(sj) == 0) {
        				if (soi.compareTo(soj) > 0) {
        					a[i]++;
        				}
        			}
        		}//else if (ci==cj) {
//        			if (si.compareTo(sj) == 0) {
//        				if (soi.compareTo(soj) > 0) {
//        					a[i]++;
//        				}
//        					
//        			}
//        			if(si.compareTo(sj) > 0) {
//        				System.out.println("if2, ["+i+"]=" + soi + "++ = "+a[i]+ "\t, ["+j+"]=" + soj);
//        				a[i]++;
//        			}
//        		}
//        		if (!notZero) {
//        			if (positiveNumber)
//        				a[i]++;
//        		}//if
//        		System.out.print(s[i].substring(n, n+1) + " vs " + s[j].substring(n, n+1));
//        		System.out.print("\ta[" + i + "]=" + a[i] + ", \n");
        	}//for
        }//for
//        for (int i = 0 ; i < s.length ; i++) {
//        	for(int j = 0 ; j < s.length ; j++) {
//        		String ci = s[i].substring(n, n+1);
//        		String cj = s[j].substring(n, n+1);
//        		String si = s[i].substring(n+1, s[i].length());
//        		String sj = s[j].substring(n+1, s[j].length());
//        		if (ci.compareTo(cj) == 0) {
//        			if (si.compareTo(sj) > 0)
//        				a[i]++;
//        		}
//        			
//        	}
//        }
//        for (int i = 0 ; i < s.length ; i++) {
//        	for(int j = 0 ; j < s.length ; j++) {
//        		String soi = s[i].substring(0, n);
//        		String soj = s[j].substring(0, n);
//        		String si = s[i].substring(n+1, s[i].length());
//        		String sj = s[j].substring(n+1, s[j].length());
//        		if (si.compareTo(sj) == 0) {
//        			if (soi.compareTo(soj) > 0)
//        				a[i]++;
//        		}
//        			
//        	}
//        }
        
        System.out.println("순위");
        for (int i = 0 ; i < s.length ; i++) {
//        	System.out.print("\ts["+i+"] = " +s[a[i]]+" 순위 :"+a[i]);
//        	System.out.print(", ");
        	System.out.print("["+i+"]"+s[i]+ "(배정"+a[i]+")\t");
        }
        for (int i = 0 ; i < s.length ; i++) {
        	s[a[i]] = answer[i];
        }
        System.out.println();
        System.out.println("변경 후");
        for (int i = 0 ; i < s.length ; i++) {
        	System.out.print("s["+i+"] = " +s[i]);
        	System.out.print("\t");
        }
        answer = s;
        return answer;
    }

}

public class ArrayInMyWay {
	public static void main(String[] args) {
		Solution s = new Solution();
		String[] s1 = s.solution(new String[]{"sun", "bed", "car"}, 1);
		System.out.println();
		String[] s2 = s.solution(new String[] {"abce", "abcd", "cdx"}, 2);
		System.out.println();
		String[] s3 = s.solution(new String[] {"abcert", "wsxert", "bcdert"}, 2);
		System.out.println();

		String[] s4 = s.solution(new String[] {"eaeee", "ezeee", "eyeee", "egeee"}, 2);
		System.out.println();
		String[] s5 = s.solution(new String[] {"abzcd","cdzab","abzfg","abzaa","abzbb","cczaa","bbzaa", "aczbb", "aazbb"}, 2);
		System.out.println();
		
		
//		for (String a : s1) 
//			System.out.print(a + " ");
//		System.out.println();
//		for (String a : s2) 
//			System.out.print(a + " ");
//		System.out.println();
//		for (String a : s3) 
//			System.out.print(a + " ");
//		System.out.println();
//		for (String a : s4) 
//			System.out.print(a + " ");
//		System.out.println();
//		for (String a : s5) 
//			System.out.print(a + " ");
		System.out.println(Arrays.toString(s1));
		System.out.println(Arrays.toString(s2));
		System.out.println(Arrays.toString(s3));
		System.out.println(Arrays.toString(s4));
		System.out.println(Arrays.toString(s5));
	}
}

//import java.util.Arrays;
//
//class Solution{
//    public String[] solution(String[] s, int n) {
//    	
//    	String[] s1 = Arrays.copyOf(s, s.length);
//    	int[] a = new int[s.length];
//        Arrays.fill(a, 0);
//        
//        for (int i = 0 ; i < s.length ; i++) {
//        	for (int j = 0 ; j < s.length ;j++) {
//        		if (s[i].substring(n, n+1).compareTo(s[j].substring(n, n+1)) > 0)
//        			a[i]++;
//        		System.out.print(s[i].substring(n, n+1) + " vs " + s[j].substring(n, n+1));
//        		System.out.print("\ta[" + i + "]=" + a[i] + ", \n");
//        		
//        		
//        		if (s[i].substring(n, n+1).compareTo(s[j].substring(n, n+1)) == 0) {
//        			if (s[i].compareTo(s[j]) == -1)
//        				a[i]++;
//        		
//        			
//        		}//if
//        	}//for
//        }//for
//        
//        for (int i = 0 ; i < s.length ; i++) {
//        	System.out.print(a[i] + ", ");
//        	s[i] = s1[a[i]];
//        }
//        
//        
//        return s;
//    }
//
//}


/*
import java.util.Arrays;

class Solution{
    public String[] solution(String[] s, int n) {
    	
    	String[] answer = Arrays.copyOf(s, s.length);
    	int[] a = new int[s.length];
        Arrays.fill(a, 0);
        
        for (int i = 0 ; i < s.length ; i++) {
        	for (int j = 0 ; j < s.length ;j++) {
        		String si = s[i].substring(n, s[i].length());
        		String sj = s[j].substring(n, s[j].length());
        		String soi = s[i].substring(0, n);
        		String soj = s[j].substring(0, n);
                
        		if (si.compareTo(sj) > 0)
        			a[i]++;
        		else if (si.compareTo(sj) == 0) {
        			if(soi.compareTo(soj) > 0)
        				a[i]++;
        		}//else if
        	}//for
        }//for
        for (int i = 0 ; i < s.length ; i++)
        	s[a[i]] = answer[i];
        
        return s;
    }//method
}//class
*/