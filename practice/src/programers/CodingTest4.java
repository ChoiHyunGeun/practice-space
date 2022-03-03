package programers;

public class CodingTest4 {

	public static void main(String[] args) {
		//programmers �ű� ���̵� ��õ
		
		solution("...!@BaT#*..y.abcdefghijklm");
	}
	
	static public String solution( String user_id ) {
		String temp = "";
		
		// 1. new_id�� ��� �빮�ڸ� �����Ǵ� �ҹ��ڷ� ġȯ�մϴ�.
		temp = user_id.toLowerCase();
		
		// 2. new_id���� ���ĺ� �ҹ���, ����, ����(-), ����(_), ��ħǥ(.)�� ������ ��� ���ڸ� �����մϴ�.
		temp = temp.replaceAll("[^-_.a-z0-9]","");
		
		// 3. new_id���� ��ħǥ(.)�� 2�� �̻� ���ӵ� �κ��� �ϳ��� ��ħǥ(.)�� ġȯ�մϴ�.
		temp = temp.replaceAll("[.]{2,}", ".");
		
		// 4. new_id���� ��ħǥ(.)�� ó���̳� ���� ��ġ�Ѵٸ� �����մϴ�.
		temp = temp.replaceAll("^[.]|[.]$", "");
		
		// 5. new_id�� �� ���ڿ��̶��, new_id�� "a"�� �����մϴ�.
	    if( temp.length() == 0 ) temp += "a";
	    
		// 6. new_id�� ���̰� 16�� �̻��̸�, new_id�� ù 15���� ���ڸ� ������ ������ ���ڵ��� ��� �����մϴ�.
   	  	//	  ���� ���� �� ��ħǥ(.)�� new_id�� ���� ��ġ�Ѵٸ� ���� ��ġ�� ��ħǥ(.) ���ڸ� �����մϴ�.
		if( temp.length() >= 16 ) {
			temp = temp.substring(0, 15);
			temp = temp.replaceAll("^[.]|[.]$", "");
		}
		
		// 7. new_id�� ���̰� 2�� ���϶��, new_id�� ������ ���ڸ� new_id�� ���̰� 3�� �� ������ �ݺ��ؼ� ���� ���Դϴ�.
		if(  temp.length() != 0 && temp.length() <= 2 ) {
			char spl_str = temp.charAt( temp.length() - 1 );
			
			while( temp.length() < 3 ) {
				temp = temp += spl_str;
			}
		}
		
		return temp;
	}
	
}
