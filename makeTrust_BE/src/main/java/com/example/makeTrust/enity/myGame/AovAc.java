package com.example.makeTrust.enity.myGame;

import com.example.makeTrust.enity.GameAccount;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class AovAc extends GameAccount {

    Integer hero;
    Integer skin;
}
