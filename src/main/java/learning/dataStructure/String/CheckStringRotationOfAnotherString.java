package learning.dataStructure.String;

public class CheckStringRotationOfAnotherString {

	//Check One String is Rotation of Another
	public static boolean rotation1(String s1,String s2) {
		
		s1=s1+s1;
		if(s1.indexOf(s2)!=-1) {
			return true;
		}
		
		return false;
	}
	
	public static void main(String[] args) {
//			String str1 = "AACD";
//	        String str2 = "ACDA";
		
		String str1 = "FGABCDE";
        String str2 = "ABCDEFG";
	        
	        System.out.println(rotation1(str1, str2));
	}

}
