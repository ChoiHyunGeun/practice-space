package programers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class codingTest {
	public static void main(String[] args) {
		String[] id_list = {"muzi", "frodo", "apeach", "neo"};
		String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
		int k = 2;
		
		solution(id_list, report, k);
	}
	
	static public int[] solution( String[] id_list, String[] report, int k ) {
		
		//1. �ߺ� ������ ����
		List<String> list = Arrays.stream(report).distinct().collect(Collectors.toList());
		
		//2. �Ű��� ���� ī���� �� ��
		HashMap<String, Integer> count = new HashMap<String, Integer>();
		
		//3. List�� �ִ� ��ҵ� �����ͼ� �Ű� ���� ���� counting
		for( String s : list ) {
			//�Ű� ���� ���
			String target = s.split(" ")[1];
			
			//Count Map�� �Ű���� ����ڰ� ������ �� +1�� ���ְ� ������ 0���� �� ����
			count.put( target, count.getOrDefault(target, 0) + 1 );
		}
		
		return Arrays.stream(id_list).map(_user -> {
			//id_list�� ���������� ���鼭 ����ڰ� �Ű��� count List�� �־���
			List<String> reportList = list.stream().filter( s -> s.startsWith(_user)).collect(Collectors.toList());
			
			return reportList.stream().filter( s -> count.get(s.split(" ")[1]) >= k ).count();
		}).mapToInt(Long::intValue).toArray();
	}
	
}
