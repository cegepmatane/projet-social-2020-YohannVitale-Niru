package vue;

import com.sun.media.jfxmedia.logging.Logger;

import controleur.ControleurConnection;
import javafx.application.Application;
import javafx.stage.Stage;

public abstract class Navigateur extends Application{ 
	
	protected Stage stade;
	protected VueChat vueChat;
	protected ControleurConnection controleur;
		
	private static Navigateur instance = null;
	public static Navigateur getInstance() {return instance;}	
	protected Navigateur()
	{
		instance = this;
		Logger.setLevel(Logger.INFO);
		this.vueChat = new VueChat();
		this.controleur = new ControleurConnection();
		VueChat.getInstance().activerControles();
	}
	
	public void afficherVue(Vue vue)
	{
		stade.setScene(vue);
		stade.show();				
	}
	
	public void start(Stage stade) throws Exception 
	{
		this.stade = stade;
		this.stade.setTitle("Chat");
		this.stade.setScene(this.vueChat); //TODO FAIT : dire quelle vue afficher en premier
		//this.pageListeExoplanete.afficherListeExoplanetes("terre + mars");
		/*ExoPlaneteDAO exoplaneteDAO = new ExoPlaneteDAO();
		this.pageListeExoplanete.afficherListeExoplanetes(exoplaneteDAO.listerExoPlanete());*/ //TODO : dans controleur
		//TODO : activer dans le controleur la premiere vue
		this.stade.show();
		
		this.controleur.initialiser();
		//this.naviguerVersPageExoplanete();
		//this.naviguerVersPageListeExoplanete();
	}
	
	public VueChat getVueChatListeMessage() 
	{
		return vueChat;
	}
}
