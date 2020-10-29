package fatec.pi.controllers;

import static javax.swing.JOptionPane.showMessageDialog;

import java.math.BigDecimal;

import fatec.pi.daos.LightAccountDao;
import fatec.pi.entities.LightAccount;

public class LightAccountController {
	
	public static void saveValues(String identCod, String meterNumber, String invoice, String currentDate,
			String dueDate, Integer consumptionDays, String flagType, BigDecimal consumptionValue, BigDecimal pisPercentage,
			BigDecimal cofinsPercentage, BigDecimal icmsBasis, BigDecimal icmsPercentage, BigDecimal icmsValue,
			BigDecimal pisCofinsBasis, BigDecimal pisValue, BigDecimal cofinsValue, BigDecimal forfeitValue,
			BigDecimal interestValue, BigDecimal otherValues, BigDecimal supplyValue, BigDecimal financialItems,
			BigDecimal amount, String supplierCnpj, String clientCpf) {
		
		LightAccount light = new LightAccount(identCod, meterNumber, invoice, currentDate, dueDate, consumptionDays,
				flagType, consumptionValue, pisPercentage, cofinsPercentage, icmsBasis, icmsPercentage, icmsValue,
				pisCofinsBasis, pisValue, cofinsValue, forfeitValue, interestValue, otherValues, supplyValue,
				financialItems, amount, supplierCnpj, clientCpf);
		
		if(LightAccountDao.save(light) == 1) {
			
			showMessageDialog(null, "Dados cadastrados com Sucesso!");
		}
	}
			

}