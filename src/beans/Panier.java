package beans;

public class Panier {
	private int id;
	private int idd;
	private String nom;
	private String auteur;
	private int quantite;
	private int prix;
	private String image;
	
	public Panier(int id, int idd, String nom, String auteur, int quantite, int prix, String image) {
		super();
		this.id = id;
		this.idd = idd;
		this.nom = nom;
		this.auteur = auteur;
		this.quantite = quantite;
		this.prix = prix;
		this.image = image;
	}

	public Panier() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdd() {
		return idd;
	}

	public void setIdd(int idd) {
		this.idd = idd;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public int getPrix() {
		return prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

}
