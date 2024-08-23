package com.example.makeTrust.enity.myRole;

import com.example.makeTrust.enity.User;
import jakarta.persistence.Entity;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@Getter
@Setter
public class Admin extends User {
}
