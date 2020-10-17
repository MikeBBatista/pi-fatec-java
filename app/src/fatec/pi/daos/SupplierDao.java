package fatec.pi.daos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import fatec.pi.entities.Supplier;

public class SupplierDao {
	public static Integer save(Supplier supplier) {
		Integer res = 0;
		String sql = "Insert into SUPPLIER (SUPPLIER_CNPJ, SUPPLIER_NAME, SUPPLIER_SITE, SUPPLIER_TYPE) VALUES ('"+
				supplier.getCnpj() + "', '" +
				supplier.getName() + "', '" +
				supplier.getSite() + "', " +
				supplier.getType() + ")";
		
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
	
	public static List<Supplier> listSuppliers() {
		List<Supplier> supplierList = new ArrayList<>();
		String sql = "Select * from SUPPLIER";
		try {
			BaseConnection con = new BaseConnection();
			Statement st = con.connection.createStatement();
			
			st.executeQuery(sql);
			ResultSet rs = st.getResultSet();
			
			while(rs.next()) {
				Supplier sup = new Supplier(
						rs.getString("SUPPLIER_CNPJ"), 
						rs.getString("SUPPLIER_NAME"), 
						rs.getString("SUPPLIER_SITE"),
						rs.getInt("SUPPLIER_ID"),
						rs.getInt("SUPPLIER_TYPE"));
				supplierList.add(sup);
			}
		}
		catch(SQLException err) {
			System.out.println(err);
		}
		return supplierList;
	}
	
}
