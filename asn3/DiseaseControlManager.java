package edu.disease.asn3;

import java.util.UUID;


/**
 * Represents a DiseaseControlManager class.
 */
public interface DiseaseControlManager {
	/**
	 * Returns the diseases array
	 */
	Disease[] getDiseases();

	/**
	 * Returns the patients array
	 */
	Patient[] getPatients();
	
	

	/**
	 * Adds a new disease to the application.
	 *
	 * @param name       (name of the disease).
	 * @param infectious (Whether the disease is infectious).
	 * @return Disease Object.
	 */
	Disease addDisease(String name, boolean infectious);

	/**
	 * Returns the disease.
	 *
	 * @param diseaseId.
	 * @return Disease object.
	 */
	Disease getDisease(UUID diseaseId);

	/**
	 * Adds a new patient.
	 *
	 * @param firstName    (first name of the patient).
	 * @param lastName     (last name of the patient).
	 * @param maxDiseases  (maximum number of diseases the patient can be associated
	 *                     with).
	 * @param maxExposures (The maximum number of exposures the patient can have).
	 * @return Patient object.
	 */
	Patient addPatient(String firstName, String lastName, int maxDiseases, int maxExposures);

	/**
	 * Returns the patient
	 *
	 * @param patientId (UUID).
	 * @return Patient object.
	 */
	Patient getPatient(UUID patientId);

	/**
	 * Adds a disease to a patient.
	 *
	 * @param patientId (UUID).
	 * @param diseaseId (UUID).
	 */
	void addDiseaseToPatient(UUID patientId, UUID diseaseId);

	/**
	 * Adds an exposure to a patient.
	 *
	 * @param patientId (UUID).
	 * @param exposure  (Exposure).
	 */
	void addExposureToPatient(UUID patientId, Exposure exposure);
	
	
}
