package org.ralasafe.servlet;

import javax.servlet.http.HttpServletRequest;

import org.ralasafe.entitle.BusinessDataManager;

public class BusinessDataMngAction extends AbstractTreeAction {
    public AbstractTreeHandler createTreeHandler(HttpServletRequest req) {
        BusinessDataManager manager = WebUtil.getBusinessDataManager(req);
        return new BusinessDataTreeHandler(manager);
    }
}
