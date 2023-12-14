package streamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapCollect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<User>users=new ArrayList<User>();
		users.add(new User(1,"Ramesh","secrete","ramesh@gmail.com"));
		users.add(new User(2,"Tony","secrete","tony@gmail.com"));
		users.add(new User(3,"Tom","secrete","tom@gmail.com"));
		
		List<UserDTO>userDTOs=users.stream().map((User user)->
		new UserDTO(user.getId(),user.getUserName(),user.getEmail()))
		//.forEach(userDTO->System.out.println(userDTO));
		.collect(Collectors.toList());
		userDTOs.forEach(System.out::println);

	}

}
class UserDTO{
	private int id;
	private String userName;
	
	private String email;
	public UserDTO(int id, String userName, String email) {
		super();
		this.id = id;
		this.userName = userName;
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", email=" + email + "]";
	}
}
class User{
	private int id;
	private String userName;
	private String password;
	private String email;
	public User(int id, String userName, String password, String email) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", password=" + password + ", email=" + email + "]";
	}
	
}
