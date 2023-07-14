package coreJavaAssignment2;

public class WrapperClass {

	public static void main(String[] args) {
		// Primitive types
		byte b = 34;
		short s = 14;
		int i = 24;
		long l = 13412123L;
		float f = 123123.123123f;
		double d = 123123.123123;
		char ch = 'S';
		boolean bool = true;

		// Explicit wrapping of data
		Byte bb = new Byte(b);
		Short ss = new Short(s);
		Integer ii = new Integer(i);
		Long ll = new Long(l);
		Float ff = new Float(f);
		Double dd = new Double(d);
		Character cc = new Character(ch);
		Boolean boool = new Boolean(bool);

		byte bbb = (byte) b;
		System.out.println(bbb);
		// AutoBoxing(Converting Primitive to WrapperClass Type)
		Byte ab = b;
		Short as = s;
		Integer ai = i;
		Long al = l;
		Float af = f;
		Double ad = d;
		Character ac = ch;
		Boolean abool = bool;

		// AutoUnboxing(Converting WrapperClass to Primitive Type)
		b = ab;
		s = as;
		i = ai;
		l = al;
		f = af;
		d = ad;
		ch = ac;
		bool = abool;

//		System.out.println(bb);
//		System.out.println(ss);
//		System.out.println(ii);
//		System.out.println(ll);
//		System.out.println(ff);
//		System.out.println(dd);
//		System.out.println(cc);
//		System.out.println(boool);

	}

}
