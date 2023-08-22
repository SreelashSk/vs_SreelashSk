package edu.disease.asn3;

/**
 * @class NonInfectiousDisease is a kind of Disease class.
 */
public class NonInfectiousDisease extends Disease {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
     * Gets examples of non-infectious diseases.
     */
	@Override
	String[] getExamples() {
		String[] nonInfectiousDisease = { "Diabetes", "Cancer", "Stroke", "Heart disease" };
		return nonInfectiousDisease;
	}

}
