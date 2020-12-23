package Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Message 
{
	protected int id;
	protected double dequi;
	protected double aqui;
	protected String messageEnvoyer;
	
protected List< HashMap<String, String>> listeMessage = new ArrayList< HashMap<String,String> >();

public void ajouterMois(String messageEnvoyers) 
{
	HashMap<String, String> messagess = new HashMap<String, String>();
	//messageEnvoyer.put(messageEnvoyer);
	
	this.listeMessage.add(messagess);
}
	
	public Message() 
	{		
		super();
	}
	
	public int getId() 
	{
		return id;
	}
	
	public void setId(int id) 
	{
		this.id = id;
	}
	
	public double getDequi() 
	{
		return dequi;
	}
	
	public void setDequi(int dequi) 
	{
		this.dequi = dequi;
	}
	
	public double getAqui() 
	{
		return aqui;
	}
	
	public void setAqui(int aqui) 
	{
		this.aqui = aqui;
	}
	
	public String getMessageEnvoyer() 
	{
		return messageEnvoyer;
	}
	
	public void setMessageEnvoyer(String messageEnvoyer) 
	{
		this.messageEnvoyer = messageEnvoyer;
	}
	
}
