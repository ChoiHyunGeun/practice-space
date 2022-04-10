package programers;

import java.util.HashMap;

public class CodingTest8 {

	String result = "";
	
	public static void main(String[] args) {
		CodingTest8 a = new CodingTest8();
		
		//programmers 키패드 누르기
		int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
		String hand = "right";
		
		a.solution(numbers, hand);
	}
	
	public String solution(int[] num, String hand) {
		
		HashMap<String, Integer> whichHand_col = new HashMap<String, Integer>();
		HashMap<String, Integer> whichHand_row = new HashMap<String, Integer>();
		
		//처음에 오른손은 4번째 행에 1번째 열, 왼손은 4번째 행에 3번째 열에 손을 두고있으니 각각 합한 값으로 셋팅
		whichHand_col.put("right", 1);
		whichHand_row.put("right", 4);
		
		whichHand_col.put("left", 3);
		whichHand_row.put("left", 4);
		
		int right_col_result;
		int right_row_result;
		
		int left_col_result;
		int left_row_result;
		
		for( int i = 0 ; i < num.length ; i++ ) {
			switch(num[i]) {
				case 0:
					//숫자 0의 자리수 col = 2, row = 4 
					right_col_result = Math.abs(whichHand_col.get("right") - 2);
					right_row_result = Math.abs(whichHand_row.get("right") - 4);
					
					left_col_result = Math.abs(whichHand_col.get("left") - 2);
					left_row_result = Math.abs(whichHand_row.get("left") - 4);
					
					if( (right_col_result + right_row_result) > (left_col_result + left_row_result) ) {
						whichHand_col.put("left", 2);
						whichHand_row.put("left", 4);
						result += "L";
					} else if( (right_col_result + right_row_result) < (left_col_result + left_row_result) ) {
						whichHand_col.put("right", 2);
						whichHand_row.put("right", 4);
						result += "R";
					} else {
						if( hand.equals("right") ) {
							whichHand_col.put("right", 2);
							whichHand_row.put("right", 4);
							result += "R";
						} else {
							whichHand_col.put("left", 2);
							whichHand_row.put("left", 4);
							result += "L";
						}
					}
					break;
				case 1:
					result+="L";
					whichHand_col.put("left", 1);
					whichHand_row.put("left", 1);
					break;
				case 2:
					//숫자 2의 자리수 col = 2, row = 1 
					right_col_result = Math.abs(whichHand_col.get("right") - 2);
					right_row_result = Math.abs(whichHand_row.get("right") - 1);
					
					left_col_result = Math.abs(whichHand_col.get("left") - 2);
					left_row_result = Math.abs(whichHand_row.get("left") - 1);
					
					if( (right_col_result + right_row_result) > (left_col_result + left_row_result) ) {
						whichHand_col.put("left", 2);
						whichHand_row.put("left", 1);
						result += "L";
					} else if( (right_col_result + right_row_result) < (left_col_result + left_row_result) ) {
						whichHand_col.put("right", 2);
						whichHand_row.put("right", 1);
						result += "R";
					} else {
						if( hand.equals("right") ) {
							whichHand_col.put("right", 2);
							whichHand_row.put("right", 1);
							result += "R";
						} else {
							whichHand_col.put("left", 2);
							whichHand_row.put("left", 1);
							result += "L";
						}
					}
					break;
				case 3:
					result+="R";
					whichHand_col.put("right", 3);
					whichHand_row.put("right", 1);
					break;
				case 4:
					result+="L";
					whichHand_col.put("left", 1);
					whichHand_row.put("left", 2);
					break;
				case 5:
					//숫자 5의 자리수 col = 2, row = 2 
					right_col_result = Math.abs(whichHand_col.get("right") - 2);
					right_row_result = Math.abs(whichHand_row.get("right") - 2);
					
					left_col_result = Math.abs(whichHand_col.get("left") - 2);
					left_row_result = Math.abs(whichHand_row.get("left") - 2);
					
					if( (right_col_result + right_row_result) > (left_col_result + left_row_result) ) {
						whichHand_col.put("left", 2);
						whichHand_row.put("left", 2);
						result += "L";
					} else if( (right_col_result + right_row_result) < (left_col_result + left_row_result) ) {
						whichHand_col.put("right", 2);
						whichHand_row.put("right", 2);
						result += "R";
					} else {
						if( hand.equals("right") ) {
							whichHand_col.put("right", 2);
							whichHand_row.put("right", 2);
							result += "R";
						} else {
							whichHand_col.put("left", 2);
							whichHand_row.put("left", 2);
							result += "L";
						}
					}
					break;
				case 6:
					result+="R";
					whichHand_col.put("right", 3);
					whichHand_row.put("right", 2);
					break;
				case 7:
					result+="L";
					whichHand_col.put("left", 1);
					whichHand_row.put("left", 3);
					break;
				case 8:
					//숫자 5의 자리수 col = 2, row = 3 
					right_col_result = Math.abs(whichHand_col.get("right") - 2);
					right_row_result = Math.abs(whichHand_row.get("right") - 3);
					
					left_col_result = Math.abs(whichHand_col.get("left") - 2);
					left_row_result = Math.abs(whichHand_row.get("left") - 3);
					
					if( (right_col_result + right_row_result) > (left_col_result + left_row_result) ) {
						whichHand_col.put("left", 2);
						whichHand_row.put("left", 3);
						result += "L";
					} else if( (right_col_result + right_row_result) < (left_col_result + left_row_result) ) {
						whichHand_col.put("right", 2);
						whichHand_row.put("right", 3);
						result += "R";
					} else {
						if( hand.equals("right") ) {
							whichHand_col.put("right", 2);
							whichHand_row.put("right", 3);
							result += "R";
						} else {
							whichHand_col.put("left", 2);
							whichHand_row.put("left", 3);
							result += "L";
						}
					}
					break;
				case 9:
					result+="R";
					whichHand_col.put("right", 3);
					whichHand_row.put("right", 3);
					break;
			}
		}
		System.out.println(result);
		return result;
	}
}
