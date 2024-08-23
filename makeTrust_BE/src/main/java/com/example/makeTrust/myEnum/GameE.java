package com.example.makeTrust.myEnum;

import com.example.makeTrust.exception.myErrorE;
import com.example.makeTrust.exception.myException;

public enum GameE {
    AOV("AOV", "Liên Quân Moblie", "Game moba chiến lược"),
    LOL("LOL", "Liên Minh Huyền Thoại", "Game chiến thuật đỉnh cao");

    private final String gameCode;
    private final String gameName;
    private final String gameDes;

    GameE(String gameCode, String gameName, String gameDes) {
        this.gameCode = gameCode;
        this.gameName = gameName;
        this.gameDes = gameDes;
    }

    public String getGameCode() {
        return gameCode;
    }

    public String getGameName() {
        return gameName;
    }

    public String getGameDes() {
        return gameDes;
    }

    public static GameE fromGameCode(String gameCode) {
        for (GameE game : GameE.values()) {
            if (game.getGameCode().equalsIgnoreCase(gameCode)) {
                return game;
            }
        }
        throw new myException(myErrorE.GameIsNotSupport);
    }
}
