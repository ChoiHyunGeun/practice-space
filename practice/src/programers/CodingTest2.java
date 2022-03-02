package programers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class CodingTest2 {

	public static void main(String[] args) {
		String[] id_list = {"muzi", "frodo", "apeach", "neo"};
		String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
		int k = 2;
		
		solution(id_list, report, k);
	}
	
	static public int[] solution(String[] id_list, String[] report, int k) {
		
		//���� ���Ͻ�ų �迭
		int[] result = new int[id_list.length];
		
		// 1. �ߺ� ������ ����
		List<String> userList = Arrays.stream(report).distinct().collect(Collectors.toList());
		
		// 2. �Ű� ���� ����� counting �� ��
		HashMap<String, Integer> reportedUserCount = new HashMap<String, Integer>();
		
		for( String s : userList ) {
			//�Ű� ���� �����
			String reportedUser = s.split(" ")[1];
			
			//�Ű� ���� ����� counting. Map�� �̹� ������ ������ count +1, ������ 0���� �� ����
			reportedUserCount.put(reportedUser, reportedUserCount.getOrDefault(reportedUser, 0) + 1);
		}
		
		
		
		//����� ���� �Ű� count ��������
		for( int i = 0 ; i < id_list.length ; i++ ) {
			String user = id_list[i];
			int idx = 0;
			
			//�Ű��� ����ڸ� ã�ƾ���
			for( String s : report ) {
				String user_in_report = s.split(" ")[0];
				
				//����� ���̵� �Ű� ���� �迭�� �ִ� �Ű��� ���̵�� ��ġ�ϴ��� üũ
				if( user.equals(user_in_report) ) {
					
					//�Ű� ���� �����
					String reported_user = s.split(" ")[1];
					
					//�Ű���� Ƚ��
					int userCount = reportedUserCount.getOrDefault(reported_user, 0);
					
					//�Ű��� ����ڿ��� ������ Ƚ�� ����
					if( userCount >= k ) {
						result[i] = ++idx;
					}
				}
			}
		}
		
		return result;
	}
}
