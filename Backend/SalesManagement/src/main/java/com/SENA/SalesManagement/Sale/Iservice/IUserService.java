package com.SENA.SalesManagement.Sale.Iservice;

import java.util.List;
import com.SENA.SalesManagement.Sale.Entity.User;

public interface IUserService {

    List<User> findAll();

    User findById(String id);

    User save(User user);

    void delete(String id);
}