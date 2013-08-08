package org.ralasafe.servlet;

import javax.servlet.http.HttpServletRequest;

import org.ralasafe.entitle.UserCategory;
import org.ralasafe.entitle.UserCategoryManager;

public class UserCategoryPolicyAction extends AbstractPolicyAction {
    //private static final Log log=LogFactory.getLog( UserCategoryPolicyServlet.class );


    public boolean isRawScript(HttpServletRequest req) {
        int id = WebUtil.getIntParameter(req, "id", 0);

        UserCategoryManager manager = WebUtil.getUserCategoryManager(req);
        UserCategory uc = manager.getUserCategory(id);

        org.ralasafe.script.UserCategory script = uc.getScriptUserCategory();
        return script.isRawScript();
    }
}
