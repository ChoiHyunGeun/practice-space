package programers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CodingTest7 {

	public static void main(String[] args) {
		CodingTest7 a = new CodingTest7();
		//programmers 완주하지 못한 선수 구하기
		//replaceAll 말고 replace 사용하기 > 동명이인이 있을 수 있기 때문에
		String[] participant = {"leo", "kiki", "eden"};
		String[] completion = {"eden", "kiki"};
		
		a.solution(participant, completion);
	}

	public String solution(String[] participants, String[] completions) {
		Arrays.sort(participants);
		Arrays.sort(completions);
		
		int i = 0;
		
		for( i = 0 ; i < completions.length ; i++ ) {
			if( !completions[i].equals(participants[i]) ) {
				break;
			}
		}
		return participants[i];
	}
}
