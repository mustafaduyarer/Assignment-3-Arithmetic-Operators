package Assignment3;

public class Question5 {

	public static void main(String[] args) {
		
		// Question-5
	
	
		int seconds = 3695 ; 
		System.out.println("Original seconds value "  + seconds );
		
		int minutes , hours ; 
		int secondsRemainingAfterHour ; 
		
		hours = seconds/3600 ;  
		secondsRemainingAfterHour =  seconds % 3600 ; 
		minutes = secondsRemainingAfterHour / 60 ;  
		
		
		
		seconds = secondsRemainingAfterHour % 60 ;  
	
		System.out.println(hours + " hours  "  +  minutes + " minutes " + seconds + " second ");
		

	
	
	}
	
}