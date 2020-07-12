/*
 * 게임 화면의 격자의 상태가 담긴 2차원 배열 board와 인형을 집기 위해 크레인을 작동시킨 위치가 담긴 배열 moves가 매개변수로 주어질 때, 
 * 크레인을 모두 작동시킨 후 터트려져 사라진 인형의 개수를 return 하도록 solution 함수를 완성해주세요.

[제한사항]
board 배열은 2차원 배열로 크기는 5 x 5 이상 30 x 30 이하입니다.
board의 각 칸에는 0 이상 100 이하인 정수가 담겨있습니다.
0은 빈 칸을 나타냅니다.
1 ~ 100의 각 숫자는 각기 다른 인형의 모양을 의미하며 같은 숫자는 같은 모양의 인형을 나타냅니다.
moves 배열의 크기는 1 이상 1,000 이하입니다.
moves 배열 각 원소들의 값은 1 이상이며 board 배열의 가로 크기 이하인 자연수입니다.
입출력 예
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
        int answer = 0; // 리턴용 변수
        int[] bas = new int[b.length * b.length]; // 5*5 ~ 30*30
        
        for (int i = 0 ; i < m.length ; i++) { // i : 인형 뽑을 열 선택은 m[i] 가 갖고있는 값
        	for (int j = 0 ; j < b.length ; j++) { // j : 행, 인형을 뽑는 동작은 행값이 올라가면서 표현된다.
        		if (b[j][(m[i])-1] != 0) { // 해당 행과 열에 인형이 있다면 0이 아닐것이다.
        			for (int l = 0 ; l < bas.length ; l++) { // 인형이 있다면 for 문을 돌려 basket의 빈자리를 찾고 그곳에 쌓자
        				if (bas[l]==0) {
        					bas[l] = b[j][(m[i])-1];
        					break;// 쌓으면 나온다.
        				}
        			}
        			b[j][(m[i])-1] = 0; // 인형을 뽑았으니 인형이 있던곳은 빈자리.
        			
        			
        			for (int k = 0 ; k < (b.length * b.length)-1 ; k++) {//basket은 인형을 모두 담을수 있을만큼 크다고 했다.
            			if ((bas[k] == bas[k+1]) && bas[k] > 0 && bas [k+1] > 0) {//basket에 일치하는 인형이 있는경우
            				if (k+4 < b.length * b.length) {// 배열의 끝을 탈출하는 에러를 막기 위한 장치
            				bas[k] = bas[k+2];
            				bas[k+1] = bas[k+3];
            				answer+=2;
            				}else { // K+4가 끝을 탈출했다면 값을 당겨올 필요 없이 0만 주면됨.
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
