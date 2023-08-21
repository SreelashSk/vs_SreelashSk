package edu.disease.asn2;

/**
 * @class InfectiousDisease is a kind of Disease class.
 */
public class InfectiousDisease extends Disease {

	 /**
     * Gets examples of infectious diseases.
     */
	@Override
	String[] getExamples() {
		String[] infectiousDisease = { "Influenza", "Chickenpox", "Dengue", "Cholera" };
		return infectiousDisease;
	}

}
