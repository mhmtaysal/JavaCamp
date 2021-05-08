package day5LayeredArchitecture.business.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import day5LayeredArchitecture.business.abstracts.UserService;
import day5LayeredArchitecture.core.LoginByGoogleService;
import day5LayeredArchitecture.dataAccess.abstracts.UserDao;
import day5LayeredArchitecture.entities.concretes.User;

public class UserManager implements UserService {

	public static final String regex = "^[A-Z0-9.%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";
	public Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

	UserDao userDao;
	
	private LoginByGoogleService loginByGoogleService;

	public UserManager(UserDao userDao , LoginByGoogleService loginByGoogleService ) {
		super();
		this.userDao = userDao;
		this.loginByGoogleService = loginByGoogleService;
	}

	@Override
	public boolean add(User user) {

		
		if ( checkPassword(user.getPassword())&&
				checkLastName(user.getLastName())&&
				checkFirstName(user.getLastName()) &&
				checkEmail(user.getEmail())&&
				checkMailUsedBefore(user.getEmail())) {
			
			this.loginByGoogleService.login(user.getFisrtName());
			
			userDao.add(user);
			return true;
		}
System.out.println("Giriþ Bilgilerinizi kontrol ediniz");
		return false;
	}

	@Override
	public boolean update(User user) {

		userDao.update(user);
		return true;
	}

	@Override
	public boolean delete(User user) {
		userDao.delete(user);

		return true;
	}

	@Override
	public User getById(int id) {

		return userDao.getById(id);
	}

	@Override
	public User getByEmail(String email) {
		return userDao.getbyEmail(email);
	}

	@Override
	public List<User> getAll() {
		return userDao.getAll();
	}



	private boolean checkFirstName(String firstName) {

		if (firstName.length() < 2)

		{
			System.out.println("Ýsim 2 karakterden küçük olamaz!");

			return false;

		}
		return true;

	}

	private boolean checkLastName(String lastName) {
		if (lastName.length() < 2) {
			System.out.println("Soy isim 2 karakterden küçük olamaz!");

			return false;
		}

		return true;
	}

	private boolean checkPassword(String password) {
		if (password.length() < 6) {
			System.out.println("Þifre 6 karakterden küçük olamaz");
			return false;
		}
		return true;
	}

	private boolean checkEmail(String email) {
		if (pattern.matcher(email).find()) {
			return true;
		}
		System.out.println("Geçerli bir mail adresi giriniz");
		return false;

	}


	private List<String> getEmails(){
		List<User> users = userDao.getAll();
		List<String> emails = new ArrayList<String>();
		for (User user : users) {
			emails.add(user.getEmail());
		}
		return emails;
	}

	private boolean checkMailUsedBefore(String mail) {
	
		List<String> emails = this.getEmails();
		for (String eMail : emails) {
			if (eMail.equals(mail)) {
				
				
				System.out.println( eMail + " bu mail adresi daha önce kullanýlmýþtýr");

				return false;

			}
		}

		return true;
		
		
		
		
		
		

	}

}
