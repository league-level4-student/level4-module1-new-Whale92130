package _06_Hospital;

import java.util.ArrayList;
import java.util.List;

import _00_Intro_to_Exceptions.NegativeNumberException;

public class Hospital {
	ArrayList<Doctor> docs = new ArrayList<Doctor>();
	ArrayList<Patient> unassigned = new ArrayList<Patient>();

	public Hospital() {

	}

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

	public void assignPatientsToDoctors() throws DoctorFullException {
		// evenly add ussaigned to doctors
		int fullDocs = 0;
		while (unassigned.size() > 0) {
			for (int i = 0; i < docs.size(); i++) {
				if (docs.get(i).getPatients().size() < 3 && unassigned.isEmpty() == false) {
					docs.get(i).assignPatient(unassigned.get(0));
					unassigned.remove(0);
					System.out.println("add pat");
				} else {
					fullDocs++;
				}
			}
		}
		if (fullDocs == docs.size()) {
			throw new DoctorFullException();
		}
	}
}
