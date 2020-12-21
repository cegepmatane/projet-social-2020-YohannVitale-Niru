package controleur;

import Model.Message;
import donnee.MessageDAO;
import vue.Navigateur;
import vue.VueChat;
import vue.VueConnection;

public class Controleur {
	
	public void actionNaviguerVueChat()
	{
		MessageDAO dao = new MessageDAO();
		dao.listerMessage();
		
		//Navigateur.getInstance().afficherVue(VueChat.getInstance());
	}

}
