package com.chris.springproject;

import java.util.Random;

public class RandomFortuneService implements FortuneService {
	
	private String[] data = {
			"Beware of the wolf in sheep's clothing",
			"Dilegence is the member of good luck",
			"The journey is the reward"
	};
	
	private Random myRandom = new Random();

	@Override
	public String getFortune() {
		int index = myRandom.nextInt(data.length);
		
		String theFortune = data[index];
		
		return theFortune;
	}

}
