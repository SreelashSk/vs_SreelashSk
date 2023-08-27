package edu.disease.asn3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DiseaseFileRepository {
	String folderPath;

	/**
	 * Saves disease and patient data to files.
	 *
	 * @param diseases
	 * @param patients
	 * @throws Exception if there is an error during saving.
	 */
	void save(Disease[] diseases, Patient[] patients) throws Exception {
		ObjectOutputStream oos1 = new ObjectOutputStream(new FileOutputStream(folderPath + "diseases.dat"));
		oos1.writeObject(diseases);
		oos1.close();

		ObjectOutputStream oos2 = new ObjectOutputStream(new FileOutputStream(folderPath + "patients.dat"));
		oos2.writeObject(patients);
		oos2.close();
	}

	/**
	 * Initializes disease and patient data from files.
	 *
	 * @param folderPath.
	 * @return A DiseaseAndPatient object
	 * @throws Exception if there's an error
	 * @throws IllegalArgumentException If the folderPath is not found.
	 */
	DiseaseAndPatient init(String folderPath) throws Exception {
		if (folderPath != null) {
			DiseaseAndPatient dap = new DiseaseAndPatient();
			this.folderPath = folderPath;

			ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream(folderPath + "diseases.dat"));
			dap.setDiseases((Disease[]) ois1.readObject());
			ois1.close();

			ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream(folderPath + "patients.dat"));
			dap.setPatients((Patient[]) ois2.readObject());
			ois2.close();

			return dap;
		} else {
			throw new IllegalArgumentException("FolderPath is null");
		}

	}
}
