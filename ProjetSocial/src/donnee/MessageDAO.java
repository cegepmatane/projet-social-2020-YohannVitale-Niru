package donnee;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.api.core.ApiFuture;
import com.google.auth.Credentials;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.FieldPath;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.FirestoreOptions;
import com.google.cloud.firestore.QueryDocumentSnapshot;
import com.google.cloud.firestore.QuerySnapshot;
import com.google.cloud.firestore.WriteResult;

import Model.Message;


public class MessageDAO 
{
	public static final String SQL_LISTER_MESSAGE = "SELECT * FROM message";
	public static final String SQL_EMVOYER_MESSAGE = "INSERT into message(aqui, dequi, messageEnvoyer) VALUES(?,?,?)";
	//public static final String SQL_MODIFIER_MOUTON = "";
	
	public List<Message> listerMessage()
	{
		System.out.println("Je suis dnas listerMessage");
		List<Message> message =  new ArrayList<Message>();			
		
		try {
			System.out.println("Je suis dnas listerMessage Try");
			String ID_PROJET = "projetsocial-10d1d";
			Credentials credit = GoogleCredentials.fromStream(new FileInputStream("clef-projetsocial.json"));
			Firestore nuage = FirestoreOptions.getDefaultInstance().toBuilder().setCredentials(credit).setProjectId(ID_PROJET).build().getService();
			
		    ApiFuture<QuerySnapshot> demande = nuage.collection("message").get();
		    QuerySnapshot resultat = demande.get();
		    List<QueryDocumentSnapshot> messagesNuage = resultat.getDocuments();
		    for(QueryDocumentSnapshot messageNuage : messagesNuage)
		    {
		    	String id = messageNuage.getId();
		    	System.out.println(id);
		    	long aqui = messageNuage.getLong("aqui").longValue();
		    	long dequi = messageNuage.getLong("dequi").longValue();
		    	String messageEnvoyer = messageNuage.getString("messageEnvoyer");
		    	
		    	
		    	Message messages = new Message();
				messages.setAqui(0);
		    	messages.setDequi(0);
		    	messages.setMessageEnvoyer(messageEnvoyer);
		    	
		    	
		    	messages.add(message);
		    			    	
		    }
			
			nuage.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Je suis dnas listerMessage avant return message");
		System.out.println("returnMessage" + message.size());
		return message;
		
	}
	
	public void envoyerMessage(Message message)
	{
		System.out.println("Je suis dnas ajouterMessage");
		try {
			String ID_PROJET = "projetsocial-10d1d";
			Credentials credit = GoogleCredentials.fromStream(new FileInputStream("clef-projetsocial.json"));
			Firestore nuage = FirestoreOptions.getDefaultInstance().toBuilder().setCredentials(credit).setProjectId(ID_PROJET).build().getService();
			
			DocumentReference nouveau = nuage.collection("message").document();
			Map<String, Object> objet = new HashMap<>();
			objet.put("dequi", message.getDequi());
			objet.put("aqui", message.getAqui());
			objet.put("messageEnvoyer", message.getMessageEnvoyer());
			ApiFuture<WriteResult> resultat = nouveau.set(objet);
			System.out.println("Update time : " + resultat.get().getUpdateTime());
			
			
			nuage.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
