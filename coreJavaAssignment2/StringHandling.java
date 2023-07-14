package coreJavaAssignment2;

public class StringHandling {

	public static void main(String[] args) {

		String s1 = new String("Sreelash");
		String s2 = "Sree";
		System.out.println("Length of String: " + s1.length());
		System.out.println("Concatination: " + s1.concat(s2));
		System.out.println("Substring starting from index 2: " + s1.substring(2));
		System.out.println("Substring starting from 0 to 4: " + s1.substring(0, 4));
		System.out.println("CharAt of 5: " + s1.charAt(5));
		System.out.println("Index of e: " + s1.indexOf('e'));
		System.out.println("Last Indes of e: " + s1.lastIndexOf('e'));
		System.out.println("s1 Starts with S?: " + s1.startsWith("S"));
		System.out.println("s1 ends with sh? " + s1.endsWith("sh"));
		System.out.println("replace e to _: " + s1.replace('e', '_'));
		System.out.println("Convertion of Lowercase to UpperCase: " + s1.toUpperCase());
		System.out.println("Convertion of Uppercase to Lowercase: " + s1.toLowerCase());
		char[] ch = s1.toCharArray();
		System.out.println("Extracting toCharArray and placed in char[] ch: " + String.valueOf(ch));
		System.out.println("String comparision equals(): " + s1.equals(s2));// if you want to compare the content, then
																			// use equals().
		System.out.println("String comparision compareTo(): "+s1.compareTo(s2));

	}

}
