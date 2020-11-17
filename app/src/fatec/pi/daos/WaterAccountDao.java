package fatec.pi.daos;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

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
			
			result = saveValues.executeUpdate();

		}
		catch(SQLException err) {
			System.out.println(err);
		}
		return result;
	}	
	
	public static List<WaterAccount> listWaterAccounts() {
		
		String sql = "Select * from WATER_ACCOUNT";
		List<WaterAccount> WaterAccountList = new ArrayList<>();
		
		try {
			BaseConnection con = new BaseConnection();
			PreparedStatement st = con.connection.prepareStatement(sql);
			
		
			ResultSet result = st.executeQuery();
			
			
			while(result.next()) {
				
				Integer id           = result.getInt("ACCOUNT_ID");
				String accountNumber = result.getString("ACCOUNT_NUMBER");
				String      dueDate  = result.getString("ACCOUNT_DUE_DATE");
				BigDecimal	penalty  = result.getBigDecimal("ACCOUNT_PENALTY");
				BigDecimal  consumpition = result.getBigDecimal("ACCOUNT_CONSUMPTION");
				BigDecimal	polluition  = result.getBigDecimal("ACCOUNT_POLLUTION");
				BigDecimal  sewer = result.getBigDecimal("ACCOUNT_SEWER");
				BigDecimal	water = result.getBigDecimal("ACCOUNT_WATER");
				Integer     pis      = result.getInt("ACCOUNT_PIS");
				BigDecimal	other = result.getBigDecimal("ACCOUNT_OTHERS");
				String      sup  = result.getString("ACCOUNT_SUPPLIER_CNPJ");
				
				
				WaterAccount wat = new WaterAccount(id,accountNumber, dueDate, penalty,consumpition,polluition,sewer,water,pis,other,sup);
				WaterAccountList.add(wat);
				System.out.println(wat.toString());

			}
		}
		catch(SQLException err) {
			System.out.println(err);
		}
		return WaterAccountList;
	}
}
