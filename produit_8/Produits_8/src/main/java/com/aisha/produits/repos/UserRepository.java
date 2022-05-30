package com.aisha.produits.repos;
import org.springframework.data.jpa.repository.JpaRepository;

import com.aisha.produits.entities.User;
public interface UserRepository extends JpaRepository<User, Long> {
User findByUsername (String username);
}