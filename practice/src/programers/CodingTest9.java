package programers;

public class CodingTest9 {
	
	//¼¯Àº È½¼ö
	int cnt = 0;
	
	public static void main(String[] args) {
		//programmers À½¾ç ´õÇÏ±â
		CodingTest9 a = new CodingTest9();
		
		int[] absolutes = {4,7,12};
		boolean[] signs = {true,false,true};
		
		a.solution(absolutes, signs);
	}
	
	public int solution(int[] absolutes, boolean[] signs) {
		int result = 0;
		
		for( int i = 0 ; i < absolutes.length ; i++ ) {
			boolean sign = signs[i];
			
			if( sign == true ) {
				result += absolutes[i];
			} else {
				result -= absolutes[i];
			}
		}
		
		return result;
	}
}
