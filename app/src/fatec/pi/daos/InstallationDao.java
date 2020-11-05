package fatec.pi.daos;

import java.sql.SQLException;
import java.sql.Statement;

import fatec.pi.entities.Installation;
import fatec.pi.entities.WaterAccount;

public class InstallationDao {
	public static Integer save(Installation installation) {
		Integer res = 0;
		String sql = "Insert into INSTALL (INSTALL_NUMBER INTEGER, "
				+ "INSTALL_LIGHT_SUB_CLASS, "
				+ "INSTALL_LIGHT_READ, "
				+ "INSTALL_LIGHT_TARIFF_WITHOUT_TAX, "
				+ "INSTALL_LIGHT_CLASS, "
				+ "INSTALL_WATER_TYPE,) "
				+ "VALUES ('" + installation.getInstallationNumber() + "', '"
				+ installation.getSubClass() + "', "
				+ installation.getReadSchedule() + ", "
				+ installation.getFreeTaxFare() + ", "
				+ installation.getMainClass() + ", "
				+ installation.getInstallationType() + "')";
		try {
			BaseConnection con = new BaseConnection();
			Statement st = con.connection.createStatement();
			
			res = st.executeUpdate(sql);
		}
		catch(SQLException err) {
			System.out.println(err);
		}
		return res;
	}
}

 