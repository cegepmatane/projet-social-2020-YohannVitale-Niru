package controleur;

import vue.Navigateur;
import vue.VueChat;
import vue.VueConnection;

public class Controleur {
	
	public void actionNaviguerVueChat()
	{
		Navigateur.getInstance().afficherVue(VueChat.getInstance());
	}

}
