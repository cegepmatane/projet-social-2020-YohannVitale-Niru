import Model.Message;
import donnee.MessageDAO;
import vue.Fenetre;

public class App {
	
	public static void main(String[] parametres) 
	{
		MessageDAO dao = new MessageDAO();
		/*dao.listerMessage();
		Message message = new Message();
		message.setAqui(2);
		message.setDequi(1);
		message.setMessageEnvoyer("Allo, comment ca va ? ");
		dao.envoyerMessage(message);*/
		Fenetre.launch(Fenetre.class, parametres);
	}

}
