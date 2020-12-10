package vue;

import com.sun.media.jfxmedia.logging.Logger;

import controleur.ControleurConnection;

public class VueConnection extends Vue {

	protected ControleurConnection controleur;
	protected static VueConnection instance = null; 
	public static VueConnection getInstance() {if(null==instance)instance = new VueConnection();return VueConnection.instance;}; 
	
	private VueConnection() 
	{
		super("connection.fxml"); 
		super.controleur = this.controleur = new ControleurConnection();
		Logger.logMsg(Logger.INFO, "new VueConnection()");
	}
		
	public void activerControles()
	{
		super.activerControles();
	}

}
