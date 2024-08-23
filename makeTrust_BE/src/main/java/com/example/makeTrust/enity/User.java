package com.example.makeTrust.enity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Table(name = "users")
@FieldDefaults(level = AccessLevel.PROTECTED)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public abstract class User {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    String userId;

    String username;
    String password;
    String email;
    String phone;

    @OneToOne
//    @JoinColumn(name = "image_id")
    Image image;






}
