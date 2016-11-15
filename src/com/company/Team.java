package com.company;

/**
 * Created by ryankielty on 11/15/16.
 */
public class Team {
    private int coaches;
    private int players;
    private String teamname;
    private String teamcolor;
    private boolean isUndefeated;
    private boolean isChampion;

    public int getCoaches() {
        return coaches;
    }
    public void setCoaches(int c) {
        coaches = c;
    }

    public int getPlayers() {
        return players;
    }
    public void setPlayers(int p) {
        players = p;
    }

    public String getTeamname() {
        return teamname;
    }
    public void setTeamname(String n) {
        teamname = n;
    }

    public String getTeamcolor() {
        return teamcolor;
    }
    public void setTeamcolor(String r) {
        teamcolor = r;
    }

    public boolean isSeasonchamps() {
        return isUndefeated;
    }
    public void setSeasonchamps(boolean u) {
        isUndefeated = u;
    }

    public boolean isPlayoffchamps() {
        return isChampion;
    }
    public void setPlayoffchamps(boolean w) {
        isChampion = w;
    }
}
