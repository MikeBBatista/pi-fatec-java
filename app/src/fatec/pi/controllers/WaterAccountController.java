package fatec.pi.controllers;

import static javax.swing.JOptionPane.showMessageDialog;

import java.math.BigDecimal;

import fatec.pi.daos.SupplierDao;
import fatec.pi.daos.WaterAccountDao;
import fatec.pi.entities.WaterAccount;
import fatec.pi.views.ViewSucess;

public class WaterAccountController {
	public static void saveValues(String number, String dueDate, BigDecimal penalty, BigDecimal consumptionValue,
			BigDecimal pollutionValue, BigDecimal sewerValue, BigDecimal waterValue, Integer pisPercentage,
			BigDecimal otherValues, String supplierCnpj) {
		
		WaterAccount water = new WaterAccount(number, dueDate, penalty, consumptionValue, pollutionValue, sewerValue,
				waterValue, pisPercentage, otherValues, supplierCnpj);
		
		if(WaterAccountDao.save(water) == 1) {
			showMessageDialog(null, "Dados cadastrados com Sucesso!");
		}
		
	}
}
