package utils;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBInteraction {
	static java.sql.Connection con;
	static Statement st;
	public static void connect()
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://127.0.0.1/livres";
			 con = DriverManager.getConnection(url,"root","");
			 st=con.createStatement();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}
	public static void disconnect()
	{
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static int Maj(String sql)
	{
		int nb=0;
		try {
			 nb=st.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return nb;
	}
	public static ResultSet Select(String sql)
	{
		ResultSet rs = null;
		try {
			rs = st.executeQuery(sql);
		} catch (SQLException  e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}

}
