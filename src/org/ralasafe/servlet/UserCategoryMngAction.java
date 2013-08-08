package org.ralasafe.servlet;

import javax.servlet.http.HttpServletRequest;

import org.ralasafe.entitle.UserCategoryManager;

public class UserCategoryMngAction extends AbstractTreeAction {
    public AbstractTreeHandler createTreeHandler(HttpServletRequest req) {
        UserCategoryManager manager = WebUtil.getUserCategoryManager(req);

        return new UserCategoryTreeHandler(manager);
    }
}
