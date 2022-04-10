package programers;

import java.util.*;

public class CodingTest10 {

	public static void main(String[] args) {
		// programmers 프린터
		int[] priorities = {1, 1, 9, 1, 1, 1};
		int location = 0;
		
		CodingTest10 a = new CodingTest10();
		
		int result = a.solution(priorities, location);
		
		System.out.println(result);
	}
	
	public int solution(int[] priorities, int location) {
		//최종 결과
		int result = 0;
		
		//문서
		Queue<Integer> seq_list = new LinkedList<Integer>();
		
		//문서 중요도 리스트
		Queue<Integer> list = new LinkedList<Integer>();
		
		//중요도 순서 높은 순
		PriorityQueue<Integer> order = new PriorityQueue<>(Collections.reverseOrder());
		
		//사용자가 요청한 문서의 위치
		int req_num = -1;
		
		for( int i = 0 ; i < priorities.length ; i++ ) {
			
			//사용자가 요청한 문서의 위치가 같을 때 그 값 갖고있기
			if( i == location ) {
				req_num = i;
			}
			
			list.add(priorities[i]);		
			order.add(priorities[i]);
			seq_list.add(i);
			
		}
		
		//요청한 문서 > 문서의 중요도가 가장 높은 중요도가 아니면 list에 있는 값 제일 뒤로 보내기
		for( ;; ) {
			
			int list_elem = list.peek();			//문서 중요도
			int order_elem = order.peek();			//가장 높은 중요도
			int seq_list_elem = seq_list.peek();	//문서
			
			//여기 들어오는 순간 인쇄되는거임
			if( list_elem == order_elem ) {
				
				result++;
				//System.out.println(result);
				
				if( seq_list_elem == req_num ) {
					break;
				} else {
					list.remove();
					order.remove();
					seq_list.remove();
				}
			} else {
				//첫번째 있는 값 맨뒤에 추가 후 맨 앞에 값 삭제하기
				list.add(list_elem);
				seq_list.add(seq_list_elem);
				
				list.remove();
				seq_list.remove();
			}
		}
		return result;
	}
}
