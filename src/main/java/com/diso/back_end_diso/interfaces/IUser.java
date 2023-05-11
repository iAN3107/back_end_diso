package com.diso.back_end_diso.interfaces;

import com.diso.back_end_diso.model.User;

import java.util.List;
import java.util.Optional;

public interface IUser {

    List<User> findAll();

    Optional<User> findById(Long id);

    User save(User user);

    void delete(Long id);
}
