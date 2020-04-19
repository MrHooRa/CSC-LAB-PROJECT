/*
 * 
 * Salman Alessa
 * UID: 439100011
 * 
 */
public class Date {

	// private variables
	private int day;
	private int month;
	private int year;
	
	
	// I want to use array in this project to make it easy!
	// [days]
	private int[] c = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};	
	
	// Methods
	
	// Setter methods
	public void setDay(int day) {
		this.day = day;
	}
	
	public void setMonth(int month) {
		this.month = month;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	// Getter methods
	
	public int getDay() {
		return this.day;
	}
	
	public int getMonth() {
		return this.month;
	}
	
	public int getYear() {
		return this.year;
	}
	

	// - - - - - - - - - - - - - //
	
	// Default constructor [1/1/2001]
	public Date() {
		this.day = 1;
		this.month = 1;
		this.year = 2001;
	}
	
	// Increment (add 1 to day)
	// If date 31/12/2011 >> 1/1/2012
	public void Increment() {
		
		// array start from 0 & months start from 1!
		int month = this.month - 1;
		
		// Check if day is more than days in month ( month 1 (31 days) there are no day 32!)
		if(this.day >= c[month]) {
			
			// new month mean day should be 1!
			this.day = 1;
			
			// Check if month is less than 12 or not
			if(this.month < 12) this.month = this.month + 1;
			else {
				this.month = 1;
				this.year = this.year + 1;
			}
		
		// If day is less than 31 or 30 or whatever
		// Add 1
		}else 
			this.day++;
	}
	
	public void Decrement() {
		// array start from 0 & months start from 1!
		int month = this.month - 1; // 1
		
		// Check if day is less than days in month ( month 1 (31 days) there are no day 0!)
		if(this.day == 1) {
			
			// Check if month is 1
			if(this.month == 1) {
				this.month = 12; 
				this.year--;
			}else 
				this.month--; 
			
			// new month mean day should NNNOOOOTTTT be 1!
			month = this.month - 1;
			this.day = c[month];
		
		// If day is less than 31 or 30 or whatever
		// Add 1
		}else
			this.day--;
	}
	
	public int getMaxDay(int month) {
		if(month > 0)
			return c[(--month)];
		else
			return 0;
	}
	
	// Read form user
	public void Read(int day, int month, int year) {
		
		// Check if month is not between 1-12
		if(month < 0 || month > 12) {
			if(day > c[--month] || day< 1)
				System.out.println("ERROR: month " + ++month + " cannont be " + day);
		}else {
			this.day = day;
			this.month = month;
			this.year = year;
		}
	}
	
	// Print date
	public void diplay() {
		System.out.println(this.day + "/" + this.month + "/" + this.year);
	}
}
