/* Ch 7
 * MultiDimArray.java
 */

package org.javaturk.oop.ch06;

public class MultiDimArray {

	static void prt(String s) {
		System.out.println(s);
	}

	static void prt(int i) {
		System.out.println(i);
	}

	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3 }, { 4, 5, 6, 7, 8 } };

		int[][] b = new int[2][];
		b[0] = new int[3];
		b[1] = new int[5];
		//
		for (int i = 0; i < a.length; i++)
			for (int j = 0; j < a[i].length; j++)
				prt("a[" + i + "][" + j + "] = " + a[i][j]);
		//
		// prt("a.length is " + a.length);
		// prt("a[0].length is " + a[0].length);
		// prt("a[1].length is " + a[1].length);
		// prt("******************************\n");

		// // 3-D array with fixed length:
		int[][][] x = new int[2][2][4];
		int[][][] y = new int[323][][];
		// Can't do that!
		// int[][][] z = new int[323][][11];

		// Lengths
		prt("\nx.length is " + x.length);
		prt("x[0].length is " + x[0].length);
		prt("x[1].length is " + x[1].length);
		prt("x[0][0].length is " + x[0][0].length);
		prt("x[0][1].length is " + x[0][1].length);
		prt("x[1][0].length is " + x[1][0].length);
		prt("x[1][1].length is " + x[1][1].length);

		// Initialize 3-dim array
		int counter = 0;
		for (int i = 0; i < x.length; i++)
			for (int j = 0; j < x[i].length; j++)
				for (int k = 0; k < x[i][j].length; k++) {
					x[i][j][k] = ++counter;
				}

		// Print what is inside.
		for (int u = 0; u < x.length; u++) {
			for (int v = 0; v < x[u].length; v++) {
				System.out.print(u + "-" + v + ": ");
				for (int w = 0; w < x[u][v].length; w++) {
					prt(x[u][v][w]);
				}
				System.out.println();
			}
		}

		int[] a1 = { 2, 7, 8, 3, 9 };
		int[] a2 = { 5, 0, 8, 6, 1 };
		int[] a3 = { 3, 7, 4, 3, 9 };
		int[][] m = { a1, a2, a3 };
	}
}
