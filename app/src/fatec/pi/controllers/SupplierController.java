package fatec.pi.controllers;


import fatec.pi.daos.SupplierDao;
import fatec.pi.entities.Supplier;
import fatec.pi.views.ViewSucess;

public class SupplierController {
	public static void saveValues(String cnpj, String name, String site) {
		Supplier sup = new Supplier(cnpj, name, site);
		if(SupplierDao.save(sup) == 1) {
			ViewSucess sucess = new ViewSucess();
			sucess.frame.setVisible(true);
		}
	}
}
