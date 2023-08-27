package edu.disease.asn6;

import java.util.List;
import java.util.UUID;

import edu.disease.asn3.Disease;
import edu.disease.asn3.Exposure;

/**
 * Represents a DiseaseControlManager class.
 */
public interface DiseaseControlManager {
	/**
	 * Returns the diseases array
	 */
	public List<Disease> getDiseases();

	/**
	 * Returns the patients array
	 */
	public List<Patient> getPatients();

	/**
	 * Adds a new disease to the application.
	 *
	 * @param name       (name of the disease).
	 * @param infectious (Whether the disease is infectious).
	 * @return Disease Object.
	 */
	public List<Disease> addDisease(String name, boolean infectious);

	/**
	 * Returns the disease.
	 *
	 * @param diseaseId.
	 * @return Disease object.
	 */
	public Disease getDisease(UUID diseaseId);

	/**
	 * Adds a new patient to the application.
	 *
	 * @param firstName    (first name of the patient).
	 * @param lastName     (last name of the patient).
	 * @param maxDiseases  (maximum number of diseases the patient can be associated
	 *                     with).
	 * @param maxExposures (The maximum number of exposures the patient can have).
	 * @return Patient object.
	 */
	//public List<Patient> addPatient(String firstName, String lastName, int maxDiseases, int maxExposures);

	/**
	 * Returns the patient
	 *
	 * @param patientId (UUID).
	 * @return Patient object.
	 */
	public Patient getPatient(UUID patientId);

	/**
	 * Adds a disease to a patient.
	 *
	 * @param patientId (UUID).
	 * @param diseaseId (UUID).
	 */
	public void addDiseaseToPatient(UUID patientId, UUID diseaseId);

	/**
	 * Adds an exposure to a patient.
	 *
	 * @param patientId (UUID).
	 * @param exposure  (Exposure).
	 */
	public void addExposureToPatient(UUID patientId, Exposure exposure);

	public List<Patient> addPatient(String firstName, String lastName);

}
