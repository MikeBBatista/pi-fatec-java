package fatec.pi.daos;

import java.sql.SQLException;
import java.sql.Statement;

import fatec.pi.entities.Client;

public class ClientDao {
	public static Integer save(Client client) {
		Integer res = 0;
		String sql = "Insert into CLIENT_REGISTER (CLIENT_CPF, "
				+ "CLIENT_NAME, "
				+ "CLIENT_ZIP_COD, "
				+ "CLIENT_STREET_NAME, "
				+ "CLIENT_STREET_NUMBER, "
				+ "CLIENT_STREET_COMPLEMENT, "
				+ "CLIENT_CITY, "
				+ "CLIENT_STATE, "
				+ "CLIENT_METER_NUMBER, "
				+ "CLIENT_MEASUREMENT_ORDER,"
				+ "CLIENT_LIGHT_CLASS,"
				+ "CLIENT_LIGHT_SUBCLASS,"
				+ "CLIENT_NORMAL_TAX,"
				+ "CLIENT_TRIBUTE_TAX,"
				+ "CLIENT_SUPPLIER_CNPJ) "
				+ "VALUES ('" + client.getClientCpf() + "', '"
				+ client.getClientName() + "', '"
				+ client.getZipCode() + "', '"
				+ client.getStreetName() + "', "
				+ client.getStreetNumber() + ", '"
				+ client.getStreetComplement() + "', '"
				+ client.getCity() + "', '"
				+ client.getState() + "', '"
				+ client.getMeterNumber() + "', '"
				+ client.getMeasurementOrder() + "', '"
				+ client.getLightClass() + "', '"
				+ client.getLightSubclass() + "', "
				+ client.getNormalTax() + ","
				+ client.getTributeTax() + ",'"
				+ client.getSupplierCnpj() + "')";
		
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