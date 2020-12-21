package vue;

import com.sun.media.jfxmedia.logging.Logger;

import controleur.ControleurConnection;

public class VueConnection extends Vue {

	protected ControleurConnection controleur;
	protected static VueConnection instance = null; 
	
	
	private VueConnection() 
	{
		super("connection.fxml"); 
		
	}
		
	

}
