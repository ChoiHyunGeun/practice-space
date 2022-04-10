package programers;

public class CodingTest3 {

	public static void main(String[] args) {
		//programmers �ζ� �ְ� ������ ���� ���� ���ϱ�
		int[] lottos = {0, 0, 0, 0, 0, 0};
		int[] win_nums = {38, 19, 20, 40, 15, 25};
		
		CodingTest3 test = new CodingTest3();
		
		test.solution( lottos, win_nums );
	}
	
	public int[] solution( int[] lottos, int[] win_nums) {
		//return ��ų int �迭
		int[] result = new int[2];
		
		// ���� ��ȣ ���� count����
		int cnt = 0;
		
		//lottos �ȿ� �ִ� 0�� ����
		int zero_cnt = 0;
		
		for( int i = 0 ; i < lottos.length ; i++ ) {
			//lottos�� �ִ� ��ȣ ��������
			int num_in_lottos = lottos[i];
			
			//0�� ���� ���ϱ�
			if( num_in_lottos == 0 ) {
				zero_cnt++;
			}
			
			for( int j = 0 ; j < win_nums.length ; j++ ) {
				//win_nums�� �ִ� ��ȣ ��������
				int num_in_win_nums = win_nums[j];
				
				//System.out.println(num_in_lottos + "    " + num_in_win_nums);
				
				//���� ���ڰ� ������ cnt++
				if( num_in_lottos == num_in_win_nums ) {
					cnt++;
					break;
				}
			}
		}
		
		//�̶��� cnt���� ���� ������ ���� ����
		int min = cnt;
		
		//lottos�� �ִ� 0�� ������ŭ ���� ������ �ְ� ������ ���� ����
		int max = cnt + zero_cnt;
		
		//���� �� ����
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
