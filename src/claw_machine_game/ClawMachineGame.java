/*
 * ���� ȭ���� ������ ���°� ��� 2���� �迭 board�� ������ ���� ���� ũ������ �۵���Ų ��ġ�� ��� �迭 moves�� �Ű������� �־��� ��, 
 * ũ������ ��� �۵���Ų �� ��Ʈ���� ����� ������ ������ return �ϵ��� solution �Լ��� �ϼ����ּ���.

[���ѻ���]
board �迭�� 2���� �迭�� ũ��� 5 x 5 �̻� 30 x 30 �����Դϴ�.
board�� �� ĭ���� 0 �̻� 100 ������ ������ ����ֽ��ϴ�.
0�� �� ĭ�� ��Ÿ���ϴ�.
1 ~ 100�� �� ���ڴ� ���� �ٸ� ������ ����� �ǹ��ϸ� ���� ���ڴ� ���� ����� ������ ��Ÿ���ϴ�.
moves �迭�� ũ��� 1 �̻� 1,000 �����Դϴ�.
moves �迭 �� ���ҵ��� ���� 1 �̻��̸� board �迭�� ���� ũ�� ������ �ڿ����Դϴ�.
����� ��
				board			
[[0,0,0,0,0],[0,0,1,0,3],[0,2,5,0,1],[4,2,4,4,2],[3,5,1,3,1]]	

moves
[1,5,3,5,1,2,1,4]	

result
4
 */



package claw_machine_game;

class Solution{
	public int solution(int[][] b, int[] m) {
        int answer = 0; // ���Ͽ� ����
        int[] bas = new int[b.length * b.length]; // 5*5 ~ 30*30
        
        for (int i = 0 ; i < m.length ; i++) { // i : ���� ���� �� ������ m[i] �� �����ִ� ��
        	for (int j = 0 ; j < b.length ; j++) { // j : ��, ������ �̴� ������ �ప�� �ö󰡸鼭 ǥ���ȴ�.
        		if (b[j][(m[i])-1] != 0) { // �ش� ��� ���� ������ �ִٸ� 0�� �ƴҰ��̴�.
        			for (int l = 0 ; l < bas.length ; l++) { // ������ �ִٸ� for ���� ���� basket�� ���ڸ��� ã�� �װ��� ����
        				if (bas[l]==0) {
        					bas[l] = b[j][(m[i])-1];
        					break;// ������ ���´�.
        				}
        			}
        			b[j][(m[i])-1] = 0; // ������ �̾����� ������ �ִ����� ���ڸ�.
        			
        			
        			for (int k = 0 ; k < (b.length * b.length)-1 ; k++) {//basket�� ������ ��� ������ ������ŭ ũ�ٰ� �ߴ�.
            			if ((bas[k] == bas[k+1]) && bas[k] > 0 && bas [k+1] > 0) {//basket�� ��ġ�ϴ� ������ �ִ°��
            				if (k+4 < b.length * b.length) {// �迭�� ���� Ż���ϴ� ������ ���� ���� ��ġ
            				bas[k] = bas[k+2];
            				bas[k+1] = bas[k+3];
            				answer+=2;
            				}else { // K+4�� ���� Ż���ߴٸ� ���� ��ܿ� �ʿ� ���� 0�� �ָ��.
            					bas[k] = 0;
                				bas[k+1] = 0;
                				answer+=2;
            				}//else
            			}//if
        			}//for
        			break;
        		}//if
        	}//for j
        }// for i
        return answer;
	}//method
}//class


public class ClawMachineGame {
	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.solution(new int[][] {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}}, 
				new int[]{1,5,3,5,1,2,1,4}));
	}
}
