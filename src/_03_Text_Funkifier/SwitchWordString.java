package _03_Text_Funkifier;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SwitchWordString implements TextFunkifier{
	private String unfunkifiedText;

    public SwitchWordString(String unfunkifiedText) {

        this.unfunkifiedText = unfunkifiedText;

    }

	public String funkifyText() {
		char[] chars = unfunkifiedText.toCharArray();
		char[] total = new char[10];
		ArrayList<Integer> ints = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			ints.add(i);
		}
		Collections.shuffle(ints);
		for(int i = 0; i < chars.length; i++) {
			total[i] = chars[ints.get(i)];
		}
		String total2 ="";
		for (int i = 0;i<chars.length; i++) {
			total2 = total2+chars[i];
		}
		return total2;
	}

}

