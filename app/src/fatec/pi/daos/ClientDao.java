package fatec.pi.daos;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
	
	public static List<Client> listClients(){
		List<Client> clientList = new ArrayList<>();
		String sql = "Select * from CLIENT_REGISTER";
		try {
			BaseConnection con = new BaseConnection();
			PreparedStatement st = con.connection.prepareStatement(sql);
			
			st.executeQuery(sql);
			ResultSet rs = st.getResultSet();
			
			while (rs.next()) {
				Client clt = new Client(
						rs.getInt("CLIENT_ID"),
						rs.getString("CLIENT_CPF"),
						rs.getString("CLIENT_SUPPLIER_CNPJ"),
						rs.getString("CLIENT_NAME"),
						rs.getString("CLIENT_ZIP_COD"),
						rs.getString("CLIENT_STREET_NAME"),
						rs.getInt("CLIENT_STREET_NUMBER"),
						rs.getString("CLIENT_STREET_COMPLEMENT"),
						rs.getString("CLIENT_CITY"),
						rs.getString("CLIENT_STATE"),
						rs.getString("CLIENT_METER_NUMBER"),
						rs.getString("CLIENT_MEASUREMENT_ORDER"),
						rs.getString("CLIENT_LIGHT_CLASS"),
						rs.getString("CLIENT_LIGHT_SUBCLASS"),
						rs.getBigDecimal("CLIENT_NORMAL_TAX"),
						rs.getBigDecimal("CLIENT_TRIBUTE_TAX"));
				clientList.add(clt);
								
			}
		}
		catch(SQLException err) {
			System.out.println(err);
		}
		return clientList;
		
	}

}
