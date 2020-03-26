package election;

public class CSE_D_Credential {
	String[] password = new String[68];

	void setPassword(String pass,int i) {
		password[i] = pass;
	}
	
	public boolean validate_password(String pass,int i)
	{
		if(password[i].equals(pass))
		{
			return true;
		}
		return false;
	}
}
