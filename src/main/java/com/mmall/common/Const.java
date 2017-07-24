package com.mmall.common;

/**
 * Created by weiwei on 2017/7/23.
 */
public class Const {

    public static final String CURRENT_USER = "currentUser";
    // 接口:实现的用户角色分组
    public interface Role {
        int ROLE_CUSTOMER = 0; // 普通用户
        int ROLE_ADMIN = 1; // 管理员
    }

    public static final String USER_NAME = "username";
    public static final String EMAIL = "email";
}
