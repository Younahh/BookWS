package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import beans.Livre;
import utils.DBInteraction;

public class LivreDAO {
	
	public static Livre chercherLivreId(int id) {
		Livre livre = null;
		DBInteraction.connect();    
		ResultSet res = DBInteraction.Select("select * from livre where id = '"+id+"'");
		   try {
			   if(res.next())
				livre = new Livre(res.getInt("id"),res.getString("categorie"),res.getString("nom"),res.getString("auteur"),res.getString("description"),
						res.getInt("prix"),res.getString("image"),res.getInt("nbr"));
		   } catch (SQLException e) {
			   e.printStackTrace();
		   }
		   DBInteraction.disconnect();
		   return livre;
	}
	
	public static Livre chercherLivre(String nom) {
		Livre livre = null;
		DBInteraction.connect();    
		ResultSet res = DBInteraction.Select("select * from livre where nom like '"+nom+"%'");
		   try {
			   if(res.next())
				livre = new Livre(res.getInt("id"),res.getString("categorie"),res.getString("nom"),res.getString("auteur"),res.getString("description"),
						res.getInt("prix"),res.getString("image"),res.getInt("nbr"));
		   } catch (SQLException e) {
			   e.printStackTrace();
		   }
		   DBInteraction.disconnect();
		   return livre;
	}
	
	public static Livre[] chercherLivreCategorie(String categorie) {
		ArrayList<Livre> livre = new ArrayList<Livre>();
		int i = 0;
		DBInteraction.connect();    
		ResultSet res = DBInteraction.Select("select * from livre where categorie='"+categorie+"'");
		   try {			   
			   while(res.next()) {
				livre.add(new Livre(res.getInt("id"),categorie,res.getString("nom"),res.getString("auteur"),res.getString("description"),
						res.getInt("prix"),res.getString("image"),res.getInt("nbr")));
			    }
		   } catch (SQLException e) {
			   e.printStackTrace();
		   }
		   DBInteraction.disconnect();
		   Livre[] livres = new Livre[livre.size()];
		   for (Livre l : livre) {
			   livres[i] = l;
			   i++;
		   }
		   return livres;
	}
	
	public static Livre[] chercherLivreNouveautes() {
		ArrayList<Livre> livre = new ArrayList<Livre>();
		int i = 0;
		DBInteraction.connect();    
		ResultSet res = DBInteraction.Select("select * from livre order by nbr DESC limit 10");
		   try {
			   while(res.next()) {
				livre.add(new Livre(res.getInt("id"),res.getString("categorie"),res.getString("nom"),res.getString("auteur"),res.getString("description"),
						res.getInt("prix"),res.getString("image"),res.getInt("nbr")));
			   }
		   } catch (SQLException e) {
			   e.printStackTrace();
		   }
		   DBInteraction.disconnect();
		   Livre[] livres = new Livre[livre.size()];
		   for (Livre l : livre) {
			   livres[i] = l;
			   i++;
		   }
		   return livres;
	}
	
	public static void ajouterLivre(Livre livre) {
		String categorie = livre.getCategorie();
		String nom = livre.getNom();
		String auteur = livre.getAuteur();
		String description = livre.getDescription();
		int prix = livre.getPrix();
		String image = livre.getImage();
		int nbr = livre.getNbr();
		DBInteraction.connect();
		DBInteraction.Maj("insert into livre (categorie, nom, auteur, description, prix, image, nbr) value ('"+categorie+"' , '"+nom+"' , '"+auteur+"' , '"+description+"' , '"+prix+"' , '"+image+"' , '"+nbr+"')");
		DBInteraction.disconnect();
	}
	
	public static void modifierLivre(int id) {
		Livre livre = new Livre();
		String categorie = livre.getCategorie();
		String nom = livre.getNom();
		String auteur = livre.getAuteur();
		String description = livre.getDescription();
		int prix = livre.getPrix();
		String image = livre.getImage();
		int nbr = livre.getNbr();
		DBInteraction.connect();
		DBInteraction.Maj("update livre set categorie = '"+categorie+"' , nom = '"+nom+"', auteur = '"+auteur+"', description = '"+description+"', prix = "+prix+", image = '"+image+"', nbr = '"+nbr+"' where Id = "+id+"");
		DBInteraction.disconnect();
	}
	
	public static void modifierLivreNbr(int id) {
		Livre livre = new Livre();
		int nbr = livre.getNbr();
		DBInteraction.connect();
		DBInteraction.Maj("update livre set nbr = '"+nbr+"' where id = "+id+"");
		DBInteraction.disconnect();
	}
	
	public static void supprimerLivre(int id) {
		DBInteraction.connect();
		DBInteraction.Maj("delete from Livre where id = "+id+"");
		DBInteraction.disconnect();
		
	}

}
