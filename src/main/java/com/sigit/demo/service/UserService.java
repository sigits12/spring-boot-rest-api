package com.sigit.demo.service;

import com.sigit.demo.entity.User;
import java.util.Collection;

/**
 * Date 12/09/20
 *
 * @author sigit
 */
public interface UserService {
    public User save(User user);
    public Boolean delete(String userId);
    public User update(User user);
    public User findByUserId(String empId);
    public Collection<User> getAllUsers();
}
