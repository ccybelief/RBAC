package com.atguigu.atcrowdfunding.bean;


public class User {
	private Integer id;
	private String username;
	private String loginacct;
	private String userpswd;
	
  public String getLoginacct() {
		return loginacct;
	}
	public void setLoginacct(String loginacct) {
		this.loginacct = loginacct;
	}
	public String getUserpswd() {
		return userpswd;
	}
	public void setUserpswd(String userpswd) {
		this.userpswd = userpswd;
	}
public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}

}
