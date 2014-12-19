package org.javaturk.oop.ch03;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         For more info please @see <a
 *         href="http://www.javaturk.org">http://www.javaturk.org</a>
 *         </p>
 *         This is an example that shows how a piece of Java code can be written
 *         using Turkish letters.
 */
public class TurkceKarakterlerDemo {
	public static void main(String[] args) {
		int ı = 8;
		int ğ = 3;

		double ş = şunuHesaplaBakalım(ı, ğ);
		System.out.println(ş);
	}

	public static double şunuHesaplaBakalım(int ö, int ü) {
		int ı = ö + ü;
		double j = ö - ü;
		return ı * j;
	}
}
