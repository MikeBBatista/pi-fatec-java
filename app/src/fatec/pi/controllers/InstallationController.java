package fatec.pi.controllers;

import static javax.swing.JOptionPane.showMessageDialog;

import java.math.BigDecimal;

import fatec.pi.entities.Installation;

public class InstallationController {
	
	public static void saveLightValues(Integer installationNumber, String subClass, String mainClass,
			BigDecimal freeTaxFare, String readSchedule) {
		
		Installation installation = new Installation(installationNumber, subClass, mainClass, freeTaxFare,
				readSchedule);
		
		if(InstallationDao.save() == 1) {
			
			showMessageDialog(null, "Dados cadastrados com Sucesso!");
		}			
	}
	
	public static void saveWaterValues(Integer installationNumber, String installationType) {
		
		Installation installation = new Installation(installationNumber, installationType);
		
		if(InstallationDao.save() == 1) {
			
			showMessageDialog(null, "Dados cadastrados com Sucesso!");
		}
	}
}
