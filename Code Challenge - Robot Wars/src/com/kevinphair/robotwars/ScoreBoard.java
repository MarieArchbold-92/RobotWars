package com.kevinphair.robotwars;

/**
 * @author Kevin Phair, Sam Downes
 * Created 23 Jul 2015
 *
 */
public class ScoreBoard {

	static int numTeams = 2;
	static int[] wins = new int[numTeams];
	static int[] draws = new int[numTeams];
	static int[] losses = new int[numTeams];
	static String[] teamName = new String[numTeams];
	
	public ScoreBoard (int teams) {
		this.numTeams = teams;
		for (int i = 0; i < numTeams; ++i) {
			wins[i] = 0;
			draws[i] = 0;
			losses[i] = 0;
			teamName[i] = "";
		}
	}
	
	public void setName (int team, String name) {
		this.teamName[team] = name;
	}
	
}
