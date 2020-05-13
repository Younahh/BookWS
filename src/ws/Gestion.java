package ws;

import beans.Livre;
import beans.Panier;
import beans.User;
import dao.LivreDAO;
import dao.PanierDAO;
import dao.UserDAO;


public class Gestion {
	
	public Livre chercherLivreId(int id) {
		return LivreDAO.chercherLivreId(id);
	}
	
	public Livre chercherLivre(String nom) {
		return LivreDAO.chercherLivre(nom);
	}
	
	public Livre[] chercherLivreCategorie(String categorie) {
		return LivreDAO.chercherLivreCategorie(categorie);
	}
	
	public Livre[] chercherLivreNouveautes() {
		return LivreDAO.chercherLivreNouveautes();
	}
	
	public void ajouterLivre(Livre livre) {
		LivreDAO.ajouterLivre(livre);
	}
	
	public void modifierLivre(int id) {
		LivreDAO.modifierLivre(id);
	}
	
	public void modifierLivreNbr(int id) {
		LivreDAO.modifierLivreNbr(id);
	}
	
	public void supprimerLivre(int id) {
		LivreDAO.supprimerLivre(id);
	}
	
	public User authentifierUser(String email, String password) {
		return UserDAO.authentifierUser(email, password);
	}
	
	public User chercherUser(String email) {
		return UserDAO.chercherUser(email);
	}
	
	public void ajouterUser(User user) {
		UserDAO.ajouterUser(user);
	}
	
	public void modifierUser(int id) {
		UserDAO.modifierUser(id);
	}
	
	public void supprimerUser(int id) {
		UserDAO.supprimerUser(id);
	}
	
	public Panier[] chercherPanier(int idd) {
		return PanierDAO.chercherPanier(idd);
	}
	
	public void ajouterPanier(Panier panier) {
		PanierDAO.ajouterPanier(panier);
	}
	
	public void supprimerPanierIdd(int idd) {
		PanierDAO.supprimerPanierIdd(idd);
	}
	
	public void supprimerPanier(int id) {
		PanierDAO.supprimerPanier(id);
	}

}
