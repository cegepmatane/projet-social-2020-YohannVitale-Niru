package vue;


import java.text.DateFormatSymbols;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sun.media.jfxmedia.logging.Logger;

import Model.Message;
import Model.Utilisateur;

import controleur.ControleurConnection;
import donnee.MessageDAO;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;


public class VueChat extends Vue {
	
	protected ControleurConnection controleur;
	protected static VueChat instance = null;
	protected Message message; 
	protected MessageDAO messageDAO;
	protected Utilisateur utilisateur; 
	protected  Map<String, Integer> messageSelonId;
	public static VueChat getInstance() {if(null==instance)instance = new VueChat();return VueChat.instance;}; 
	
	public VueChat()
	{
		super("chat.fxml");
		super.controleur = this.controleur = new ControleurConnection();
		Logger.logMsg(Logger.INFO, "new VueChat()");
		this.messageSelonId = new HashMap<String, Integer>();
		//message = (new MessageDAO()).listerMessage();
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
	
	/*private void afficherListeMessage(List<Message> messages)
	{
		
		VBox boxListeMessage = (VBox)lookup("#liste-message");
		
		
		//ListView listeMessage = (ListView) boxListeMessage.getListView().get();
		ListView listeMessage = (ListView) boxListeMessage.getContentBias();
		listeMessage.set(new PropertyValueFactory<>("id"));
		
		
		// Ajout des données
		for(Message message : messages)
		{
			System.out.println(message.getMessageEnvoyer());
			message.getMessageEnvoyer().add(message);
		}
	}*/
	
	public void afficherListeMessage(List<Message> messages)
    {
		System.out.println("Je suis dnas afficherListeMessage");
        ObservableList<String> itemMessage = FXCollections.observableArrayList ();
      
        ListView listesMessage = (ListView) this.lookup("#listeMessage");
        
        for(Message message : messages)
        {
        	System.out.print("Je suis dnas afficherListeMessage la boucle for");
        	itemMessage.add(message.getMessageEnvoyer());
            this.messageSelonId.put(message.getMessageEnvoyer(), message.getId());
            System.out.println("itemMessage");
           
        }
        System.out.println("ITEMMESSAGE" + itemMessage);
        listesMessage.setItems(itemMessage);
        
       
    }

}
