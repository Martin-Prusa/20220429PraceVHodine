package com.example.pracevhodine.models;

import java.util.List;

public class PlayersGroup {
    private List<ChessPlayer> players;

    public PlayersGroup(List<ChessPlayer> players) {
        this.players = players;
    }

    public int getCount() {
        return players.size();
    }

    public List<ChessPlayer> getPlayers() {
        return players;
    }
}
