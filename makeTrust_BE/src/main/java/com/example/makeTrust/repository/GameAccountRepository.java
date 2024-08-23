package com.example.makeTrust.repository;

import com.example.makeTrust.enity.GameAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameAccountRepository extends JpaRepository<GameAccount, String > {
}
