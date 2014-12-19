package org.javaturk.oop.ch03;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         For more info please @see <a
 *         href="http://www.javaturk.org">http://www.javaturk.org</a>
 *         </p>
 *         This is an example that shows how the Unicode characters are used in
 *         Java. It prints "Hello" in Japanese and Arabic. Notice the escape
 *         characters in the code.
 */
public class UnicodeSelamDemo {

	public static void main(String[] args) {
		String selamInJapanese = "\u4eca\u65e5\u306f\u4e16\u754c";
		System.out.println("Japonca da Selam Dünya " + selamInJapanese);
		// Notice \n
		System.out.print("Ya da\n");

		char ch1 = '\u4eca';
		char ch2 = '\u65e5';
		char ch3 = '\u306f';
		char ch4 = '\u4e16';
		char ch5 = '\u754c';

		System.out.println("Japonca da Selam Dünya: \t" + ch1 + ch2 + ch3 + ch4 + ch5);

		String selamInArabic = "\u0633\u0644\u0627\u0645";
		// Notice \t
		System.out.println("Arapça Selam: \t" + selamInArabic);
	}
}
