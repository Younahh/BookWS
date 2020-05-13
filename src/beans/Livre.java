package beans;

public class Livre {
	private int id;
	private String categorie;
	private String nom;
	private String auteur;
	private String description;
	private int prix;
	private String image;
	private int nbr;
	
	public Livre(int id, String categorie, String nom, String auteur, String description, int prix, String image, int nbr) {
		super();
		this.id = id;
		this.categorie = categorie;
		this.nom = nom;
		this.auteur = auteur;
		this.description = description;
		this.prix = prix;
		this.image = image;
		this.nbr = nbr;
	}

	public Livre() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getCategorie() {
		return categorie;
	}

	public void setCategorie(String categorie) {
		this.categorie = categorie;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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
	
	public int getNbr() {
		return nbr;
	}

	public void setNbr(int nbr) {
		this.nbr = nbr;
	}

	@Override
	public String toString() {
		return "Livre [id=" + id + ", categorie=" + categorie + ", nom=" + nom + ", auteur=" + auteur + ", description="
				+ description + ", prix=" + prix + ", image=" + image + ", nbr=" + nbr + "]";
	}
	
	

}
