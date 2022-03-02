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
		
		//최종 리턴시킬 배열
		int[] result = new int[id_list.length];
		
		// 1. 중복 데이터 제거
		List<String> userList = Arrays.stream(report).distinct().collect(Collectors.toList());
		
		// 2. 신고 당한 사용자 counting 할 맵
		HashMap<String, Integer> reportedUserCount = new HashMap<String, Integer>();
		
		for( String s : userList ) {
			//신고 당한 사용자
			String reportedUser = s.split(" ")[1];
			
			//신고 당한 사용자 counting. Map에 이미 정보가 있으면 count +1, 없으면 0으로 값 셋팅
			reportedUserCount.put(reportedUser, reportedUserCount.getOrDefault(reportedUser, 0) + 1);
		}
		
		
		
		//사용자 별로 신고 count 가져오기
		for( int i = 0 ; i < id_list.length ; i++ ) {
			String user = id_list[i];
			int idx = 0;
			
			//신고한 사용자를 찾아야함
			for( String s : report ) {
				String user_in_report = s.split(" ")[0];
				
				//사용자 아이디가 신고 정보 배열에 있는 신고자 아이디와 일치하는지 체크
				if( user.equals(user_in_report) ) {
					
					//신고 당한 사용자
					String reported_user = s.split(" ")[1];
					
					//신고당한 횟수
					int userCount = reportedUserCount.getOrDefault(reported_user, 0);
					
					//신고한 사용자에게 연락한 횟수 셋팅
					if( userCount >= k ) {
						result[i] = ++idx;
					}
				}
			}
		}
		
		return result;
	}
}
