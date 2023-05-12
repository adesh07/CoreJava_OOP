package com.rays.interface1;

public class Businessman extends Person implements Rich_man, SocialWorker {

	public void helpToOthers() {
        // b/c this class "implements" SocialWorker class 
	}

	public void earnMoney() {
		// b/c this class "implements" Rich_man class
	}

	public void donation() {
		// b/c this class "implements" Rich_man class
	}

	public void party() {
		// b/c this class "implements" Rich_man class
	}

	public void name() {
         // b/c this class "extends" Person class
	}
}
