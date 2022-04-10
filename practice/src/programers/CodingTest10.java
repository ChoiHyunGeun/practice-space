package programers;

import java.util.*;

public class CodingTest10 {

	public static void main(String[] args) {
		// programmers ������
		int[] priorities = {1, 1, 9, 1, 1, 1};
		int location = 0;
		
		CodingTest10 a = new CodingTest10();
		
		int result = a.solution(priorities, location);
		
		System.out.println(result);
	}
	
	public int solution(int[] priorities, int location) {
		//���� ���
		int result = 0;
		
		//����
		Queue<Integer> seq_list = new LinkedList<Integer>();
		
		//���� �߿䵵 ����Ʈ
		Queue<Integer> list = new LinkedList<Integer>();
		
		//�߿䵵 ���� ���� ��
		PriorityQueue<Integer> order = new PriorityQueue<>(Collections.reverseOrder());
		
		//����ڰ� ��û�� ������ ��ġ
		int req_num = -1;
		
		for( int i = 0 ; i < priorities.length ; i++ ) {
			
			//����ڰ� ��û�� ������ ��ġ�� ���� �� �� �� �����ֱ�
			if( i == location ) {
				req_num = i;
			}
			
			list.add(priorities[i]);		
			order.add(priorities[i]);
			seq_list.add(i);
			
		}
		
		//��û�� ���� > ������ �߿䵵�� ���� ���� �߿䵵�� �ƴϸ� list�� �ִ� �� ���� �ڷ� ������
		for( ;; ) {
			
			int list_elem = list.peek();			//���� �߿䵵
			int order_elem = order.peek();			//���� ���� �߿䵵
			int seq_list_elem = seq_list.peek();	//����
			
			//���� ������ ���� �μ�Ǵ°���
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
				//ù��° �ִ� �� �ǵڿ� �߰� �� �� �տ� �� �����ϱ�
				list.add(list_elem);
				seq_list.add(seq_list_elem);
				
				list.remove();
				seq_list.remove();
			}
		}
		return result;
	}
}
