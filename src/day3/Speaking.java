package day3;

public class Speaking {
	public static void main(String[] args) {
		for (int i = 0; i < 1; i++) {			
		speak("Its ya boi");
		}
		
	}
	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}}
}

	


