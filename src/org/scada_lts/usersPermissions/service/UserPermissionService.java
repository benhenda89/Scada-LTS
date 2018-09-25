package org.scada_lts.usersPermissions.service;

import org.scada_lts.usersPermissions.model.UserPermission;

import java.util.List;

/**
 * Class created by Arkadiusz Parafiniuk
 *
 * @Author arkadiusz.parafiniuk@gmail.com
 */
public interface UserPermissionService {

    UserPermission getUserPermission(String entityXid);

    List<UserPermission> getAllUserPermissions();

    void setUserPermission(int userId, String entityXid, int permission);

    boolean hasUserPermission(int userId, String entityXid, int permission);

}
