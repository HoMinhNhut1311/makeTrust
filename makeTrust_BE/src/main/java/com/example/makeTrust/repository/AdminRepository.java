package com.example.makeTrust.repository;

import com.example.makeTrust.enity.myRole.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin, String> {
}
