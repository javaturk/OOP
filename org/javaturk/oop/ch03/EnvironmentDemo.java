package org.javaturk.oop.ch03;

import java.io.*;
import java.nio.charset.Charset;
import java.util.*;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         For more info please @see <a
 *         href="http://www.javaturk.org">http://www.javaturk.org</a>
 *         </p>
 *         This is an example that prints the default environment settings for
 *         language and country. Optionally it lists all available character
 *         sets in the system.
 */
public class EnvironmentDemo {
	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		System.out.println("Encoding: " + isr.getEncoding());

		Locale locale = Locale.getDefault();
		System.out.println("Country: " + locale.getCountry());
		System.out.println("Display language: " + locale.getDisplayLanguage());
		System.out.println("Language: " + locale.getLanguage());
		System.out.println("Display name: " + locale.getDisplayName());
		System.out.println("ISO3 Language: " + locale.getISO3Language());

		listCharSets();
	}

	/**
	 * Lists all available character sets in the system.
	 */
	public static void listCharSets() {
		SortedMap charsets = Charset.availableCharsets();
		Set names = charsets.keySet();
		for (Iterator e = names.iterator(); e.hasNext();) {
			String name = (String) e.next();
			Charset charset = (Charset) charsets.get(name);
			System.out.println(charset);
			Set aliases = charset.aliases();
			for (Iterator ee = aliases.iterator(); ee.hasNext();) {
				System.out.println("    " + ee.next());
			}
		}
	}
}
