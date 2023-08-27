package edu.disease.asn3;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;

/**
 * Represents a patient class.
 */
public class Patient implements Comparable<Patient>, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	UUID patientId;
	String firstName;
	String lastName;
	Exposure[] exposures;
	UUID[] diseaseIds;

	int maxDiseases, maxExposures;

	int index1, index2 = 0;

	/**
	 * Constructs a Patient Object
	 *
	 * @param maxDiseases  The maximum number of diseases this patient can be
	 *                     associated with.
	 * @param maxExposures The maximum number of exposures this patient can have.
	 * @throws IllegalArgumentException if maxDiseases or maxExposures cannot be
	 *                                  used to initiate arrays.
	 */
	public Patient(int maxDiseases, int maxExposures) {
		if (0 < maxDiseases && 0 < maxExposures) {
			this.maxDiseases = maxDiseases;
			this.maxExposures = maxExposures;
			diseaseIds = new UUID[maxDiseases];
			exposures = new Exposure[maxExposures];
		} else {
			throw new IllegalArgumentException();
		}
	}

	/**
	 * Adds a diseaseId.
	 *
	 * @param diseaseId The UUID of the disease to add.
	 * @throws IndexOutOfBoundsException if there is no space to add more
	 *                                   diseaseIds.
	 */
	void addDiseaseId(UUID diseaseId) {
		if (index1 < maxDiseases) {
			diseaseIds[index1++] = diseaseId;
		} else {
			throw new IndexOutOfBoundsException("No Space!!");
		}
	}

	/**
	 * Adds an exposure.
	 *
	 * @param exposure The exposure to add.
	 * @throws IndexOutOfBoundsException if there is no space to add more exposures.
	 */
	void addExposure(Exposure exposure) {
		if (index2 < maxExposures) {
			exposures[index2++] = exposure;
		} else {
			throw new IndexOutOfBoundsException("No Space!!");
		}
	}

	/**
	 * Gets the patientId.
	 *
	 * @return The patientId.
	 */
	public UUID getPatientId() {
		return patientId;
	}

	/**
	 * Sets the patientId.
	 *
	 * @param patientId The UUID to set for the patient.
	 */
	public void setPatientId(UUID patientId) {
		this.patientId = patientId;
	}

	/**
	 * Gets the patient's first name.
	 *
	 * @return The patient's first name.
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Sets the patient's first name.
	 *
	 * @param firstName The first name to set for the patient.
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * Gets the patient's last name.
	 *
	 * @return The patient's last name.
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Sets the patient's last name.
	 *
	 * @param lastName The last name to set for the patient.
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * hash code is the Unique Integer number, which is calculated based on the
	 * address of the Object Generates a hash code for the Patient object based on
	 * patientId.
	 *
	 * @return The hash code.
	 */
	@Override
	public int hashCode() {
		return Objects.hash(patientId);
	}

	/**
	 * equals() is used to compare the address of the Object. If the address's are
	 * equal it returns true, else it returns false
	 * 
	 * @param obj The object to compare.
	 * @return true if the objects are equal, or else return false.
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Patient other = (Patient) obj;
		return Objects.equals(patientId, other.patientId);
	}

	/**
	 * Returns a string representation of the Patient object.
	 *
	 * @return The string representation.
	 */
	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", exposures=" + Arrays.toString(exposures) + ", diseaseIds=" + Arrays.toString(diseaseIds)
				+ ", maxDiseases=" + maxDiseases + ", maxExposures=" + maxExposures + ", index1=" + index1 + ", index2="
				+ index2 + "]";
	}

	/**
	 * Compares this Patient object with another Patient object for sorting
	 * purposes.
	 */
	@Override
	public int compareTo(Patient p) {
		if (p.lastName.compareToIgnoreCase(this.lastName) != 0) {
			return p.lastName.compareToIgnoreCase(this.lastName);
		} else
			return p.firstName.compareToIgnoreCase(this.firstName);
	}

	public Exposure[] getExposures() {
		return exposures;
	}

	public void setExposures(Exposure[] exposures) {
		this.exposures = exposures;
	}

}
