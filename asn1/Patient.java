package edu.disease.asn1;

import java.util.Arrays;
import java.util.UUID;

public class Patient {

	UUID patientId;
	String firstName;
	String lastName;
	Exposure[] Exposure;
	UUID[] diseaseIds;

	int maxDiseases, maxExposures;

	public Patient(int maxDiseases, int maxExposures) {
		this.maxDiseases = maxDiseases;
		this.maxExposures = maxExposures;
	}

	int index = 0;

	void addDiseaseId(UUID diseaseId) {
		if (index < maxDiseases) {
			diseaseIds[index++] = diseaseId;
		} else {
			throw new IndexOutOfBoundsException("Disease Id's are full!");
		}
	}

	void addExposure(Exposure exposure) {
		if (index < maxExposures) {
			Exposure[index++] = exposure;
		} else {
			throw new IndexOutOfBoundsException("Exposures has reached its maximum capacity!");
		}
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

	public Exposure[] getExposure() {
		return Exposure;
	}

	public void setExposure(Exposure[] exposure) {
		Exposure = exposure;
	}

	public UUID[] getDiseaseIds() {
		return diseaseIds;
	}

	public void setDiseaseIds(UUID[] diseaseIds) {
		this.diseaseIds = diseaseIds;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((patientId == null) ? 0 : patientId.hashCode());
		return result;
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
		if (patientId == null) {
			if (other.patientId != null)
				return false;
		} else if (!patientId.equals(other.patientId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", firstName=" + firstName + ", lastName=" + lastName + ", Exposure="
				+ Arrays.toString(Exposure) + ", diseaseIds=" + Arrays.toString(diseaseIds) + ", maxDiseases="
				+ maxDiseases + ", maxExposures=" + maxExposures + ", index=" + index + "]";
	}

}
