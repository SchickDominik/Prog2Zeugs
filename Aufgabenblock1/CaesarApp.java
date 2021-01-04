public class CaesarApp {

	public static void main(String[] args) {
        int key = Integer.parseInt(args[0]);
        String action = args[1];
        String input = args[2];
        String output = "";
        char[] text = new char[input.length()];
        for (int i = 0; i < input.length(); i++) {
        	text[i] = input.charAt(i);
        }
        
        switch (action.toLowerCase()) {
        case "encrypt":
        	output = encrypt(text, key);
        	break;
        case "decrypt":
        	output = decrypt(text, key);
        	break;
        default:
        	System.out.println("Bitte korrekte Auswahl treffen.");
        	break;
        }
        System.out.println(input);
        System.out.println(output);

	}
	
	//Idee: Wir übersetzen den einzelnen char in einen int (= Ascii), verrechnen ihn mit dem key und übersetzen anschließend von int zurück nach char
	// c = character aus Input
	// x = Integer-Wert des Charakters.
	static String encrypt(char[] text, int key) {
		String encrypted = "";
		for (char c : text) {
			int x = (int) c;
			if (x >= 97 && x <= 122) { //97 = 'a', 122 = 'z'
				if (key + x > 122) { //überlauf verhindern
					x = 96 + (key + x - 122);
				}
				else {
					x = key + x;
				}
			}
			encrypted += (char) x;
		}
		return encrypted;
	}
	static String decrypt(char[] text, int key) {
		String decrypted = "";
		for (char c : text) {
			int x = (int) c;
			if (x >= 97 && x <= 122) {
				if (x - key < 97) { 
					x = 123 - (97 - x + key);
				}
				else {
					x = x - key;
				}
			} 
			decrypted += (char) x;
		}
		return decrypted;
	}
}