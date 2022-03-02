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
		
		//1. 중복 데이터 제거
		List<String> list = Arrays.stream(report).distinct().collect(Collectors.toList());
		
		//2. 신고한 유저 카운팅 할 맵
		HashMap<String, Integer> count = new HashMap<String, Integer>();
		
		//3. List에 있는 요소들 가져와서 신고 당한 유저 counting
		for( String s : list ) {
			//신고 당한 사람
			String target = s.split(" ")[1];
			
			//Count Map에 신고당한 사용자가 있으면 값 +1을 해주고 없으면 0으로 값 셋팅
			count.put( target, count.getOrDefault(target, 0) + 1 );
		}
		
		return Arrays.stream(id_list).map(_user -> {
			//id_list를 순차적으로 돌면서 사용자가 신고한 count List에 넣어줌
			List<String> reportList = list.stream().filter( s -> s.startsWith(_user)).collect(Collectors.toList());
			
			return reportList.stream().filter( s -> count.get(s.split(" ")[1]) >= k ).count();
		}).mapToInt(Long::intValue).toArray();
	}
	
}
