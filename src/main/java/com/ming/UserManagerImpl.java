package com.ming;

/**
 * TargetObject
 */
public class UserManagerImpl implements IUserManager {


    @Override
    public boolean addUserInfo(String username, String password) throws Exception {
        System.out.println("=========UserManagerImpl.addUserInfo()=========");
        return false;
    }

    @Override
    public boolean delUserInfo(int id) throws Exception {
        System.out.println("=========UserManagerImpl.delUserInfo()=========");
        return false;
    }

    @Override
    public boolean modifyUserInfo(String username, String password, int id) throws Exception {
        System.out.println("=========UserManagerImpl.modifyUserInfo()=========");
        return false;
    }

    @Override
    public Object queryUserById(int id) throws Exception {
        System.out.println("=========UserManagerImpl.queryUserById()=========");
        return null;
    }
}
