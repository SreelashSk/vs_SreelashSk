package edu.disease.asn1;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.UUID;

public class Exposure {

	UUID patientId;
	LocalDateTime dateTime;
	String exposureType;

	/**
	 * Constructs an Exposure Object with a given patient ID.
	 * 
	 * @param patientId The UUID of the patient associated with the exposure.
	 */
	public Exposure(UUID patientId) {
		this.patientId = patientId;
	}

	/**
	 * Gets the date and time of the exposure.
	 *
	 * @return The date and time of the exposure.
	 */
	public LocalDateTime getDateTime() {
		return dateTime;
	}

	/**
	 * Sets the date and time of the exposure.
	 *
	 * @param dateTime (The date and time of the exposure).
	 */
	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}

	/**
	 * Gets the exposureType (Direct or Indirect exposure).
	 *
	 * @return exposure type.
	 */
	public String getExposureType() {
		return exposureType;
	}

	/**
	 * Sets the exposureType (Direct or Indirect).
	 *
	 * @param exposure type to be set.
	 * @throws IllegalArgumentException if the supplied exposure type is not "D" or
	 *                                  "I".
	 */
	public void setExposureType(String exposureType) {
		if ("D".equalsIgnoreCase(exposureType) || "I".equalsIgnoreCase(exposureType)) {
			this.exposureType = exposureType;
		} else {
			throw new IllegalArgumentException("There have no Direct and InDirect exposureType");
		}

	}

	/**
	 * Gets the UUID of the patient associated with the exposure.
	 *
	 * @return patientId.
	 */
	public UUID getPatientId() {
		return patientId;
	}

	
	public void setPatientId(UUID patientId) {
		this.patientId = patientId;
	}

	/**
	 * 
	 * hash code is the Unique Integer number, which is calculated based on the
	 * address of the Object Generates a hash code for the Exposure object based on
	 * dateTime and patientId.
	 * 
	 * @return The hash code.
	 */
	@Override
	public int hashCode() {
		return Objects.hash(dateTime, patientId);
	}

	/**
	 * equals() is used to compare the address of the Object. If the address's are
	 * equal it returns true, else it returns false
	 *
	 * @param obj compare the address of the Object.
	 * @return true if the objects are equal, or else it return false.
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Exposure other = (Exposure) obj;
		return Objects.equals(dateTime, other.dateTime) && Objects.equals(patientId, other.patientId);
	}

	/**
	 * Returns a string represented Exposure object.
	 *
	 * @return The string representation.
	 */
	@Override
	public String toString() {
		return "Exposure [patientId=" + patientId + ", dateTime=" + dateTime + ", exposureType=" + exposureType + "]";
	}

}