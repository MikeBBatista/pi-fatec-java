package fatec.pi.controllers;

import static javax.swing.JOptionPane.showMessageDialog;

import java.math.BigDecimal;

import fatec.pi.daos.SupplierDao;
import fatec.pi.daos.ClientDao;
import fatec.pi.entities.Client;
import fatec.pi.views.ViewClient;

public class ClientController {

	public static void saveValues(Long supplierCnpj, Long clientCpf, String clientName, String zipCode, 
			Integer streetNumber, String streetName,
			String streetComplement, String city, String state, Integer meterNumber, String measurementOrder, 
			String lightClass, String lightSubclass,
			BigDecimal normalTax, BigDecimal tributeTax, Integer createdBy, Integer alterBy) {
		
		Client client = new Client(supplierCnpj, clientCpf, clientName, zipCode, streetName, streetNumber,
				streetComplement, city, state, meterNumber, measurementOrder, lightClass, lightSubclass,
				normalTax, tributeTax, createdBy, alterBy);
		
		if(ClientDao.save(client) == 1) {
			showMessageDialog(null, "Dados cadastrados com Sucesso!");

}
	}
}
