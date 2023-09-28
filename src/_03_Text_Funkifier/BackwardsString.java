package _03_Text_Funkifier;

public class BackwardsString implements TextFunkifier {

    private String unfunkifiedText;
    
    public BackwardsString(String unfunkifiedText) {

        this.unfunkifiedText = unfunkifiedText;

    }

    @Override
    public String funkifyText() {
    	StringBuilder build = new StringBuilder();
    	build.append(unfunkifiedText);
    	build.reverse();
        return build.toString();

    }
}
