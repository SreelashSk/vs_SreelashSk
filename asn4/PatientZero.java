package edu.disease.asn4;

import java.time.LocalDateTime;

import edu.disease.asn3.Patient;

/**
 * Represents a PatientZero class.
 * This class will be used by the ContactTrace class to hold the first patient in a line of exposures.
 */
public class PatientZero {
	private Patient patient;
	private LocalDateTime exposureDateTime;
	private boolean exposed;

	 /**
     * Retrieves the Patient.
     *
     * @return The associated Patient object.
     */
	public Patient getPatient() {
		return patient;
	}
	
	 /**
     * Sets the patient.
     *
     * @param patient The Patient object to set.
     */
	public void setPatient(Patient patient) {
		this.patient = patient;
	}


    /**
     * Retrieves the date and time of exposure.
     *
     * @return The date and time of exposure.
     */
	public LocalDateTime getExposureDateTime() {
		return exposureDateTime;
	}

	/**
     * Sets the date and time of exposure.
     *
     * @param exposureDateTime The date and time of exposure to set.
     */
	public void setExposureDateTime(LocalDateTime exposureDateTime) {
		this.exposureDateTime = exposureDateTime;
	}

	 /**
     * Checks if patient zero has been exposed to the disease.
     *
     * @return true if exposed, or-else return false.
     */
	public boolean isExposed() {
		return exposed;
	}

	 /**
     * Sets the exposure status.
     *
     * @param exposed The exposure status to set.
     */
	public void setExposed(boolean exposed) {
		this.exposed = exposed;
	}

}
