package com.skmangalam.spring;

public class BaseballCoach implements Coach {
	
	// 1. define a private field for the dependency
	private FortuneService fortuneService;
	
	// 2. define a constructor for dependency injection
	public BaseballCoach(FortuneService fortuneService)
	{
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout()
	{
		return "spend 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortunes() {
		
		// 3. use my fortuneService to get a fortune
		return fortuneService.getFortune();
	}
	
	public void doMyStartUpStuff() {
		System.out.println("TrackCoach : inside method doMyStartUpStuff");
	}
	
	public void doMyCleanUpStuff() {
		System.out.println("TrackCoach : inside method doMyCleanUpStuff");
	}
	
}
