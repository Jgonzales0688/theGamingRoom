package com.gamingroom;
// Entity class acts as superclass for game, team and player classes. 

public class Entity {
	long id;
	String name;
	
	//default constructor
	public Entity(){
		
	}
	//constructor w/ name and identifier
	public Entity(long id, String name) {
		this.id = id;
		this.name = name;
	}
	
	// return id
	public long getId() {
		return this.id;
	}
	
	//return name
	public String getName() {
		return this.name;
	}
	
	@Override
	public String toString() {
		return "Entity [id = " + id + ", name = " + name + "]";
	}
	
}
