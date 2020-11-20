package fatec.pi.daos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import fatec.pi.entities.Supplier;

public class SupplierDao {
	public static Integer save(Supplier supplier) {
		Integer result = 0;
		String sql = "Insert into SUPPLIER (SUPPLIER_CNPJ, SUPPLIER_NAME, SUPPLIER_SITE, SUPPLIER_TYPE) VALUES (?, ?, ?, ?)";
		
		try {
			BaseConnection con = new BaseConnection();
			PreparedStatement saveValues = con.connection.prepareStatement(sql);
			
			saveValues.setString(1, supplier.getCnpj());
			saveValues.setString(2, supplier.getName());
			saveValues.setString(3, supplier.getSite());
			saveValues.setInt(4, supplier.getType());
			
			result = saveValues.executeUpdate();

		}
		catch(SQLException err) {
			System.out.println(err);
		}
		return result;
	}
	
	public static List<Supplier> listSuppliers(int supplierId) {
		
		List<Supplier> supplierList = new ArrayList<>();
		String sql = "Select * from SUPPLIER where SUPPLIER_CNPJ =" + supplierId + ";"; // verificar a criacao de variavel
		try {
			BaseConnection con = new BaseConnection();
			PreparedStatement st = con.connection.prepareStatement(sql);
			
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
	
public static Integer update(Supplier supplier) {
		
		int result = 0;
		
		Logger logger = Logger.getLogger(SupplierDao.class.getName());
		
		
		String sql = "UPDATE SUPPLIER SET SUPPLIER_CNPJ = ?, "
				+ "SUPPLIER_NAME = ?, "
				+ "SUPPLIER_SITE = ?, "
				+ "SUPPLIER_TYPE = ?, "
				+ "WHERE SUPPLIER_ID = ?;";
		
		try {
			
			BaseConnection con = new BaseConnection();
			PreparedStatement updateValues = con.connection.prepareStatement(sql);
			
			updateValues.setString(1, supplier.getCnpj());
			updateValues.setString(2, supplier.getName());
			updateValues.setString(3, supplier.getSite());
			updateValues.setInt(4, supplier.getType());
			updateValues.setInt(5, supplier.getId());
			
			result = updateValues.executeUpdate();
			con.connection.close();
			
		} catch(SQLException err) {
			
			logger.info(err.getMessage());
		}
		
		return result;
	}
	
	
	
}
