package es.unileon.prg1.pdate;

public class Date {
	
	private int day;
	private int month;
	private int year;
	
	Date() {
		this.day = 1;
		this.month = 1;
		this.year = 2020;
	}
	
	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public boolean isSameYear(Date miFecha) {
		boolean retorno = false;
		
		if (this.year==miFecha.year)
			retorno=true;
		
		return retorno;
	}
	
	public boolean isSameMonth(Date miFecha) {
		boolean retorno = false;
		
		if (this.month==miFecha.month)
			retorno=true;
		
		return retorno;
	}
	
	public boolean isSameDay(Date miFecha) {
		boolean retorno = false;
		
		if (this.day==miFecha.day)
			retorno=true;
		
		return retorno;
	}
	
	/*isSameMonth
	isSameDay
	isSame*/

	@Override
	public String toString() {
		return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
	}
	
}

