package org.ralasafe.servlet;

import javax.servlet.http.HttpServletRequest;

import org.ralasafe.privilege.PrivilegeManager;

public class NonRolePrivilegeMngAction extends AbstractTreeAction{

	 
	public AbstractTreeHandler createTreeHandler(HttpServletRequest req) {
		PrivilegeManager  manager=WebUtil.getPrivilegeManager(req);
		return new NonRolePrivilegeTreeHandler(manager);
	}

}
