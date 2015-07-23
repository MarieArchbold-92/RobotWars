package com.kevinphair.robotwars;

/**
 * @author Kevin Phair, Sam Downes
 * Created 23 Jul 2015
 *
 */
public class ScoreBoard {

	int numTeams = 2;
	int[] wins = new int[numTeams];
	int[] draws = new int[numTeams];
	int[] losses = new int[numTeams];
	String[] teamName = new String[numTeams];

	public ScoreBoard (int teams) {
		this.numTeams = teams;
		for (int i = 0; i < this.numTeams; ++i) {
			this.wins[i] = 0;
			this.draws[i] = 0;
			this.losses[i] = 0;
			this.teamName[i] = "";
		}
	}

	public void setName (int team, String name) {
		this.teamName[team] = name;
	}

	public void addWin (int teamNumber){
		this.wins[teamNumber]++;
	}

	public void addLoss(int teamNumber){
		this.losses[teamNumber]++;
	}

	public void addDraw (int teamNumber){
		this.draws[teamNumber]++;
	}

	public int getWins(int teamNumber) {
		return this.wins[teamNumber];
	}

	public int getLosses(int teamNumber) {
		return this.losses[teamNumber];
	}

	public int getDraws(int teamNumber) {
		return this.draws[teamNumber];
	}

}
