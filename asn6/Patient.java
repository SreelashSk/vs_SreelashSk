package edu.disease.asn6;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

import edu.disease.asn3.Exposure;

/**
 * Represents a patient class.
 */
public class Patient implements Comparable<Patient>, Serializable {

	private static final long serialVersionUID = 1L;
	private UUID patientId;
	private String firstName;
	private String lastName;
	private List<Exposure> exposures;
	private List<UUID> diseaseIds;

	public Patient() {
		diseaseIds = new LinkedList<UUID>();
		exposures = new LinkedList<Exposure>();
	}

	public void addDiseaseId(UUID diseaseId) {
		diseaseIds.add(diseaseId);
	}

	public void addExposure(Exposure exposure) {
		exposures.add(exposure);
	}

	public UUID getPatientId() {
		return patientId;
	}

	public void setPatientId(UUID patientId) {
		this.patientId = patientId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public int hashCode() {
		return Objects.hash(patientId);
	}

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

	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", exposures=" + exposures + ", diseaseIds=" + diseaseIds + "]";
	}

	@Override
	public int compareTo(Patient p) {
		if (p.lastName.compareToIgnoreCase(this.lastName) != 0) {
			return p.lastName.compareToIgnoreCase(this.lastName);
		} else
			return p.firstName.compareToIgnoreCase(this.firstName);
	}

	public List<Exposure> getExposures() {
		return exposures;
	}

	public void setExposures(List<Exposure> exposures) {
		this.exposures = exposures;
	}

	public List<UUID> getDiseaseIds() {
		return diseaseIds;
	}

	public void setDiseaseIds(List<UUID> diseaseIds) {
		this.diseaseIds = diseaseIds;
	}

}