package _06_Hospital;

public class Patient {
	public Patient() {
		
	}
	boolean feelingCaredFor = false;
	
	void checkPulse() {
		this.feelingCaredFor = true; 
	}

	public boolean feelsCaredFor() {
		// TODO Auto-generated method stub
		return feelingCaredFor;
	}
}
