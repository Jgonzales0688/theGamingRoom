package com.gamingroom;
import java.util.ArrayList;
import java.util.List;
/**
 * A simple class to hold information about a team
 * <p>
 * Notice the overloaded constructor that requires
 * an id and name to be passed when creating.
 * Also note that no mutators (setters) defined so
 * these values cannot be changed once a team is
 * created.
 * </p>
 * @author coce@snhu.edu
 *
 */
public class Team extends Entity {
	
	//active player list
	private static List<Player> players = new ArrayList<Player>();
	
	/*
	 * Constructor with an identifier and name
	 */
	public Team(long id, String name) {
		this.id = id;
		this.name = name;
	}

	//new team instance
	public Player addplayer(String name) {
		//local team instance
		Player player = null;
		
		//iterator - search for team name
		for(int i = 0; i < players.size(); ++i) {
			if (name.equalsIgnoreCase(players.get(i).getName())) {
				player = players.get(i);
				}
			}
		//if not found make new team instance - add to team list
		if(player == null) {
			player = new Player((long) players.size(), name);
			players.add(player);
		}
		return player;
	}

	@Override
	public String toString() {
		return "Team [id=" + id + ", name=" + name + "]";
	}
}
