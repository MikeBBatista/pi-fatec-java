package fatec.pi.controllers;

import static javax.swing.JOptionPane.showMessageDialog;

import fatec.pi.daos.UserDao;
import fatec.pi.entities.User;

public class UserController {
	public static void saveValues(String name, String email, String password, Boolean admin) {
		User user = new User(name, email, password, admin);
		if(UserDao.save(user) == 1) {
			showMessageDialog(null, "Dados cadastrados com Sucesso!");
		}
	}
	
	public static String checkLogin (String email, String password) {
		String login = UserDao.checkLogin(email, password).toString();
		
		if(login.equals("1") || login.equals("0")) {
			showMessageDialog(null, "Login realizado com sucesso!");
		}
		else {
			showMessageDialog(null, "Email ou senha inválidos!");
		}

		return login;
		
	}

}
