package Model;

public class Message 
{
	protected int id;
	protected int dequi;
	protected int aqui;
	protected String messageEnvoyer;
	
	public int getId() 
	{
		return id;
	}
	
	public void setId(int id) 
	{
		this.id = id;
	}
	
	public int getDequi() 
	{
		return dequi;
	}
	
	public void setDequi(int dequi) 
	{
		this.dequi = dequi;
	}
	
	public int getAqui() 
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
