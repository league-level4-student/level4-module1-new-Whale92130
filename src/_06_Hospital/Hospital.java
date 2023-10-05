package _06_Hospital;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
ArrayList<Doctor> docs = new ArrayList<Doctor>();
ArrayList<Patient> unassigned = new ArrayList<Patient>();

void addPatient(Patient person) {
	this.unassigned.add(person);
}
void addDoctor(Doctor doc) {
	this.docs.add(doc);
}

public ArrayList<Doctor> getDoctors() {
	// TODO Auto-generated method stub
	return docs;
}

public ArrayList<Patient> getPatients() {
	// TODO Auto-generated method stub
	return unassigned;
}
public void assignPatientsToDoctors() {
	//evenly add ussaigned to doctors
	while (unassigned.size() > 0) {
		for (int i = 0; i < docs.size(); i++) {
			if (docs.get(i).getPatients().size() < 3) {
				while(docs.get(i).getPatients().size() < 3) {
					docs.get(i).assignPatient(unassigned.get(0));
				}
			}
		}
	}
}
}
