package kimseobang;
/*
String�� �迭 seoul�� element�� Kim�� ��ġ x�� ã��, 
�輭���� x�� �ִٴ� String�� ��ȯ�ϴ� �Լ�, solution�� �ϼ��ϼ���.
seoul�� Kim�� ���� �� ���� ��Ÿ���� �߸��� ���� �ԷµǴ� ���� �����ϴ�.

���� ����
seoul�� ���� 1 �̻�, 1000 ������ �迭�Դϴ�.
seoul�� ���Ҵ� ���� 1 �̻�, 20 ������ ���ڿ��Դϴ�.
Kim�� �ݵ�� seoul �ȿ� ���ԵǾ� �ֽ��ϴ�.
 */
import java.util.ArrayList;

class Solution {
	public String solution(String[] seoul) {
		ArrayList<String> al = new ArrayList<String>();
		for (String str : seoul)
			al.add(str);
		int index = al.indexOf("Kim");
		return "�輭���� " + index + "�� �ִ�";
	}
}

public class Kimseobang {
	
	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.solution(new String[] { "Jane", "Kim" }));// �輭���� 1�� �ִ�.
		System.out.println(s.solution(new String[] { "Jane", "Lee", "Kim" }));// �輭���� 2�� �ִ�.
		System.out.println(s.solution(new String[] { "Kim", "Lee", "Jane" }));// �輭���� 0�� �ִ�.
	}

}
