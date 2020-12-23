package controleur;

import com.sun.media.jfxmedia.logging.Logger;

import vue.Navigateur;
import vue.VueChat;

public class ControleurConnection extends Controleur{

	public ControleurConnection()
	{
		Logger.logMsg(Logger.INFO, "new ControleurConnection()");
	}
	
	public void notifierClicEnvoyerMessage()
	{
		Navigateur.getInstance().afficherVue(VueChat.getInstance());
	}

}
