package com.example.makeTrust.enity.myRole;

import com.example.makeTrust.enity.User;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Supplier extends User {
    @Column(name = "balance")
    Double balance;
}
