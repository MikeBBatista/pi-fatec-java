package fatec.pi.controllers;

import static javax.swing.JOptionPane.showMessageDialog;

import java.util.List;

import fatec.pi.daos.SupplierDao;
import fatec.pi.entities.Supplier;
import fatec.pi.views.ViewAccountType;

public class SupplierController {
	public static void saveValues(String cnpj, String name, String site, Integer type) {
		Supplier sup = new Supplier(cnpj, name, site, type);
		if(SupplierDao.save(sup) == 1) {
			showMessageDialog(null, "Dados cadastrados com Sucesso!");
		}
	}
	
	public static List<Supplier> getValues(String cnpj) {
			List<Supplier> suppliers = SupplierDao.listSuppliers(cnpj);
			return suppliers;
	}
}
