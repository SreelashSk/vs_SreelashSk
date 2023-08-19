package edu.disease.asn2;

import java.util.UUID;

import edu.disease.asn1.Exposure;

public interface DiseaseControlManager {
	
	Disease addDisease(String diseaseName, boolean infectious);

	Disease getDisease(UUID diseaseId);

	Patient addPatient(String firstName, String lastName, int maxDiseases, int maxExposures);

	Patient getPatient(UUID patientId);

	void addDiseaseToPatient(UUID patientId, UUID diseaseId);

	void addExposureToPatient(UUID patientId, Exposure exposure);
}