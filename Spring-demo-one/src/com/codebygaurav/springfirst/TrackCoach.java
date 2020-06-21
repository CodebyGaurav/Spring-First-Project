package com.codebygaurav.springfirst;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;

	public TrackCoach() {
		
	}
	
	public TrackCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run TrackCOach ";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "just do it : "+fortuneService.getFortune();
	}

	// add in init method
	public void doMyStartupStuff() {
		System.out.println("TrackCoach : inside method doMyStartupStuff");
	}
	
	//add a destroy method
	public void doMyStartupStuffYoYo() {
		System.out.println("TrackCoach : inside method doMyStartupStuffYoYo");
	}
	
	
	
}
