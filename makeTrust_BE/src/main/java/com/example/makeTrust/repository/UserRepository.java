package com.example.makeTrust.repository;

import com.example.makeTrust.enity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
