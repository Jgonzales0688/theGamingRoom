package com.gamingroom;
import java.util.ArrayList;
import java.util.List;

/**
 * A simple class to hold information about a game
 * 
 * <p>
 * Notice the overloaded constructor that requires
 * an id and name to be passed when creating.
 * Also note that no mutators (setters) defined so
 * these values cannot be changed once a game is
 * created.
 * </p>
 * 
 * @author coce@snhu.edu
 *
 */

//Game Class to inherit from entity class - attributes and methods

public class Game extends Entity {
	//list of active teams
	private static List<Team> teams = new ArrayList<Team>();
	

	/**
	 * Constructor with an identifier and name
	 */
	public Game(long id, String name) {
		this.id = id;
		this.name = name;
	}
	
	//new team instance
	public Team addTeam(String name) {
		//local instance
		Team team = null;
		
		//Iterator - search for team name
		for (int i = 0; i <teams.size(); ++i) {
			if (name.equalsIgnoreCase(teams.get(i).getName())) {
				team = teams.get(i);
			}
		}
		if (team == null) {
			team = new Team((long)teams.size(), name);
			teams.add(team);
		}
		return team;
	}
	@Override
	public String toString() {
		return "Game[id = " + id + ", name = " + name + "]";
	}

}
