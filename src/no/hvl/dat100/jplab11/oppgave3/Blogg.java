package no.hvl.dat100.jplab11.oppgave3;

import no.hvl.annotations.Exercise;
import no.hvl.annotations.Remove;
import no.hvl.annotations.TransformOption;
import no.hvl.dat100.jplab11.oppgave1.*;

public class Blogg {

	@Exercise(id = {3,1}, transformOption = TransformOption.REMOVE_EVERYTHING)
	private int nesteledig;
	@Exercise(id = {3,1}, transformOption = TransformOption.REMOVE_EVERYTHING)
	private Innlegg[] innleggtabell;
	@Remove
	private static int LENGDE = 20;

	@Exercise(id = {3,2}, transformOption = TransformOption.REPLACE_BODY)
	public Blogg() {
		nesteledig = 0;
		innleggtabell = new Innlegg[LENGDE];
	}

	@Exercise(id = {3,2}, transformOption = TransformOption.REPLACE_BODY)
	public Blogg(int lengde) {
		nesteledig = 0;
		innleggtabell = new Innlegg[lengde];
	}

	@Exercise(id = {3,3}, transformOption = TransformOption.REPLACE_BODY)
	public int getAntall() {
		return nesteledig;
	}

	@Exercise(id = {3,4}, transformOption = TransformOption.REPLACE_BODY)
	public Innlegg[] getSamling() {
		return innleggtabell;
	}

	@Exercise(id = {3,5}, transformOption = TransformOption.REPLACE_BODY)
	public int finnInnlegg(Innlegg innlegg) {

		int index = -1;
		int i = 0;
		while (i < nesteledig && index < 0) {
			if (innleggtabell[i].erLik(innlegg)) {
				index = i;
			} else {
				i++;
			}
		}

		return index;
	}

	@Exercise(id = {3,6}, transformOption = TransformOption.REPLACE_BODY)
	public boolean finnes(Innlegg innlegg) {
		return (finnInnlegg(innlegg) >= 0);
	}

	@Exercise(id = {3,7}, transformOption = TransformOption.REPLACE_BODY)
	public boolean ledigPlass() {
		return (nesteledig < innleggtabell.length);
	}

	@Exercise(id = {3,8}, transformOption = TransformOption.REPLACE_BODY)
	public boolean leggTil(Innlegg innlegg) {

		boolean lagttil = false;
		
		if (!finnes(innlegg) && ledigPlass()) {
			innleggtabell[nesteledig] = innlegg;
			nesteledig++;
			lagttil = true;
		}
		
		return lagttil;
	}

	@Exercise(id = {3,9}, transformOption = TransformOption.REPLACE_BODY)
	public String toString() {
		String text = Integer.toString(nesteledig) + "\n";

		for (int i = 0; i < nesteledig; i++) {
			text = text + innleggtabell[i].toString();
		}

		return text;
	}

	@Exercise(id = {3,10}, transformOption = TransformOption.REPLACE_BODY)
	public void utvid() {
		Innlegg[] nytabell = new Innlegg[2 * innleggtabell.length];

		for (int i = 0; i < nesteledig; i++) {
			nytabell[i] = innleggtabell[i];
		}

		innleggtabell = nytabell;
	}

	@Exercise(id = {3,11}, transformOption = TransformOption.REPLACE_BODY)
	public boolean leggTilUtvid(Innlegg innlegg) {

		boolean lagttil = false;
		
		if (!finnes(innlegg)) {

			if (!ledigPlass()) {
				utvid();
			}

			innleggtabell[nesteledig] = innlegg;
			nesteledig++;
			lagttil = true;
		}
		
		return lagttil;
	}

	@Exercise(id = {3,12}, transformOption = TransformOption.REPLACE_BODY)
	public void slett(Innlegg innlegg) {
		
		int index = finnInnlegg(innlegg);
		
		if (index>=0) {
			innleggtabell[index] = innleggtabell[nesteledig-1];
			innleggtabell[nesteledig-1] = null;
			nesteledig--;
		}
	}

	@Exercise(id = {3,13}, transformOption = TransformOption.REPLACE_BODY)
	public int[] search(String keyword) {
		
		// TODO: get list of all entries from a given user
		return null;
	}
}