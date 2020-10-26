package fatec.pi.daos;

import java.sql.SQLException;
import java.sql.Statement;

public class LightAccountDao {
	
	public static Integer save(LightAccount light) {
		
		Integer res = 0;
		String sql = "Insert into LIGHT_ACCOUNT (LIGHT_IDENT_COD, "
				+ "LIGHT_METER_NUMBER, "
				+ "LIGHT_INVOICE, "
				+ "LIGHT_CURRENT_DATE, "
				+ "LIGHT_DUE_DATE, "
				+ "LIGHT_CONSUMPTION_DAYS, "
				+ "LIGHT_FLAG_TYPE, "
				+ "LIGHT_CONSUMPTION_VALUE, "
				+ "LIGHT_PIS_PERCENTAGE, "
				+ "LIGHT_COFINS_PERCENTAGE, "
				+ "LIGHT_ICMS_BASIS, "
				+ "LIGHT_ICMS_PERCENTAGE, "
				+ "LIGHT_ICMS_VALUE, "
				+ "LIGHT_PIS_COFINS_BASIS, "
				+ "LIGHT_PIS_VALUE, "
				+ "LIGHT_COFINS_VALUE, "
				+ "LIGHT_FORFEIT_VALUE, "
				+ "LIGHT_INTEREST_VALUE, "
				+ "LIGHT_OTHER_VALUES, "
				+ "LIGHT_SUPPLY_VALUES, "
				+ "LIGHT_FINANCIAL_ITEMS, "
				+ "LIGHT_AMOUNT, "
				+ "LIGHT_SUPPLIER_CNPJ, "
				+ "LIGHT_CLIENT_CPF) "
				+ "VALUES ('" + light.getIdentCod() + "', '"
				+ light.getMeterNumber() + "', "
				+ light.getInvoice() + "', "
				+ light.getCurrentDate() + "', "
				+ light.getDueDate() + "', "
				+ light.getConsumptionDays() + "', "
				+ light.getFlagType() + "', "
				+ light.getConsumptionValue() + "', "
				+ light.getPisPercentage() + "', "
				+ light.getCofinsPercentage() + "', "
				+ light.getIcmsBasis() + "', "
				+ light.getIcmsPercentage() + "', "
				+ light.getIcmsValue() + "', "
				+ light.getPisCofinsBasis() + "', "
				+ light.getPisValue() + "', "
				+ light.getCofinsValue() + "', "
				+ light.getForfeitValue() + "', "
				+ light.getInterestValue() + "', "
				+ light.getOtherValues() + "', "
				+ light.getSupplyValues() + "', "
				+ light.getFinancialItems() + "', "
				+ light.getAmount() + "', "
				+ light.getSupplierCnpj() + "', "
				+ light.getClientCpf() + "')";
		
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
