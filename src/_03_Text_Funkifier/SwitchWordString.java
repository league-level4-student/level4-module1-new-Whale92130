package _03_Text_Funkifier;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SwitchWordString implements TextFunkifier {
	private String unfunkifiedText;

	public SwitchWordString(String unfunkifiedText) {

		this.unfunkifiedText = unfunkifiedText;

	}

	public String funkifyText() {
		String[] words = unfunkifiedText.split(" ");
		for (int i = 0; i < words.length; i++) {
			char[] chars = words[i].toCharArray();
			char temp = chars[0];
			chars[0] = chars[chars.length - 1];
			chars[chars.length - 1] = temp;
			String word = "";
			for (int p = 0; p < chars.length; p++) {
				word = word + chars[p];
			}
			words[i] = word;
		}
		String word = "";
		for (int p = 0; p < words.length; p++) {
			word = word + words[p];
			if (p == words.length - 1) {

			} else {
				word = word + " ";
			}
		}
		System.out.println(word);
		return word;
	}
}
