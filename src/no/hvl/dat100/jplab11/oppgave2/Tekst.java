package no.hvl.dat100.jplab11.oppgave2;

import no.hvl.annotations.Exercise;
import no.hvl.annotations.TransformOption;
import no.hvl.dat100.jplab11.oppgave1.*;

public class Tekst extends BlogPost {

	@Exercise(id={2,2}, transformOption = TransformOption.REMOVE_EVERYTHING)
	private String tekst;

	@Exercise(id={2,2}, transformOption = TransformOption.REPLACE_BODY)
	public Tekst(int id, String bruker, String dato, String tekst) {
		super(id, bruker, dato);
		this.tekst = tekst;
	}

	@Exercise(id={2,2}, transformOption = TransformOption.REPLACE_BODY)
	public Tekst(int id, String bruker, String dato, int likes, String tekst) {
		super(id, bruker, dato, likes);
		this.tekst = tekst;
	}

	@Exercise(id={2,2}, transformOption = TransformOption.REPLACE_BODY)
	public String getTekst() {
		return tekst;
	}

	@Exercise(id={2,2}, transformOption = TransformOption.REPLACE_BODY)
	public void setTekst(String tekst) {
		this.tekst = tekst;
	}

	@Exercise(id={2,2}, transformOption = TransformOption.REPLACE_BODY)
	@Override
	public String toString() {
		return "TEKST" + "\n" + super.toString() + tekst + "\n";

	}

	@Exercise(id={6,3}, transformOption = TransformOption.REPLACE_BODY)
	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
			
		return super.toHTML() + "\t\t<p>" + tekst + "<p>\n\t\t<hr>\n";
				
	}
}
