package coreJavaTraining;

public class Sample1 {

	public static void main(String[] args) {
		String FirstName = "Jithin";
		
		char[] ch = new char[FirstName.length()];
		
		
		for(int i = 0; i< FirstName.length(); i++) {
			ch[i]=FirstName.charAt(i);
		}
		
		for(char c : ch) {
			System.out.println(c);
			
		}
		
	}

}
