package edu.disease.asn2;

import java.util.Arrays;
import java.util.UUID;

import edu.disease.asn1.Exposure;

public class Patient implements Comparable<Patient> {
	private String firstName;
	private String lastName;
	Exposure[] exposures;
	UUID[] diseaseIds;
	UUID patientId;

	int maxDiseases;
	int maxExposures;

	int index = 0;

	public Patient(int maxDiseases, int maxExposures) {
		this.maxDiseases = maxDiseases;
		this.maxExposures = maxExposures;

	}

	void addDiseaseId(UUID diseaseId) {
		if (index < maxDiseases) {
			diseaseIds[index++] = diseaseId;
		} else {
			throw new IndexOutOfBoundsException("diseaseIds array is full!!!");
		}

	}

	void addExposure(Exposure exposure) {
		if (index < maxExposures) {
			exposures[index++] = exposure;
		} else {
			throw new IndexOutOfBoundsException("exposures array has reached its maximum capacity!!!");
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

	public Exposure[] getExposures() {
		return exposures;
	}

	public void setExposures(Exposure[] exposures) {
		this.exposures = exposures;
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
		return "Patient [firstName=" + firstName + ", lastName=" + lastName + ", exposures="
				+ Arrays.toString(exposures) + ", diseaseIds=" + Arrays.toString(diseaseIds) + "]";
	}

	@Override
	public int compareTo(Patient p) {
		int same = this.lastName.compareToIgnoreCase(p.lastName);
		if (same != 0) {
			return same;
		} else
			return this.firstName.compareToIgnoreCase(p.firstName);
	}

}
