package controleur;

import donnee.MessageDAO;
import vue.Navigateur;
import vue.VueConnection;

public class Controleur {
	
	public void actionNaviguerVueChat()
	{
		MessageDAO dao = new MessageDAO();
		Navigateur.getInstance().afficherVue(VueConnection.getInstance());
	}

}
