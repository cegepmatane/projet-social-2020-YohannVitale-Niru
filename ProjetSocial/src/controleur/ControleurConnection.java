package controleur;

import com.sun.media.jfxmedia.logging.Logger;

import Model.Message;
import donnee.MessageDAO;
import vue.Navigateur;
import vue.VueChat;

public class ControleurConnection extends Controleur
{
	MessageDAO messageDAO = new MessageDAO();
	public ControleurConnection()
	{
		Logger.logMsg(Logger.INFO, "new ControleurConnection()");
	}
	
	public void notifierClicEnvoyerMessage()
	{
		Navigateur.getInstance().afficherVue(VueChat.getInstance());
		Message nouveauMessage = VueChat.getInstance().lireMessage();
		messageDAO.envoyerMessage(nouveauMessage);
		VueChat.getInstance().afficherListeMessage(messageDAO.listerMessage());
	}
	
	

}
