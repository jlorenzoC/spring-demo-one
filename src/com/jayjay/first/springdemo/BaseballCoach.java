package com.jayjay.first.springdemo;

public class BaseballCoach implements Coach {

    // private field for the dependency
    private FortuneService fortuneService;

    // constructor for dependency injection
    public BaseballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes on batting practice";
    }

    @Override
    public String getDailyFortune() {

        // use my fortuneService to get a fortune
        return fortuneService.getFortune();
    }
}
