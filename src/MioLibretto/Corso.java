package MioLibretto;

public class Corso implements Comparable<Corso>{

	String nome;
	int crediti;
	double voto;
	
	public Corso(String nome, int crediti, double voto) {
		this.nome = nome;
		this.crediti = crediti;
		this.voto = voto;
	}

	@Override
	public int compareTo(Corso o) {
		return (int) (this.voto-o.voto);
	}
	
}
