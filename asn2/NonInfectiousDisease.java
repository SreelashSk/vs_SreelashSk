package edu.disease.asn2;

public class NonInfectiousDisease extends Disease {

	@Override
	String[] getExamples() {
		String nonInfectiousDisease[] = { "Heart disease", "Stroke", "Cancer", "Diabetes" };
		return nonInfectiousDisease;
	}
}
