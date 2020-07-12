package caesar_cipher;
//���α׷��ӽ� �ڵ��׽�Ʈ ���� level 1 ������ȣ
class Solution {
	public String solution(String s, int n) {
		char c;
		String atoz = ("abcdefghijklmnopqrstuvwxyz");//index �� ��� ���� a ~ z
		StringBuffer sb = new StringBuffer();
		
		for (int i = 0; i < s.length(); i++) {
			c = s.charAt(i);//s�� �ѱ��ھ� ����
			int index = atoz.indexOf(Character.toLowerCase(c) + "");//c�� a~z���� �ε�����

			if (c == ' ')
				sb.append(c);//������ ��� �ٷ� �߰�
				if (Character.isLowerCase(c))//�ҹ����ϰ��
					sb.append(atoz.charAt((index + n) % 26));//�߰� 
				else//�빮���� ���
					sb.append(Character.toUpperCase(atoz.charAt((index + n) % 26)));//�빮�ڷ� ��ȯ �� �߰�
				
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
