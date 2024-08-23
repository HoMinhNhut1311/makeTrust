package com.example.makeTrust.enity.myGame;

import com.example.makeTrust.enity.GameAccount;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class LmhtAc extends GameAccount {

    String TFT;
}
