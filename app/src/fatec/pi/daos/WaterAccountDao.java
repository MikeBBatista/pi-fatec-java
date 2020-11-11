package fatec.pi.daos;

import java.sql.SQLException;
import java.sql.Statement;

import fatec.pi.entities.WaterAccount;

public class WaterAccountDao {
	public static Integer save(WaterAccount water) {
		Integer res = 0;
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
				+ "VALUES ('" + water.getNumber() + "', '"
				+ water.getDueDate() + "', "
				+ water.getPenalty() + ", "
				+ water.getConsumptionValue() + ", "
				+ water.getPollutionValue() + ", "
				+ water.getSewerValue() + ", "
				+ water.getWaterValue() + ", "
				+ water.getPisPercentage() + ", "
				+ water.getOtherValues() + ",'"
				+ water.getSupplierCnpj() + "')";
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
