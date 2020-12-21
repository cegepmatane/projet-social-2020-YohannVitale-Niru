package vue;


import com.sun.media.jfxmedia.logging.Logger;


import controleur.ControleurConnection;


public class VueChat extends Vue {
	
	protected ControleurConnection controleur;
	protected static VueChat instance = null;
	
	public static VueChat getInstance() {if(null==instance)instance = new VueChat();return VueChat.instance;}; 
	
	public VueChat()
	{
		super("chat.fxml");
	}

}
