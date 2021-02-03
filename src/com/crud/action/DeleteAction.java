package com.crud.action;

import com.crud.dao.Admin;
import com.opensymphony.xwork2.ActionSupport;

public class DeleteAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	String uemail, msg, uname;
	Admin dao = new Admin();
	
	@Override
	public String execute() throws Exception {
		try {
			int isDeleted = dao.deleteUserDetails(uemail);
			if (isDeleted != 0) {
				msg = uname + " record deleted Successfully!";
			} else {
				msg = "error";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "DELETED";
	}

	public String getUemail() {
		return uemail;
	}

	public void setUemail(String uemail) {
		this.uemail = uemail;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}
	
	
	
	
}
