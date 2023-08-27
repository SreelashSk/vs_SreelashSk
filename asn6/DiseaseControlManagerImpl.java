package edu.disease.asn6;

import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

import edu.disease.asn3.Disease;
import edu.disease.asn3.Exposure;
import edu.disease.asn3.InfectiousDisease;
import edu.disease.asn3.NonInfectiousDisease;

public class DiseaseControlManagerImpl implements DiseaseControlManager {

	private List<Disease> diseases;
	private List<Patient> patients;

	public DiseaseControlManagerImpl() {
		diseases = new LinkedList<Disease>();
		patients = new LinkedList<Patient>();
	}

	@Override
	public List<Disease> addDisease(String name, boolean infectious) {
		if (infectious) {
			diseases.add(new InfectiousDisease());
			return diseases;
		} else {
			diseases.add(new NonInfectiousDisease());
			return diseases;
		}

	}

	@Override
	public Disease getDisease(UUID diseaseId) {
		for (Disease disease : diseases) {
			if (disease.getDiseaseId().equals(diseaseId)) {
				return disease;
			}
		}
		return null;
	}

	@Override
	public List<Patient> addPatient(String firstName, String lastName) {
		patients = new LinkedList<Patient>();
		Patient patient = new Patient();
		patient.setFirstName(firstName);
		patient.setLastName(lastName);
		return patients;
	}

	@Override
	public Patient getPatient(UUID patientId) {
		for (Patient patient : patients) {
			if (patient.getPatientId().equals(patientId)) {
				return patient;
			}
		}
		return null;

	}

	@Override
	public void addDiseaseToPatient(UUID patientId, UUID diseaseId) {
		Patient patient = getPatient(patientId);
		if (patient == null) {
			throw new IllegalArgumentException("Patient Id not found :(");
		}
		Disease disease = getDisease(diseaseId);
		if (disease == null) {
			throw new IllegalArgumentException("Disease Id not found :(");
		}
		patient.addDiseaseId(disease.getDiseaseId());

	}

	@Override
	public void addExposureToPatient(UUID patientId, Exposure exposure) {
		Patient patient = getPatient(patientId);
		if (patient == null) {
			throw new IllegalArgumentException("Patient Id not found :(");
		}
		patient.addExposure(exposure);

	}

	@Override
	public List<Disease> getDiseases() {
		return diseases;
	}

	@Override
	public List<Patient> getPatients() {
		return patients;
	}

}
