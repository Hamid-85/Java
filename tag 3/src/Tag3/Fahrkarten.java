package Tag3;
import Prog1Tools.IOTools;

public class Fahrkarten {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//wie viel Fahrkarten
		int fahrkartenzahl;
		//was kostet eine fahrkarte
		double fahrkartenpreis;
		//gibt es rabatt und wie viel
		double rabatt;
		double einzelpreis=10.0d;
		double gesamtpreis=30.0d;
		fahrkartenzahl=IOTools.readInt("Bitte Anzahl der Fahrkarten eingeben");
		fahrkartenpreis=IOTools.readDouble("Bitte Fahrkartenpreis (>=0)eingeben");
		rabatt=IOTools.readDouble();
		einzelpreis=(100-rabatt)/100*fahrkartenpreis;
		gesamtpreis=einzelpreis*fahrkartenpreis;

		System.out.println("einzelpreis:"+einzelpreis);
		System.out.println("gesamtpreis:"+gesamtpreis);

	}

}
