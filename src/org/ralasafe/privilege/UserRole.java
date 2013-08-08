package org.ralasafe.privilege;

public class UserRole {
    private Object userId;
    private int roleId;

    public Object getUserId() {
        return userId;
    }

    public void setUserId(Object userId) {
        this.userId = userId;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public UserRole() {
    }

    public UserRole(Object userId, int roleId) {
        this.userId = userId;
        this.roleId = roleId;
    }
}
