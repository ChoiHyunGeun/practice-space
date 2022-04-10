package programers;

public class Number {
	
	String return_str = "";
	
	public Number stringToNumber(String str) {
		return_str = "";
		
		if( str.contains("zero") ) {
			if( return_str != null && !return_str.equals("") ) {
				return_str = return_str.replaceAll("zero", "0");
			} else {
				return_str = str.replaceAll("zero", "0");
			}
		}
		if( str.contains("one") ) {
			if( return_str != null && !return_str.equals("") ) {
				return_str = return_str.replaceAll("one", "1");
			} else {
				return_str = str.replaceAll("one", "1");
			}
		}
		if( str.contains("two") ) {
			if( return_str != null && !return_str.equals("") ) {
				return_str = return_str.replaceAll("two", "2");
			} else {
				return_str = str.replaceAll("two", "2");
			}
		}
		if( str.contains("three") ) {
			if( return_str != null && !return_str.equals("") ) {
				return_str = return_str.replaceAll("three", "3");
			} else {
				return_str = str.replaceAll("three", "3");
			}
		}
		if( str.contains("four") ) {
			if( return_str != null && !return_str.equals("") ) {
				return_str = return_str.replaceAll("four", "4");
			} else {
				return_str = str.replaceAll("four", "4");
			}
		}
		if( str.contains("five") ) {
			if( return_str != null && !return_str.equals("") ) {
				return_str = return_str.replaceAll("five", "5");
			} else {
				return_str = str.replaceAll("five", "5");
			}
		}
		if( str.contains("six") ) {
			if( return_str != null && !return_str.equals("") ) {
				return_str = return_str.replaceAll("six", "6");
			} else {
				return_str = str.replaceAll("six", "6");
			}
		}
		if( str.contains("seven") ) {
			if( return_str != null && !return_str.equals("") ) {
				return_str = return_str.replaceAll("seven", "7");
			} else {
				return_str = str.replaceAll("seven", "7");
			}
		}
		if( str.contains("eight") ) {
			if( return_str != null && !return_str.equals("") ) {
				return_str = return_str.replaceAll("eight", "8");
			} else {
				return_str = str.replaceAll("eight", "8");
			}
		}
		if( str.contains("nine") ) {
			if( return_str != null && !return_str.equals("") ) {
				return_str = return_str.replaceAll("nine", "9");
			} else {
				return_str = str.replaceAll("nine", "9");
			}
		}
		
		return this;
	}
}
