package com.yourspresently.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;
//import com.project_giftshop.model.User;
import com.yourspresently.pojos.Users;

@Repository
public interface UserRepository extends JpaRepository<Users, Integer> {
    Optional<Users> findByEmail(String email); // Find user by email
    boolean existsByEmail(String email); // Check if email exists
}
