package programers;

public class CodingTest3 {

	public static void main(String[] args) {
		//programmers 로또 최고 순위와 최저 순위 구하기
		int[] lottos = {0, 0, 0, 0, 0, 0};
		int[] win_nums = {38, 19, 20, 40, 15, 25};
		
		CodingTest3 test = new CodingTest3();
		
		test.solution( lottos, win_nums );
	}
	
	public int[] solution( int[] lottos, int[] win_nums) {
		//return 시킬 int 배열
		int[] result = new int[2];
		
		// 맞은 번호 개수 count변수
		int cnt = 0;
		
		//lottos 안에 있는 0의 개수
		int zero_cnt = 0;
		
		for( int i = 0 ; i < lottos.length ; i++ ) {
			//lottos에 있는 번호 가져오기
			int num_in_lottos = lottos[i];
			
			//0의 개수 구하기
			if( num_in_lottos == 0 ) {
				zero_cnt++;
			}
			
			for( int j = 0 ; j < win_nums.length ; j++ ) {
				//win_nums에 있는 번호 가져오기
				int num_in_win_nums = win_nums[j];
				
				//System.out.println(num_in_lottos + "    " + num_in_win_nums);
				
				//같은 숫자가 있으면 cnt++
				if( num_in_lottos == num_in_win_nums ) {
					cnt++;
					break;
				}
			}
		}
		
		//이때의 cnt값은 최저 순위일 때의 개수
		int min = cnt;
		
		//lottos에 있는 0의 개수만큼 더한 개수는 최고 순위일 때의 개수
		int max = cnt + zero_cnt;
		
		//최종 값 셋팅
		result[0] = getGrade(max);
		result[1] = getGrade(min);
		
		return result;
	}
	
	static public int getGrade( int minOrMax ) {
		switch( minOrMax ) {
			case 2:
				return 5;
			case 3:
				return 4;
			case 4:
				return 3;
			case 5:
				return 2;
			case 6:
				return 1;
			default :
				return 6;
		}
	}

}
