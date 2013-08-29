package org.ralasafe.servlet;

import javax.servlet.http.HttpServletRequest;

import org.ralasafe.entitle.QueryManager;

public class QueryMngAction  extends AbstractTreeAction{
	public AbstractTreeHandler createTreeHandler(HttpServletRequest req){
		QueryManager  manager=WebUtil.getQueryManager(req);
		return new QueryTreeHandler(manager);
	}
	
	
}
