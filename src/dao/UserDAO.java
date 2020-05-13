package dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import beans.User;
import utils.DBInteraction;

public class UserDAO {
	
	public static User authentifierUser(String email, String password) {
		Boolean result = false;
		try {
			DBInteraction.connect();
			ResultSet res=DBInteraction.Select("select * from utilisateur where email='"+email+"' and password='"+password+"'");
            result = res.next();
        } catch (SQLException e) {
            e.printStackTrace();
        } 
        if(result){
        	return chercherUser(email);
        }
        return null;
	}	
	
	public static User chercherUser(String email) {
		User user = null;
		DBInteraction.connect();    
		ResultSet res = DBInteraction.Select("select * from utilisateur where email='"+email+"'");
		   try {
			   if(res.next())
				user = new User(res.getInt("id"),res.getString("nom"),res.getString("prenom"),res.getInt("phone"),"email",res.getString("password"));
		   } catch (SQLException e) {
			   e.printStackTrace();
		   }
		   DBInteraction.disconnect();
		   return user;
	}
	
	public static void ajouterUser(User user) {
		String nom = user.getNom();
		String prenom = user.getPrenom();
		int phone = user.getPhone();
		String email = user.getEmail();
		String password = user.getPassword();
		DBInteraction.connect();
		DBInteraction.Maj("insert into utilisateur (nom, prenom, phone, email, password) value ('"+nom+"' , '"+prenom+"' ,'"+phone+"' , '"+email+"' , '"+password+"')");
		DBInteraction.disconnect();
	}
	
	public static void modifierUser(int id) {
		User user = new User();
		String nom = user.getNom();
		String prenom = user.getPrenom();
		int phone = user.getPhone();
		String email = user.getEmail();
		String password = user.getPassword();
		DBInteraction.connect();
		DBInteraction.Maj("update utilisateur set nom = '"+nom+"', prenom = '"+prenom+"', phone = '"+phone+"' , email = '"+email+"', password = '"+password+"' where id = "+id+"");
		DBInteraction.disconnect();
	}
	
	public static void supprimerUser(int id) {
		DBInteraction.connect();
		DBInteraction.Maj("delete from utilisateur where id = "+id+"");
		DBInteraction.disconnect();
		
	}

}
