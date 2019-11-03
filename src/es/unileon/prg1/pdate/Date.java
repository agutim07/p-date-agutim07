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
	
	void getMonth() {
		System.out.println("El mes "+this.month+" es:");
		if (this.month==1) System.out.println("- Enero");
		if (this.month==2) System.out.println("- Febrero");
		if (this.month==3) System.out.println("- Marzo");
		if (this.month==4) System.out.println("- Abril");
		if (this.month==5) System.out.println("- Mayo");
		if (this.month==6) System.out.println("- Junio");
		if (this.month==7) System.out.println("- Julio");
		if (this.month==8) System.out.println("- Agosto");
		if (this.month==9) System.out.println("- Septiembre");
		if (this.month==10) System.out.println("- Octubre");
		if (this.month==11) System.out.println("- Noviembre");
		if (this.month==12) System.out.println("- Diciembre");
	}
	
	public boolean checkDay() {
		boolean retorno=false;
		if (this.day>31) retorno=true;
		if (this.day==31 && (this.month==2 || this.month==4 || this.month==6 || this.month==9 || this.month==11))
				retorno=true;
		if (this.day>28 && this.month==2) retorno=true;
		return retorno;
	}
	
	void getSeason() {
		System.out.println("La estación del mes "+this.month+" es (normalmente):");
		if (this.month==1 || this.month==2 || this.month==3) 
			System.out.println("- Invierno");
		if (this.month==4 || this.month==5 || this.month==6) 
			System.out.println("- Primavera");
		if (this.month==7 || this.month==8 || this.month==9) 
			System.out.println("- Verano");
		if (this.month==10 || this.month==11 || this.month==12) 
			System.out.println("- Otoño");
	}
	
	public int daysLeft() {
		return 12-this.month;	
	}
	
	void datesLeft() {
		if (this.month==4 || this.month==6 || this.month==9 || this.month==11) {
			for(int i=this.day; i<=30; i++) 
				this.day=this.day+1;
				System.out.println("- Date: "+(this.day)+"-"+this.month+"-"+this.year);
		}
		if (this.month==1 || this.month==3 || this.month==5 || this.month==7 || this.month==8 || this.month==10 || this.month==12) {
			for(int i=this.day; i<=31; i++) 
				this.day=this.day+1;
				System.out.println("- Date: "+(this.day)+"-"+this.month+"-"+this.year);
		}
		if (this.month==2) {
			for(int i=this.day; i<=28; i++) 
				this.day=this.day+1;
				System.out.println("- Date: "+(this.day)+"-"+this.month+"-"+this.year);
		}
	}
	
	@Override
	public String toString() {
		return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
	}
	
}

