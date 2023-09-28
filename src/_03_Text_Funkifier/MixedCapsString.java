package _03_Text_Funkifier;

public class MixedCapsString implements TextFunkifier{

    private String unfunkifiedText;

    public MixedCapsString(String unfunkifiedText) {

        this.unfunkifiedText = unfunkifiedText;

    }

	public String funkifyText() {
		char[] chars = unfunkifiedText.toCharArray();
		for (int i = 0;i<chars.length; i++) {
			if (i%2==0) {
				chars[i] = Character.toLowerCase(chars[i]);
			}
			else {
				chars[i] = Character.toUpperCase(chars[i]);
			}
		}
		String total ="";
		for (int i = 0;i<chars.length; i++) {
			total = total+chars[i];
		}
		return total;
	}

}
