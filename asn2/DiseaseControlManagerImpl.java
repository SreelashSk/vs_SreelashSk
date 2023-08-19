package edu.disease.asn2;

import java.util.UUID;

import edu.disease.asn1.Exposure;

public class DiseaseControlManagerImpl implements DiseaseControlManager {

	private Disease[] diseases;
	private Patient[] patients;

	int maxDiseases, maxPatients;

	int diseaseIndex = 0;
	int patientIndex = 0;

	public DiseaseControlManagerImpl(int maxDiseases, int maxPatients) {
		if (0 <= maxDiseases && 0 <= maxPatients) {
			this.maxDiseases = maxDiseases;
			this.maxPatients = maxPatients;
			diseases = new Disease[maxDiseases];
			patients = new Patient[maxPatients];
		} else
			throw new IllegalArgumentException();

	}

	@Override
	public Disease addDisease(String diseaseName, boolean infectious) {
		if (diseaseIndex < maxDiseases) {
			if (infectious) {
				return diseases[diseaseIndex++] = new InfectiousDisease();
			} else
				return diseases[diseaseIndex++] = new NonInfectiousDisease();
		}
		throw new IllegalStateException();
	}

	@Override
	public Disease getDisease(UUID diseaseId) {
		return null;
	}

	@Override
	public Patient addPatient(String firstName, String lastName, int maxDiseases, int maxExposures) {
		if (patientIndex < maxPatients) {
			patients[patientIndex] = new Patient(maxDiseases, maxExposures);
			patients[patientIndex].setFirstName(firstName);
			patients[patientIndex].setLastName(lastName);
			return patients[patientIndex++];
		} else
			throw new IllegalStateException();
	}

	@Override
	public Patient getPatient(UUID patientId) {
		return null;
	}

	@Override
	public void addDiseaseToPatient(UUID patientId, UUID diseaseId) {

	}

	@Override
	public void addExposureToPatient(UUID patientId, Exposure exposure) {

	}
}