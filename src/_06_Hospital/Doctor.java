package _06_Hospital;

import java.util.ArrayList;

public abstract class Doctor {
 ArrayList<Patient> list = new ArrayList<Patient>();
  boolean canMakeCalls = false;
  boolean canPerformSurgery = false;
 
 public Doctor() {
	 
 }
 
 void doMedicine() {
	 for (int i = 0; i < list.size(); i++) {
		 list.get(i).checkPulse();
	 }
 }
 void assignPatient(Patient person) {
	 list.add(person);
 }
 Patient getPatient(int index) {
	 return list.get(index);
 }
 public boolean performsSurgery() {
		return canPerformSurgery;
	}
 public boolean makesHouseCalls() {
	 return canMakeCalls;
	}

public ArrayList<Patient> getPatients() {
	return list;
}
public void setCanMakeCalls(boolean can) {
	this.canMakeCalls = can; 
}
public void setCanPerformSurgery(boolean can) {
	this.canPerformSurgery = can; 
}
}
