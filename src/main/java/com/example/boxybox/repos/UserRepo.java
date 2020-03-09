package com.example.boxybox.repos;

import com.example.boxybox.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Artsiom Andryianau
 *
 */
public interface UserRepo extends JpaRepository<User, Long> {

    User findByUsername(String username);
}