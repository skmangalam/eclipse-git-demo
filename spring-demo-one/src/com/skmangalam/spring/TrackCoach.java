package com.skmangalam.spring;

public class TrackCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run a hard 5K";
	}

	@Override
	public String getDailyFortunes() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void doMyStartUpStuff() {
		System.out.println("TrackCoach : inside method doMyStartUpStuff");
	}
	
	public void doMyCleanUpStuff() {
		System.out.println("TrackCoach : inside method doMyCleanUpStuff");
	}

}
