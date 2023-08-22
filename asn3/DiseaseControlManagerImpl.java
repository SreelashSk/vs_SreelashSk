package edu.disease.asn3;

import java.util.UUID;

import edu.disease.asn1.Exposure;

public class DiseaseControlManagerImpl implements DiseaseControlManager {

	private Disease[] diseases;
	private Patient[] patients;

	int maxDiseases, maxPatients;

	int index1, index2 = 0;

	/**
	 * Constructs a DiseaseControlManagerImpl.
	 *
	 * @param maxDiseases (maximum number of diseases that can be managed).
	 * @param maxPatients (maximum number of patients that can be managed).
	 * @throws IllegalArgumentException if maxDiseases or maxPatients cannot be used to initialize the array.
	 */
	public DiseaseControlManagerImpl(int maxDiseases, int maxPatients) {
		if (0 < maxDiseases && 0 < maxPatients) {
			this.maxDiseases = maxDiseases;
			this.maxPatients = maxPatients;
			diseases = new Disease[maxDiseases];
			patients = new Patient[maxPatients];
		} else
			throw new IllegalArgumentException();
	}

	@Override
	public Disease addDisease(String name, boolean infectious) {
		if (index1 < maxDiseases) {
			if (infectious) {
				return diseases[index1++] = new InfectiousDisease();
			} else {
				return diseases[index1++] = new NonInfectiousDisease();
			}
		} else {
			throw new IllegalStateException("No more diseases can be added");
		}

	}

	@Override
	public Disease getDisease(UUID diseaseId) {
		for (int i = 0; i < maxDiseases; i++) {
			if (diseases[i].getDiseaseId().equals(diseaseId)) {
				return diseases[i];
			}
		}
		return null;
	}

	@Override
	public Patient addPatient(String firstName, String lastName, int maxDiseases, int maxExposures) {
		if (index2 < maxPatients) {
			patients[index2] = new Patient(maxDiseases, maxExposures);
			patients[index2].setFirstName(firstName);
			patients[index2].setLastName(lastName);
			return patients[index2++];
		}
		throw new IllegalStateException("No more patients can be added");
	}

	@Override
	public Patient getPatient(UUID patientId) {
		for (int i = 0; i < maxPatients; i++) {
			if (patients[i].getPatientId().equals(patientId)) {
				return patients[i];
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
	public Disease[] getDiseases() {
		return diseases;
	}

	@Override
	public Patient[] getPatients() {
		return patients;
	}

}
