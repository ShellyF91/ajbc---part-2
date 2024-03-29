package models;

import org.bson.codecs.pojo.annotations.BsonProperty;

import com.google.gson.annotations.SerializedName;

public class Room {
	
	private int number; 
	@BsonProperty(value = "has_bath")
	private boolean hasBath;
	@BsonProperty(value = "max_guests")
	private int maxGuests;


	public Room(int number, boolean hasBath, int maxGuests) {
		this.number = number;
		this.hasBath = hasBath;
		this.maxGuests = maxGuests;
	}

	public Room() {}


	public int getNumber() {
		return number;
	}


	public void setNumber(int number) {
		this.number = number;
	}


	public boolean isHasBath() {
		return hasBath;
	}


	public void setHasBath(boolean hasBath) {
		this.hasBath = hasBath;
	}


	public int getMaxGuests() {
		return maxGuests;
	}

	public void setMaxGuests(int maxGuests) {
		this.maxGuests = maxGuests;
	}

	@Override
	public String toString() {
		return "Room [number=" + number + ", hasBath=" + hasBath + ", maxGuests=" + maxGuests + "]";
	}


	


	
	
	
	

}
