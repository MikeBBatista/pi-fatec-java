package fatec.pi.daos;

import java.sql.SQLException;
import java.sql.PreparedStatement;
import fatec.pi.entities.Client;

public class ClientDao {
	public static Integer save(Client client) {
		Integer result = 0;
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
				+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		
		try {
			BaseConnection con = new BaseConnection();
			PreparedStatement saveValues = con.connection.prepareStatement(sql); // mudança de Statement para PreparedStatement
			
			// usar o method set do preparedStatement para tratar os dados fornecidos pelo usuário antes de mandar para o SQL
			saveValues.setString(1, client.getClientCpf());
			saveValues.setString(2, client.getClientName());
			saveValues.setString(3, client.getZipCode());
			saveValues.setString(4, client.getStreetName());
			saveValues.setInt(5, client.getStreetNumber());
			saveValues.setString(6, client.getStreetComplement());
			saveValues.setString(7, client.getCity());
			saveValues.setString(8, client.getState());
			saveValues.setString(9, client.getMeterNumber());
			saveValues.setString(10, client.getMeasurementOrder());
			saveValues.setString(11, client.getLightClass());
			saveValues.setString(12, client.getLightSubclass());
			saveValues.setBigDecimal(13, client.getNormalTax());
			saveValues.setBigDecimal(14, client.getTributeTax());
			saveValues.setString(15, client.getSupplierCnpj());
			
			result = saveValues.executeUpdate();
		}
		catch(SQLException err) {
			System.out.println(err);
		}
		return result;
	}
}