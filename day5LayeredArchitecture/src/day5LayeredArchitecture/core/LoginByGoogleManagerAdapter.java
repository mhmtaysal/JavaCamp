package day5LayeredArchitecture.core;


import day5LayeredArchitecture.loginByGoogle.LoginByGoogleManager;

public class LoginByGoogleManagerAdapter implements LoginByGoogleService{

	@Override
	public void login(String message) {
     LoginByGoogleManager loginByGoogleManager = new LoginByGoogleManager();
     loginByGoogleManager.loginByGoogle(message);
	}






}
