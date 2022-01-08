package practiseProblems;

public class Anagrams {

	public static void main(String[] args) {
		
		String str1 = "hello";
		String str2 = "Hello";
		
		System.out.println(isAnagrams(str1, str2));

	}
	
	public static boolean isAnagrams(String str1, String str2) {
		
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		
		int[] charFrequencies = new int[26];
		
		for (int i = 0; i < str1.length(); i++) {
			char currentChar = str1.charAt(i);
			int index = currentChar - 'a';
			charFrequencies[index]++;
		}
		
		for (int i = 0; i < str2.length(); i++) {
			char currentChar = str2.charAt(i);
			int index = currentChar - 'a';
			charFrequencies[index]--;
		}
		
		for (int i = 0; i < 26; i++) {
			if (charFrequencies[i] != 0) {
				return false;
			}
		}
		
		return true;
	}

}
