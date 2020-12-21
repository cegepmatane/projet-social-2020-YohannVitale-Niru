package vue;

import javafx.stage.Stage;
                                                    
public class Fenetre extends Navigateur {

	@Override
	public void start(Stage stade) throws Exception {
		
		stade.setScene(VueChat.getInstance());
		stade.show();
		this.stade = stade;
	}

}                                   