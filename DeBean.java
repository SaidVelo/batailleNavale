package jeudes;

import java.util.Random;

public class DeBean {

	protected int value;
	private int taille;
	protected static final Random RANDOM = new Random();

	public DeBean() {
		this(6);
	}

	public DeBean(int taille) {
		this.taille = taille;
	}

	public void lancer() {
		value = RANDOM.nextInt(taille) + 1;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

}
