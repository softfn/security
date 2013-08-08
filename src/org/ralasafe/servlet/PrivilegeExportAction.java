package org.ralasafe.servlet;

import java.io.IOException;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.ralasafe.privilege.PrivilegeManager;

public class PrivilegeExportAction extends Action {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        PrivilegeManager pvlgMng = WebUtil.getPrivilegeManager(req);

        Collection businessPrivileges = pvlgMng.getAllBusinessPrivileges();
        Collection nonRolePrivileges = pvlgMng.getAllNonRolePrivileges();

        req.setAttribute("businessPrivileges", businessPrivileges);
        req.setAttribute("nonRolePrivileges", nonRolePrivileges);

        WebUtil.forward(req, resp, "/ralasafe/privilege/constants.jsp");
    }
}
