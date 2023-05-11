package com.diso.back_end_diso.repository;

import com.diso.back_end_diso.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
