
package jeudes;

public class JoueurBean {

	private long id;
	private int scorePartie;
	private String nom;
	private GobeletBean gobelet;
	private boolean tricheur;

	public JoueurBean(String nom) {
		this.nom = nom;
		gobelet = new GobeletBean();
		scorePartie = 0;
		tricheur = false;
	}

	public void lancer() {
		gobelet.lancer();
	}

	public void ajouter1pt() {
		scorePartie++;
	}

	public void setTricheur(boolean tricheur) {
		this.tricheur = tricheur;
		gobelet = new GobeletBean(tricheur);

	}

	// -------------------
	// GETTER / SETTER
	// -------------------

	public boolean isTricheur() {
		return tricheur;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getId() {
		return id;
	}

	public int getScorePartie() {
		return scorePartie;
	}

	public void setScorePartie(int scorePartie) {
		this.scorePartie = scorePartie;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public GobeletBean getGobelet() {
		return gobelet;
	}

	public void setGobelet(GobeletBean gobelet) {
		this.gobelet = gobelet;
	}

}
