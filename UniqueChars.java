/** String processing exercise 2. */
public class uniquechars {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(uniqueChars(str));
    }

    /**
     * Returns a string which is identical to the original string, 
     * except that all the duplicate characters are removed,
     * unless they are space characters.
     */
	 
public static String uniqueChars(String str) {
        String fin = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			boolean duplicate = false;
			for (int j = 0; j < fin.length(); j++) {
				if (fin.charAt(j) == ch) {
					duplicate = true;
					break;
				}		
			}
			if (!duplicate || ch == ' ') {
				fin += ch;
			}
		}
		return fin;
	}
}
        