package fatec.pi.daos;

import java.sql.PreparedStatement;
import java.sql.SQLException;

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
		}
		catch(SQLException err) {
			System.out.println(err);
		}
		return result;
	}
}
