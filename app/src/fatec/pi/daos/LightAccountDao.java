package fatec.pi.daos;

import java.sql.SQLException;
import java.sql.PreparedStatement;
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
				+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		
		try {
			BaseConnection con = new BaseConnection();
			PreparedStatement saveValues = con.connection.prepareStatement(sql);
			
			saveValues.setString(1, light.getIdentCod());
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
