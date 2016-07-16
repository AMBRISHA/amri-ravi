package shoppingcartwebapp;

public class LoginDAO {

	public boolean isvaliduser(String userID, String password) {
		// TODO Auto-generated method stub
		if(userID.equals(password)){
		return true;
	}
		else
		{
return false;
		}
	}
	

}
