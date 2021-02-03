package com.crud.action;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.crud.model.UserBean;
import com.crud.dao.Admin;
import com.opensymphony.xwork2.ActionSupport;

public class ReportAction extends ActionSupport {

	
	private static final long serialVersionUID = 1L;
	ResultSet rs = null;
	UserBean bean = null;
	List<UserBean> beanList = null;
	Admin dao = new Admin();
	private boolean noData = false;
	
	@Override
	public String execute() throws Exception {
		try {
			beanList = new ArrayList<UserBean>();
			rs = dao.report();
			int i = 0;
			
//			System.out.print(rs);
			
			if(rs != null) {
				while (rs.next()) {
					i++;
					bean = new UserBean();
					bean.setSrNo(i);
					bean.setUname(rs.getString("uname"));
					bean.setUemail(rs.getString("uemail"));
					bean.setUpass(rs.getString("upass").replaceAll("(?s).", "*"));
					bean.setUdeg(rs.getString("udeg"));
					beanList.add(bean);
				}
			}
			if (i == 0) {
				noData = false;
			} else {
				noData = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "REPORT";
	}

	public List<UserBean> getBeanList() {
		return beanList;
	}

	public void setBeanList(List<UserBean> beanList) {
		this.beanList = beanList;
	}

	public boolean isNoData() {
		return noData;
	}

	public void setNoData(boolean noData) {
		this.noData = noData;
	}
	
	
	
}
