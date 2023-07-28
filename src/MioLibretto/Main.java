package MioLibretto;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		//aggiunta corsi

		List<Corso> c = new ArrayList<>();
		
		
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
