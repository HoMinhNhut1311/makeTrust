package com.example.makeTrust.enity.myRole;

import com.example.makeTrust.enity.User;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Shopper extends User {
    @Column(name = "balance")
    Double balance;
}

