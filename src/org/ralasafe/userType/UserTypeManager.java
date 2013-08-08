package org.ralasafe.userType;

import java.util.Collection;

import org.ralasafe.EntityExistException;

public interface UserTypeManager {

    public abstract Collection getAllUserTypes();

    public abstract UserType getUserType(String name);

    public abstract UserType getUserTypeCopy(String name);

    public abstract void addUserType(UserType userType) throws EntityExistException;

    public abstract void deleteUserType(String name);

    public abstract void updateUserType(UserType userType);

    public abstract Collection getApplications(String userTypeName);
}

