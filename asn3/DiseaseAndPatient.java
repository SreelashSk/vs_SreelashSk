package edu.disease.asn3;

public class DiseaseAndPatient {

	private Disease[] diseases;
	private Patient[] patients;

	/**
	 * Gets array of diseases.
	 *
	 * @return array of diseases.
	 */
	public Disease[] getDiseases() {
		return diseases;
	}

	/**
	 * Sets array of diseases.
	 *
	 * @param diseases (array of diseases to set).
	 */
	public void setDiseases(Disease[] diseases) {
		this.diseases = diseases;
	}

	/**
	 * Gets array of patients.
	 *
	 * @return array of patients.
	 */
	public Patient[] getPatients() {
		return patients;
	}

	/**
	 * Sets array of patients.
	 *
	 * @param patients (array of patients to set).
	 */
	public void setPatients(Patient[] patients) {
		this.patients = patients;
	}

}
