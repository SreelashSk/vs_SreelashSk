package edu.disease.asn2;

/**
 * @class NonInfectiousDisease is a kind of Disease class.
 */
public class NonInfectiousDisease extends Disease {

	/**
     * Gets examples of non-infectious diseases.
     */
	@Override
	String[] getExamples() {
		String[] nonInfectiousDisease = { "Diabetes", "Cancer", "Stroke", "Heart disease" };
		return nonInfectiousDisease;
	}

}
