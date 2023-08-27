package edu.disease.asn6;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

import edu.disease.asn3.Disease;

//It is better to use a List instead of arrays.
//Because, Arrays are fixed in size. once you create a array in size, there is no chance to increase
//or decrease the size of the array. Also there is no special methods with respect to arrays.
//But List is not like that. List are growable in nature. Based on our requirement we can increase 
//or decrease the size. List interface in Java provides type safety when used with generics.

/**
 * Represents a DiseaseFilerepository for saving and initializing disease and
 * patient data from files.
 */
public class DiseaseFileRepository {
	String folderPath;

	/**
	 * Saves the provided disease and patient lists to files.
	 *
	 * @param diseases The list of diseases to be saved.
	 * @param patients The list of patients to be saved.
	 * @throws Exception If an error occurs during the save process.
	 */
	void save(List<Disease> diseases, List<Patient> patients) throws Exception {
		ObjectOutputStream oos1 = new ObjectOutputStream(new FileOutputStream(folderPath + "diseases.dat"));
		oos1.writeObject(diseases);
		oos1.close();

		ObjectOutputStream oos2 = new ObjectOutputStream(new FileOutputStream(folderPath + "patients.dat"));
		oos2.writeObject(patients);
		oos2.close();
	}

	/**
	 * Initializes the repository with disease and patient data from files.
	 *
	 * @param folderPath.
	 * @return A `DiseaseAndPatient` object.
	 * @throws Exception If an error occurs during the initialization process.
	 */
	DiseaseAndPatient init(String folderPath) throws Exception {
		if (folderPath != null) {
			DiseaseAndPatient dap = new DiseaseAndPatient();
			this.folderPath = folderPath;

			ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream(folderPath + "diseases.dat"));
			dap.setDiseases((List<Disease>) ois1.readObject());
			ois1.close();

			ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream(folderPath + "patients.dat"));
			dap.setPatients((List<Patient>) ois2.readObject());
			ois2.close();

			return dap;
		} else {
			throw new IllegalArgumentException("FolderPath is null");
		}

	}
}
