package controleur;

import java.util.List;

import Model.Message;
import donnee.MessageDAO;
import vue.Navigateur;
import vue.VueChat;
import vue.VueConnection;

public class Controleur {
	
	static protected List<Message> listeMessage;
	protected Navigateur navigateur;
	protected MessageDAO messageDAO;
	static protected  Message message;
	
	public void actionNaviguerVueChat()
	{
		MessageDAO dao = new MessageDAO();
		dao.listerMessage();
		//teste
		
		//Navigateur.getInstance().afficherVue(VueChat.getInstance());
	}
	
	/*public void initialiser()
	{
		this.listeMessage = messageDAO.listerMessage();
		this.navigateur.getVueChatListeMessage().afficherListeMessage(listeMessage);
	}*/

}
