package py_size;
/*
 �빮�ڿ� �ҹ��ڰ� �����ִ� ���ڿ� s�� �־����ϴ�. s�� 'p'�� ������ 'y'�� ������ ���� ������ True, �ٸ��� False�� return �ϴ� solution�� �ϼ��ϼ���. 'p', 'y' ��� �ϳ��� ���� ���� �׻� True�� �����մϴ�. ��, ������ ���� �� �빮�ڿ� �ҹ��ڴ� �������� �ʽ��ϴ�.

���� ��� s�� pPoooyY�� true�� return�ϰ� Pyy��� false�� return�մϴ�.

���ѻ���
���ڿ� s�� ���� : 50 ������ �ڿ���
���ڿ� s�� ���ĺ����θ� �̷���� �ֽ��ϴ�.
 */
class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int pCount=0;
        int yCount=0;
        
        s = s.toLowerCase();
        for (int i = 0 ; i < s.length() ; i++){
            if (s.charAt(i) == 'p' )
                pCount++;
            if (s.charAt(i) == 'y')
                yCount++;
        }
        if (pCount == yCount)
            answer = true;
        else
            answer = false;

        return answer;
    }
}
public class PYsize {
	public static void main(String[] args) {
		Solution s = new Solution();
		boolean b1 = s.solution("pPoooyY");
		boolean b2 = s.solution("Pyy");
		System.out.println(b1);
		System.out.println(b2);
	}
}
