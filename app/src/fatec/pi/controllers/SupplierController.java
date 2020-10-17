package fatec.pi.controllers;

import static javax.swing.JOptionPane.showMessageDialog;

import fatec.pi.daos.SupplierDao;
import fatec.pi.entities.Supplier;
import fatec.pi.views.ViewSucess;

public class SupplierController {
	public static void saveValues(String cnpj, String name, String site) {
		Supplier sup = new Supplier(cnpj, name, site);
		if(SupplierDao.save(sup) == 1) {
			showMessageDialog(null, "Dados cadastrados com Sucesso!");
		}
	}
}
