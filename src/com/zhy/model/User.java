package com.zhy.model;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
	private String loginname;
	private Date birthday;
	public User() {
		super();
	}
	public User(String loginname, Date birthday) {
		super();
		this.loginname = loginname;
		this.birthday = birthday;
	}
	public String getLoginname() {
		return loginname;
	}
	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	@Override
	public String toString() {
		return "登录名："+loginname+";生日："+birthday;
	}
}
