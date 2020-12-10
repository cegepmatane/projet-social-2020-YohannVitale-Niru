package vue;

import java.io.IOException;

import com.sun.media.jfxmedia.logging.Logger;

import controleur.Controleur;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;

public class Vue extends Scene{
	protected static FXMLLoader parseur = null;
	protected Controleur controleur = null;
	
	public Vue(String fxml)
	{
		super(parser(fxml, null),1294,743);
		this.controleur = null;
	}
	public Vue(String fxml, Controleur controleur)
	{
		super(parser(fxml, controleur),1294,743);
		this.controleur = controleur;
	}

	public static Parent parser(String fxml, Controleur controleur)
	{
		parseur = new FXMLLoader();
		parseur.setLocation(VueConnection.class.getResource(fxml));
		if(null != controleur) parseur.setController(controleur);
		try {
			return parseur.load();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("fin parser");
		return null;
	}

	public void activerControles()
	{	
		Button actionNaviguerVueChat = (Button) lookup("#boutonConnection");
		actionNaviguerVueChat.setOnAction(new EventHandler<ActionEvent>()
		{
			@Override public void handle(ActionEvent e) 
	        {
				Logger.logMsg(Logger.INFO, "Bouton Connection activé !");
				controleur.actionNaviguerVueChat();
	        }
		});		
	}
	
}