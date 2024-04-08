package es.jeiroa.exercises.leap;

public class Leap {

	public boolean isLeap1(int year) {
		// 3 comparisons are executed at most but 25% of years will only execute the first one
		return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
	}
	
	public boolean isLeap2(int year) {
		// 2 comparisons are executed but both are always done
		return year % 100  == 0 ? year % 400 == 0 : year % 4 == 0;
	}
	
	public boolean isLeap3(int year) {
		// 2 comparisons are executed at most but 25% of years will only execute one
		return year % 4  == 0 && year % 400 == 0;
	}
}
