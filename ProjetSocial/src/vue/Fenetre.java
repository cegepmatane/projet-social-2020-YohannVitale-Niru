package vue;

import javafx.stage.Stage;
                                                    
public class Fenetre extends Navigateur {

	@Override
	public void start(Stage stade) throws Exception {
		
		stade.setScene(VueConnection.getInstance());
		stade.show();
		this.stade = stade;
	}

}                                   