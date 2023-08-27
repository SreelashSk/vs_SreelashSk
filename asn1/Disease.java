package edu.disease.asn1;

import java.util.Objects;
import java.util.UUID;

/**
 * Represents a disease class.
 */
public class Disease {

	UUID diseaseId;
	String name;

	/**
	 * Gets the DiseaseId
	 * 
	 * @return The disease's UUID.
	 */
	public UUID getDiseaseId() {
		return diseaseId;
	}

	/**
	 * Sets the DiseaseId.
	 *
	 * @param diseaseId The UUID to set for the disease.
	 */
	public void setDiseaseId(UUID diseaseId) {
		this.diseaseId = diseaseId;
	}

	/**
	 * Gets the name of the disease.
	 *
	 * @return The name of the disease.
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name of the disease.
	 *
	 * @param name The name to set for the disease.
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Generates a hash code for the Disease object.
	 *
	 * @return The hash code.
	 */
	@Override
	public int hashCode() {
		return Objects.hash(diseaseId);
	}

	/**
	 * Checks if this Disease object is equal.
	 *
	 * @param obj (compare the address of Object).
	 * @return true if the objects are equal, or else @return false.
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Disease other = (Disease) obj;
		return Objects.equals(diseaseId, other.diseaseId);
	}

	/**
	 * Returns a string representation of the Disease object.
	 *
	 * @return The string representation.
	 */
	@Override
	public String toString() {
		return "Disease [diseaseId=" + diseaseId + ", name=" + name + "]";
	}

}
