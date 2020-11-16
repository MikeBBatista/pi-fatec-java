package fatec.pi.daos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import fatec.pi.entities.User;

public class UserDao {
	public static Integer save(User user) {
		Integer result = 0;
		String sql = "Insert into USER(USER_NAME, USER_EMAIL, USER_PASSWORD, USER_ADMIN) VALUES (?, ?, ?, ?)";
		
		try {
			BaseConnection con = new BaseConnection();
			PreparedStatement saveValues = con.connection.prepareStatement(sql);
			
			saveValues.setString(1, user.getName());
			saveValues.setString(2, user.getEmail());
			saveValues.setString(3, user.getPassword());
			saveValues.setBoolean(4, user.getAdmin());
			
			result = saveValues.executeUpdate();
			con.connection.close();
		}
		catch(SQLException err) {
			System.out.println(err);
		}
		return result;
	}
	
	public static String checkLogin(String email, String password) {

		String sql = "Select * from USER WHERE USER_EMAIL = ? AND USER_PASSWORD = ?";
		String user = "";
		
		try {
			BaseConnection con = new BaseConnection();
			PreparedStatement listUser = con.connection.prepareStatement(sql);
			
			listUser.setString(1, email);
			listUser.setString(2, password);
			
			ResultSet result = listUser.executeQuery();
			
			if (result.next()) {
				user = result.getString("USER_ADMIN").toString();
			}
			
		}
		catch(SQLException err) {
			System.out.println(err);
		}
		return user;
	}
}