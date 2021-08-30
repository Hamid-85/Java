
package Tag3;

import Prog1Tools.IOTools;

public class Mitgliedbeitrag {

	public static void main(String[] args) {
		// Mietgeliedbeitrag
		// verheiratet studiert
		// false false 300
		// true false 220
		// false true 180
		// true true 100
		char verheiratet = 'j';
		char studiert = 'j';
		double beitrag = 0;
		// Eingabe
		verheiratet = IOTools.readChar("verheiratet (j/n) eingeben:");
		studiert = IOTools.readChar("studiert (j/n) eingeben:");
		// Berechnung Entscheidung
//		if (verheiratet == 'n' && studiert == 'n')
//			beitrag = 300.0d;
//		if (verheiratet == 'j' && studiert == 'n')
//			beitrag = 220.0d;
//		if (verheiratet == 'n' && studiert == 'j')
//			beitrag = 180.0d;
//		if (verheiratet == 'j' && studiert == 'j')
//			beitrag = 100.0d;
		// Variante 2

		if (verheiratet == 'n') {
			if (studiert == 'n') {
				beitrag = 300.0d;
			} else {
				beitrag = 180.0d;
			}
		} else {
			if (studiert == 'n') {
			beitrag = 220.0d;
		} else {
				beitrag = 100.0d;
			}
		} // System.out.println("Seite c:"+c);

		System.out.printf("Migliedbeitrag: %5.2f\n", beitrag);
		
		
	} 

}
