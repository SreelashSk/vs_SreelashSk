package edu.disease.asn6;

import java.util.LinkedList;
import java.util.List;

import edu.disease.asn3.DiseaseControlManager;
import edu.disease.asn3.Exposure;
import edu.disease.asn3.Patient;
import edu.disease.asn4.PatientZero;

public class ContactTrace {
	List<Patient> patient;
	Exposure earlyExposure;
	PatientZero patientZero;

	public ContactTrace(DiseaseControlManager diseaseControlManager) {
		patient = new LinkedList<Patient>();
	}

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
