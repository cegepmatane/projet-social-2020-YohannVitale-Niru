package vue;


import java.text.DateFormatSymbols;
import java.util.HashMap;
import java.util.List;

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
		
		 
	        List<HashMap<String, String>> listePassagerAfficher = new ArrayList<HashMap<String, String>>();
	        System.out.println("liste passager : " + listePassager);


	        for (Passager passager:listePassager){
	           
	            listePassagerAfficher.add(passager.convertirMessagePourAdapteur(message));
	            System.out.println("liste passager afficher : " + listePassagerAfficher);
	        }

	        System.out.println("TOTO DIT : " + nombre);
	    

	        SimpleAdapter adapteur = new SimpleAdapter(
	                this,
	                listePassagerAfficher,
	                android.R.layout.two_line_list_item,
	                new String[] {"nom", "prenom"},
	                new int[] {android.R.id.text1, android.R.id.text2}) {
	            public View getView(int position, View convertView, ViewGroup parent) {
	                View view = super.getView(position, convertView, parent);
	                TextView text1 = (TextView) view.findViewById(android.R.id.text1);
	                TextView text2 = (TextView) view.findViewById(android.R.id.text2);
	                text1.setTextColor(Color.WHITE);
	                text2.setTextColor(Color.WHITE);
	                return view;
	            };
	        };

	        VueListePassagerListe.setAdapter(adapteur);
	    }
		
	}

}
