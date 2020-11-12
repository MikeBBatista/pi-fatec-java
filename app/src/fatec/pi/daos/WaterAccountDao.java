package fatec.pi.daos;

import java.sql.SQLException;
import java.sql.PreparedStatement;
import fatec.pi.entities.WaterAccount;

public class WaterAccountDao {
	public static Integer save(WaterAccount water) {
		Integer result = 0;
		String sql = "Insert into WATER_ACCOUNT (ACCOUNT_NUMBER, "
				+ "ACCOUNT_DUE_DATE, "
				+ "ACCOUNT_PENALTY, "
				+ "ACCOUNT_CONSUMPTION, "
				+ "ACCOUNT_POLLUTION, "
				+ "ACCOUNT_SEWER, "
				+ "ACCOUNT_WATER, "
				+ "ACCOUNT_PIS, "
				+ "ACCOUNT_OTHERS, "
				+ "ACCOUNT_SUPPLIER_CNPJ) "
				+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)"; 

		try {
			BaseConnection con = new BaseConnection();
			PreparedStatement saveValues = con.connection.prepareStatement(sql);
			
			saveValues.setString(1, water.getNumber());
			saveValues.setString(2, water.getDueDate());
			saveValues.setBigDecimal(3, water.getPenalty());
			saveValues.setBigDecimal(4, water.getConsumptionValue());
			saveValues.setBigDecimal(5, water.getPollutionValue());
			saveValues.setBigDecimal(6, water.getSewerValue());
			saveValues.setBigDecimal(7, water.getWaterValue());
			saveValues.setInt(8, water.getPisPercentage());
			saveValues.setBigDecimal(9, water.getOtherValues());
			saveValues.setString(10, water.getSupplierCnpj());
			
			result = saveValues.executeUpdate(sql);
		}
		catch(SQLException err) {
			System.out.println(err);
		}
		return result;
	}
}
