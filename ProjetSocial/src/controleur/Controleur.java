package controleur;

import vue.Navigateur;
import vue.VueConnection;

public class Controleur {
	
	public void actionNaviguerVueChat()
	{
		Navigateur.getInstance().afficherVue(VueConnection.getInstance());
	}

}
