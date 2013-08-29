package org.ralasafe.servlet;

import javax.servlet.http.HttpServletRequest;
 
import org.ralasafe.privilege.PrivilegeManager;

public class PrivilegeMngAction extends AbstractTreeAction{
	public AbstractTreeHandler createTreeHandler(HttpServletRequest req){
		PrivilegeManager  manager=WebUtil.getPrivilegeManager(req);
		return new PrivilegeTreeHandler(manager);
	}
	
	
	

}
