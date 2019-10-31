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
		System.out.println("Opciones con if:");
		
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
	
	public boolean isSame(Date miFecha) {
		boolean retorno = false;
		if (this.day==miFecha.day && this.month==miFecha.month && this.year==miFecha.year);
			retorno=true;
		
		return retorno;
	}
	
	public boolean isSameYearNoif(Date miFecha) {
			System.out.println("Opciones sin if:");
			return (this.year==miFecha.year);
	}
	
	public boolean isSameMonthNoif(Date miFecha) {
			return (this.month==miFecha.month);
	}
	
	
	public boolean isSameDayNoif(Date miFecha) {
			return (this.day==miFecha.day);
	}
	
	public boolean isSameNoif(Date miFecha) {
		return (this.day==miFecha.day && this.month==miFecha.month && this.year==miFecha.year);
	}
	
	
	@Override
	public String toString() {
		return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
	}
	
}

