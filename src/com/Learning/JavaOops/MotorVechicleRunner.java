package com.Learning.JavaOops;

public class MotorVechicleRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       MotorVechicle ducati = new MotorVechicle(10);
       MotorVechicle honda = new MotorVechicle();
       
       ducati.start();
       honda.start();
       ducati.increaseSpeed(250);
       honda.increaseSpeed(200);
        
       ducati.currentSpeed();
       honda.currentSpeed();
     
       ducati.stop();
       honda.stop();
       
       ducati.currentSpeed();
       honda.currentSpeed();
       
	}

}
