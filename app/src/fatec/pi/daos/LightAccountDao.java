package fatec.pi.daos;

import java.sql.SQLException;
import java.sql.Statement;

import fatec.pi.entities.LightAccount;

public class LightAccountDao {
	
	public static Integer save(LightAccount light) {
		
		Integer res = 0;
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
				+ "VALUES ('" + light.getIdentCod() + "','"
				+ light.getMeterNumber() + "','"
				+ light.getInvoice() + "','"
				+ light.getCurrentDate() + "','"
				+ light.getDueDate() + "',"
				+ light.getConsumptionDays() + ",'"
				+ light.getFlagType() + "',"
				+ light.getConsumptionValue() + ","
				+ light.getPisPercentage() + ","
				+ light.getCofinsPercentage() + ","
				+ light.getIcmsBasis() + ","
				+ light.getIcmsPercentage() + ","
				+ light.getIcmsValue() + ","
				+ light.getPisCofinsBasis() + ","
				+ light.getPisValue() + ","
				+ light.getCofinsValue() + ","
				+ light.getForfeitValue() + ","
				+ light.getInterestValue() + ","
				+ light.getOtherValues() + ","
				+ light.getSupplyValue() + ","
				+ light.getFinancialItems() + ","
				+ light.getAmount() + ",'"
				+ light.getSupplierCnpj() + "')";
		
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
