package com.Learning.JavaOops;

public class MotorVechicle {
	
	private final int MAXSPEED = 300;
    private final int MINSPEED = 0;
    private int speed;
    
    public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {	
		this.speed = speed > MINSPEED && speed <= MAXSPEED ? speed : speed > MAXSPEED ? MAXSPEED : MINSPEED;
	}
    
     MotorVechicle() {
    	 this(5);
	}

	public MotorVechicle(int speed) {
		setSpeed(speed);
	}
    
    public void increaseSpeed(int howMuch) {
    	setSpeed(speed+howMuch);
    }
    public void decreaseSpeed(int howMuch) {
    	setSpeed(speed - howMuch);
    }
    
    public void start() {
    	System.out.println("Started");
    }
    public void stop() {
    	System.out.println("Engine Stop");
    	speed = 0;
    }
	
    public void currentSpeed() {
    	System.out.println("Current Speed of the Vechicle is " + getSpeed());
    }
}
