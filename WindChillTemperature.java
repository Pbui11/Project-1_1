/*
 * Class: CMSC201 
 * Instructor:Ashique Tanveer
 * Description: Write a program to measure the coldness using temperature and wind speed.
 * Due: 09/09/2020
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Name: Phuc Bui
*/

import java.util.Scanner;//import the Scanner class
 
public class WindChillTemperature {

	public static void main(String[] args) {
		Scanner reader = new Scanner (System.in);//Create a Scanner
		
		double t_a;//The outside temperature measured in degrees Fahrenheit
		double v = 0;//The wind speed measured in miles per hour
		double t_wc;//The wind-chill temperature
		
		
		
		do {
		System.out.println("Enter the temperature in Fahrenheit between -58°F and 41°F: ");
		t_a = reader.nextDouble();
		}
		
		while (t_a < -58 || t_a > 41);
		
		do {
		System.out.println("Enter the wind speed (>=2)in miles per hour: ");
		v = reader.nextDouble();
		}
		while (v<2);
		
		final double A = 35.74;
		final double B = 0.6215;
		final double C = 35.75;
		final double D = 0.4275;
		double e = Math.pow(v,0.16);
		
		//Formula 
		t_wc = A+(B*t_a)-(C*e)+(D*t_a*e);
		System.out.printf("The wind chill index is: %.5f",t_wc);
		reader.close();
	}
	
}
