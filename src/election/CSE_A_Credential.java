package election;

public class CSE_A_Credential {
	String[] password = new String[70];

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
