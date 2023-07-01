package MioLibretto;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		//aggiunta corsi

		List<Corso> c = new ArrayList<>();
		c.add(new Corso("Algebra lineare e geometria",10,30));
		c.add(new Corso("Analisi matematica I",10,20));
		c.add(new Corso("Analisi matematica II",8,21));
		c.add(new Corso("Basi di dati",8,30));
		c.add(new Corso("Benessere digitale (Grandi Sfide - Tecnologie e Umanità)",6,30));
		c.add(new Corso("Calcolo numerico: metodi e software",6,30));
		c.add(new Corso("Chimica",8,27));
		c.add(new Corso("Economia e organizzazione aziendale",8,24));
		c.add(new Corso("Elementi di diritto privato",8,24));
		c.add(new Corso("Fisica I",10,24));
		c.add(new Corso("Fisica II",6,21));
		c.add(new Corso("Informatica",8,26));
		c.add(new Corso("Programmazione a oggetti",8,30));
		c.add(new Corso("Ricerca operativa",8,26));
		c.add(new Corso("Sistemi di produzione",8,30));
		c.add(new Corso("Sistemi elettrici industriali",8,29));
		c.add(new Corso("Sistemi telematici",8,20));
		c.add(new Corso("Statistica",10,26));
		c.add(new Corso("Programmazione e gestione della produzione",10,19));
		c.add(new Corso("Tecniche di programmazione",10,25));
		c.add(new Corso("Progettazione di servizi web e reti di calcolatori",8,26));
		
		//calcolo media di laurea comlessiva
		double numC=0;
		double denC=0;
		for (int i=0;i<c.size();i++) {
			numC=numC+c.get(i).voto*c.get(i).crediti;
			denC=denC+c.get(i).crediti;
		}
		double mediaC = numC/denC;
		System.out.println("Media di laurea complessiva");
		System.out.println(mediaC);
		System.out.println(mediaC*11/3);
		
		//calcolo media di laurea depurata
		double numD=0;
		double denD=0;
		LinkedList<Corso> copia = new LinkedList<Corso>();
		copia.addAll(c);
		copia.sort(null);
		int cont=0;
		for (int i=0;i<copia.size();i++) {
			if (cont<16 && copia.get(i).crediti<=(16-cont)) {
				cont=cont+copia.get(i).crediti;
				copia.get(i).crediti=0;
			}
			else if (cont<16 && copia.get(i).crediti>(16-cont)) {
				copia.get(i).crediti=copia.get(i).crediti-(16-cont);
				cont=16;
			}
		}
		for (int i=0;i<copia.size();i++) {
			numD=numD+copia.get(i).voto*copia.get(i).crediti;
			denD=denD+copia.get(i).crediti;
		}
		double mediaD = numD/denD;
		System.out.println("\nMedia di laurea depurata");
		System.out.println(mediaD);
		System.out.println(mediaD*11/3);
				
	}

}
