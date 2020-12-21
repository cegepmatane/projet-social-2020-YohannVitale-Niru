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
		super(parser(fxml, null));
		this.controleur = null;
		System.out.println("Je suis dans vue ! Vue() ");
	}
	public Vue(String fxml, Controleur controleur)
	{
		super(parser(fxml, controleur),1294,743);
		this.controleur = controleur;
		System.out.println("Je suis dans vue controleur ! Vue(controleur) ");
	}

	public static Parent parser(String fxml, Controleur controleur)
	{
		parseur = new FXMLLoader();
		System.out.println("Je suis dans le parser ! parser()");
		parseur.setLocation(VueConnection.class.getResource(fxml));
		if(null != controleur) parseur.setController(controleur);
		try {
			
			System.out.println("Je suis dans le parser try ! parser()");
			return parseur.load();
			
		} catch (IOException e) {
			System.out.println("Je suis dans le parser catch ! parser()");
			e.printStackTrace();
		}
		System.out.println("fin parser");
		return null;
	}

	public void activerControles()
	{	
		Button actionNaviguerVueChat = (Button) lookup("#boutonActionConnection");
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