package edu.disease.asn4;

import edu.disease.asn3.DiseaseControlManager;
import edu.disease.asn3.Exposure;
import edu.disease.asn3.Patient;

public class ContactTrace {
	Patient[] patient;
	Exposure earlyExposure;
	PatientZero patientZero;

	 /**
     * Initializes the ContactTrace Object with patient data from a DiseaseControlManager.
     *
     * @param diseaseControlManager The DiseaseControlManager have patient data.
     */
	public ContactTrace(DiseaseControlManager diseaseControlManager) {
		this.patient = diseaseControlManager.getPatients();
	}

	/**
     *
     * @param Patient The patient to find the earliest exposure.
     * @return The PatientZero Object representing the earliest exposure.
     */
	public PatientZero findPatientZero(Patient patient) {
		for (Exposure exposure : patient.getExposures()) {
			if (exposure.getExposureType().equalsIgnoreCase("D")) {
				if (earlyExposure == null || exposure.getDateTime().isBefore(earlyExposure.getDateTime())) {
					earlyExposure = exposure;
				}
			}
		}
		if (earlyExposure != null) {
			for (Patient p1 : this.patient) {
				for (Exposure exposure : p1.getExposures()) {
					if (exposure.getDateTime().isBefore(earlyExposure.getDateTime())) {
						earlyExposure = exposure;
						patientZero.setPatient(p1);
						patientZero.setExposureDateTime(exposure.getDateTime());
						patientZero.setExposed(true);
						return findPatientZero(p1);
					}

				}
			}
		}
		return patientZero;
	}
}
