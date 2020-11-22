package fatec.pi.daos;

import java.sql.SQLException;
import java.sql.PreparedStatement;

import fatec.pi.entities.Installation;

public class InstallationDao {
	public static Integer save(Installation installation) {
		Integer result = 0;
		String sql = "Insert into INSTALL (INSTALL_NUMBER INTEGER, "
				+ "INSTALL_LIGHT_SUB_CLASS, "
				+ "INSTALL_LIGHT_READ, "
				+ "INSTALL_LIGHT_TARIFF_WITHOUT_TAX, "
				+ "INSTALL_LIGHT_CLASS, "
				+ "INSTALL_WATER_TYPE,) "
				+ "VALUES (?, ?, ?, ?, ?, ?)"; 

		try {
			BaseConnection con = new BaseConnection();
			PreparedStatement saveValues = con.connection.prepareStatement(sql);
			
			saveValues.setInt(1, installation.getInstallationNumber());
			saveValues.setString(2, installation.getSubClass());
			saveValues.setString(3, installation.getReadSchedule());
			saveValues.setBigDecimal(4, installation.getFreeTaxFare());
			saveValues.setString(5, installation.getMainClass());
			saveValues.setString(6, installation.getInstallationType());
			
			result = saveValues.executeUpdate();
		}
		catch(SQLException err) {
			System.out.println(err);
		}
		return result;
	}
}

 