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

	public void add(List<Message> message) {
		// TODO Auto-generated method stub
		
	}
	
	


}
