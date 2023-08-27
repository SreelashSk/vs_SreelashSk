package edu.disease.asn3;

/**
 * @class InfectiousDisease is a kind of Disease class.
 */
public class InfectiousDisease extends Disease{

	private static final long serialVersionUID = 1L;

	/**
     * Gets examples of infectious diseases.
     */
	@Override
	String[] getExamples() {
		String[] infectiousDisease = { "Influenza", "Chickenpox", "Dengue", "Cholera" };
		return infectiousDisease;
	}

}
