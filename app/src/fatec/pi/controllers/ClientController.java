package fatec.pi.controllers;

import static javax.swing.JOptionPane.showMessageDialog;

import java.math.BigDecimal;
import java.util.List;

import fatec.pi.daos.SupplierDao;
import fatec.pi.daos.ClientDao;
import fatec.pi.entities.Client;
import fatec.pi.entities.Supplier;
import fatec.pi.views.ViewClient;

public class ClientController {

	public static void saveValues(String supplierCnpj, String clientCpf, String clientName, String zipCode, 
			Integer streetNumber, String streetName,
			String streetComplement, String city, String state, String meterNumber, String measurementOrder, 
			String lightClass, String lightSubclass,
			BigDecimal normalTax, BigDecimal tributeTax) {
	
	Client clt = new Client (supplierCnpj, clientCpf, clientName, zipCode, streetName, streetNumber, streetComplement, city, state,
			meterNumber, measurementOrder, lightClass, lightSubclass, normalTax, tributeTax);
	
	if(ClientDao.save(clt) ==1) {
		showMessageDialog(null, "Dados cadastrados com Sucesso");
	}
}

	public static List<Client> getValues(String clientCpf){
		List <Client> clients = ClientDao.listClients(clientCpf);
		return clients;

}
	}
	

