package fr.diginamic.singleton2;

import java.util.ResourceBundle;

public class ConfigSingleton {

	String mysql;
	String user;
	String pass;

	private ConfigSingleton() {
		ResourceBundle configuration = ResourceBundle.getBundle("configuration");
		this.mysql = configuration.getString("db.url");
		this.user = configuration.getString("db.user");
		this.pass = configuration.getString("db.password");
	}

	private static ConfigSingleton INSTANCE = new ConfigSingleton();

	public static ConfigSingleton getConfig() {
		return INSTANCE;
	}

	public String getMysql() {
		return mysql;
	}

	public void setMysql(String mysql) {
		this.mysql = mysql;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

}
