package com.example.makeTrust.enity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "games")
public class Game {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        Integer gameId;

        String gameName;

        @Column(columnDefinition = "unique")
        String gameCode;

        @OneToMany(mappedBy = "game", cascade = CascadeType.ALL)
        Set<GameAccount> gameAccounts;

}
