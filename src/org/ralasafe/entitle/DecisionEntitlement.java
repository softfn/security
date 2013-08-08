package org.ralasafe.entitle;

/**
 * A decision rule. A (decision) privilege can contain many rules.
 * A rule descibes privilege/userCategory/businessData/ relationship.
 * <p/>
 * Unique index(privilegeId, userCategoryId, businessDataId).
 * For a certain privilege, a certain usercategory may be refed by many businessdata.
 */
public class DecisionEntitlement {
    public static final String DENY = "deny";
    public static final String PERMIT = "permit";
    /**
     * privilege id, it must be leaf node
     */
    private int privilegeId;
    private int userCategoryId;
    private int businessDataId;
    private int id;
    private String effect;
    private String denyReason;
    private UserCategory userCategory;
    private BusinessData businessData;

    public int getPrivilegeId() {
        return privilegeId;
    }

    public void setPrivilegeId(int privilegeId) {
        this.privilegeId = privilegeId;
    }

    public int getUserCategoryId() {
        return userCategoryId;
    }

    public void setUserCategoryId(int userCategoryId) {
        this.userCategoryId = userCategoryId;
    }

    public int getBusinessDataId() {
        return businessDataId;
    }

    public void setBusinessDataId(int businessDataId) {
        this.businessDataId = businessDataId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEffect() {
        return effect;
    }

    public void setEffect(String effect) {
        this.effect = effect;
    }

    public String getDenyReason() {
        return denyReason;
    }

    public void setDenyReason(String denyReason) {
        this.denyReason = denyReason;
    }

    public UserCategory getUserCategory() {
        return userCategory;
    }

    public void setUserCategory(UserCategory userCategory) {
        this.userCategory = userCategory;
    }

    public BusinessData getBusinessData() {
        return businessData;
    }

    public void setBusinessData(BusinessData businessData) {
        this.businessData = businessData;
    }
}
