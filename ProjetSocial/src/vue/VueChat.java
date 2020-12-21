package vue;


import java.text.DateFormatSymbols;
import java.util.HashMap;

import com.sun.media.jfxmedia.logging.Logger;

import Model.Message;
import Model.Utilisateur;

import controleur.ControleurConnection;
import donnee.MessageDAO;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;


public class VueChat extends Vue {
	
	protected ControleurConnection controleur;
	protected static VueChat instance = null;
	protected Message message; 
	protected Utilisateur utilisateur; 
	public static VueChat getInstance() {if(null==instance)instance = new VueChat();return VueChat.instance;}; 
	
	public VueChat()
	{
		super("chat.fxml");
		super.controleur = this.controleur = new ControleurConnection();
		Logger.logMsg(Logger.INFO, "new VueChat()");
		//message = (new MessageDAO()).detaillerAnnee();
		//afficherPseudo();
		//afficherListeMessage();
		//activerControles();
	}
		
	public void activerControles()
	{
		super.activerControles();
	}
	private void afficherPseudo()
	{
		/*Label labelPseudo = (Label) lookup("#vueChatPseudo");
		
		labelPseudo.setText(utilisateur.getNom());*/
		
	}
	
	private void afficherListeMessage()
	{
		
	}

}
