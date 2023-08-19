package edu.disease.asn1;

import java.time.LocalDateTime;
import java.util.UUID;

public class Exposure {
	private String exposureType;
	private UUID patientId;
	private LocalDateTime dateTime;

	public Exposure(String exposureType, LocalDateTime dateTime) {
		this.exposureType = exposureType;
		this.dateTime = dateTime;
	}

	public Exposure() {
	}

	public UUID getPatientId() {
		return patientId;
	}

	public String getExposureType() {
		return exposureType;
	}

	public void setExposureType(String exposureType) {

		if ("D".equalsIgnoreCase(exposureType) || "I".equalsIgnoreCase(exposureType)) {
			this.exposureType = exposureType;
		} else {
			throw new IllegalArgumentException("NO DIRECT AND INDIRECT EXPOSURES PRESENT!!");
		}
	}

	public LocalDateTime getDateTime() {
		return dateTime;
	}

	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dateTime == null) ? 0 : dateTime.hashCode());
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
		Exposure other = (Exposure) obj;
		if (dateTime == null) {
			if (other.dateTime != null)
				return false;
		} else if (!dateTime.equals(other.dateTime))
			return false;
		if (patientId == null) {
			if (other.patientId != null)
				return false;
		} else if (!patientId.equals(other.patientId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Exposure [exposureType=" + exposureType + ", patientId=" + patientId + ", dateTime=" + dateTime + "]";
	}

}
