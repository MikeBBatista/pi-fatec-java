package fatec.pi.daos;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import fatec.pi.entities.LightAccount;

public class LightAccountDao {
	
	public static Integer save(LightAccount light) {
		
		Integer result = 0;
		String sql = "Insert into LIGHT_ACCOUNT (ACCOUNT_IDENT_COD, "
				+ "ACCOUNT_CLIENT_METER_NUMBER, "
				+ "ACCOUNT_INVOICE, "
				+ "ACCOUNT_CURRENT_DATE, "
				+ "ACCOUNT_DUE_DATE, "
				+ "ACCOUNT_CONSUMPTION_DAYS, "
				+ "ACCOUNT_FLAG_TYPE, "
				+ "ACCOUNT_CONSUMPTION_VALUE, "
				+ "ACCOUNT_PIS_PERCENTAGE, "
				+ "ACCOUNT_COFINS_PERCENTAGE, "
				+ "ACCOUNT_ICMS_BASIS, "
				+ "ACCOUNT_ICMS_PERCENTAGE, "
				+ "ACCOUNT_ICMS_VALUE, "
				+ "ACCOUNT_PIS_COFINS_BASIS, "
				+ "ACCOUNT_PIS_VALUE, "
				+ "ACCOUNT_COFINS_VALUE, "
				+ "ACCOUNT_FORFEIT_VALUE, "
				+ "ACCOUNT_INTEREST_VALUE, "
				+ "ACCOUNT_OTHER_VALUES, "
				+ "ACCOUNT_SUPPLY_VALUES, "
				+ "ACCOUNT_FINANCIAL_ITEMS, "
				+ "ACCOUNT_AMOUNT, "
				+ "ACCOUNT_SUPPLIER_CNPJ) "
				+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		
		try {
			BaseConnection con = new BaseConnection();
			PreparedStatement saveValues = con.connection.prepareStatement(sql);
			
			saveValues.setInt(1, light.getIdentCod());
			saveValues.setString(2, light.getMeterNumber());
			saveValues.setString(3, light.getInvoice());
			saveValues.setString(4, light.getCurrentDate());
			saveValues.setString(5, light.getDueDate());
			saveValues.setInt(6, light.getConsumptionDays());
			saveValues.setString(7, light.getFlagType());
			saveValues.setBigDecimal(8, light.getConsumptionValue());
			saveValues.setBigDecimal(9, light.getPisPercentage());
			saveValues.setBigDecimal(10, light.getCofinsPercentage());
			saveValues.setBigDecimal(11, light.getIcmsBasis());
			saveValues.setBigDecimal(12, light.getIcmsPercentage());
			saveValues.setBigDecimal(13, light.getIcmsValue());
			saveValues.setBigDecimal(14, light.getPisCofinsBasis());
			saveValues.setBigDecimal(15, light.getPisValue());
			saveValues.setBigDecimal(16, light.getCofinsValue());
			saveValues.setBigDecimal(17, light.getForfeitValue());
			saveValues.setBigDecimal(18, light.getInterestValue());
			saveValues.setBigDecimal(19, light.getOtherValues());
			saveValues.setBigDecimal(20, light.getSupplyValue());
			saveValues.setBigDecimal(21, light.getFinancialItems());
			saveValues.setBigDecimal(22, light.getAmount());
			saveValues.setString(23, light.getSupplierCnpj());
			
			result = saveValues.executeUpdate();
		}
		catch(SQLException err) {
			System.out.println(err);
		}
		
		return result;
	}		
	
	}
	
	public static List<LightAccount> listLightAccounts(){
		List<LightAccount> lightList = new ArrayList<>();
		String sql = "Select * from LIGHT_ACCOUNT";
		try {
			BaseConnection con = new BaseConnection();
			PreparedStatement st = con.connection.prepareStatement(sql);
			
			st.executeQuery(sql);
			ResultSet rs = st.getResultSet();
			
			while (rs.next()) {
				LightAccount light = new LightAccount(
						rs.getInt("ACCOUNT_ID"),
						rs.getInt("ACCOUNT_IDENT_COD"),
						rs.getString("ACCOUNT_METER_NUMBER"),
						rs.getString("ACCOUNT_INVOICE"),
						rs.getString("ACCOUNT_CURRENT_DATE"),
						rs.getString("ACCOUNT_DUE_DATE"),
						rs.getInt("ACCOUNT_CONSUMPTION_DAYS"),
						rs.getString("ACCOUNT_FLAG_TYPE"),
						rs.getBigDecimal("ACCOUNT_CONSUMPTION_VALUE"),
						rs.getBigDecimal("ACCOUNT_PIS_PERCENTAGE"),
						rs.getBigDecimal("ACCOUNT_COFINS_PERCENTAGE"),
						rs.getBigDecimal("ACCOUNT_ICMS_BASIS"),
						rs.getBigDecimal("ACCOUNT_ICMS_PERCENTAGE"),
						rs.getBigDecimal("ACCOUNT_ICMS_VALUE"),
						rs.getBigDecimal("ACCOUNT_PIS_COFINS_BASIS"),
						rs.getBigDecimal("ACCOUNT_PIS_VALUE"),
						rs.getBigDecimal("ACCOUNT_COFINS_VALUE"),
						rs.getBigDecimal("ACCOUNT_FORFEIT_VALUE"),
						rs.getBigDecimal("ACCOUNT_INTEREST_VALUE"),
						rs.getBigDecimal("ACCOUNT_OTHER_VALUES"),
						rs.getBigDecimal("ACCOUNT_SUPPLY_VALUES"),
						rs.getBigDecimal("ACCOUNT_FINANCIAL_ITEMS"),
						rs.getBigDecimal("ACCOUNT_AMOUNT"),
						rs.getString("ACCOUNT_SUPPLIER_CNPJ"),sql);
				lightList.add(light);
				
			}
		}
		catch(SQLException err) {
			System.out.println(err);
		}
		return lightList;
		
	}
		public static Integer update(LightAccount light) {
		
				String sql = "UPDATE LIGHT_ACCOUNT SET (ACCOUNT_IDENT_COD = ?,"
				+ "ACCOUNT_CLIENT_METER_NUMBER = ?, "
				+ "ACCOUNT_INVOICE = ?, "
				+ "ACCOUNT_CURRENT_DATE = ?, "
				+ "ACCOUNT_CONSUMPTION_DAYS= ?, "
				+ "ACCOUNT_FLAG_TYPE, = ?, "
				+ "ACCOUNT_CONSUMPTION_VALUE = ?, "
				+ "ACCOUNT_PIS_PERCENTAGE = ?, "
				+ "ACCOUNT_COFINS_PERCENTAGE = ?, "
				+ "ACCOUNT_ICMS_BASIS = ? "
				+ "ACCOUNT_ICMS_PERCENTAGE = ?,"
				+ "ACCOUNT_ICMS_VALUE = ?, "
				+ "ACCOUNT_PIS_COFINS_BASIS = ?, "
				+ "ACCOUNT_PIS_VALUE = ?, "
				+ "ACCOUNT_COFINS_VALUE = ?, "
				+ "ACCOUNT_FORFEIT_VALUE = ?, "
				+ "ACCOUNT_INTEREST_VALUE = ?, "
				+ "ACCOUNT_OTHER_VALUES = ?, "
				+ "ACCOUNT_SUPPLY_VALUES = ?, "
				+ "ACCOUNT_FINANCIAL_ITEMS = ?, "
				+ "ACCOUNT_AMOUNT = ?, "
				+ "ACCOUNT_SUPPLIER_CNPJ = ?)"
				+ "WHERE ACCOUNT_ID = ?;";
		
		try {
			
			BaseConnection con = new BaseConnection();
			PreparedStatement updateValues = con.connection.prepareStatement(sql);
			
			updateValues.setInt(1, id);
			updateValues.setInt(1, light.getIdentCod());
			updateValues.setString(2, light.getMeterNumber());
			updateValues.setString(3, light.getInvoice());
			updateValues.setString(4, light.getCurrentDate());
			updateValues.setString(5, light.getDueDate());
			updateValues.setInt(6, light.getConsumptionDays());
			updateValues.setString(7, light.getFlagType());
			updateValues.setBigDecimal(8, light.getConsumptionValue());
			updateValues.setBigDecimal(9, light.getPisPercentage());
			updateValues.setBigDecimal(10, light.getCofinsPercentage());
			updateValues.setBigDecimal(11, light.getIcmsBasis());
			updateValues.setBigDecimal(12, light.getIcmsPercentage());
			updateValues.setBigDecimal(13, light.getIcmsValue());
			updateValues.setBigDecimal(14, light.getPisCofinsBasis());
			updateValues.setBigDecimal(15, light.getPisValue());
			updateValues.setBigDecimal(16, light.getCofinsValue());
			updateValues.setBigDecimal(17, light.getForfeitValue());
			updateValues.setBigDecimal(18, light.getInterestValue());
			updateValues.setBigDecimal(19, light.getOtherValues());
			updateValues.setBigDecimal(20, light.getSupplyValue());
			updateValues.setBigDecimal(21, light.getFinancialItems());
			updateValues.setBigDecimal(22, light.getAmount());
			updateValues.setString(23, light.getSupplierCnpj());
			updateValues.setInt(24, light.getId());
			
			result = updateValues.executeUpdate();
			con.connection.close();
			
		} catch(SQLException err) {
			
			logger.info(err.getMessage());
		}
		
		return result;
	}

public static Integer delete(Integer id) {
		
		int result = 0;
		
		Logger logger = Logger.getLogger(LightAccountDao.class.getName());
		
		String sql = "DELETE FROM LIGHT_ACCOUNT WHERE ACCOUNT_ID = ?;";
		
		try {
			
			BaseConnection con = new BaseConnection();
			PreparedStatement updateValues = con.connection.prepareStatement(sql);
			
			updateValues.setInt(1, id);
			
			result = updateValues.executeUpdate();
			con.connection.close();
			
		} catch(SQLException err) {
			
			logger.info(err.getMessage());
		}
		
		return result;
	}

}
