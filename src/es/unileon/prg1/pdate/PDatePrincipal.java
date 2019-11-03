package es.unileon.prg1.pdate;

public class PDatePrincipal {
	public static void main(String[] args)	{
		
		Date miFecha = new Date();
		Date miFecha2 = new Date(20,5,2020);
		System.out.println(miFecha);
		System.out.println(miFecha2);
		
		if(miFecha.isSameYear(miFecha2))
			System.out.println("- Es el mismo año");
		else
			System.out.println("- No es el mismo año");
		
		if(miFecha.isSameMonth(miFecha2))
			System.out.println("- Es el mismo mes");
		else
			System.out.println("- No es el mismo mes");
		
		if(miFecha.isSameDay(miFecha2))
			System.out.println("- Es el mismo día");
		else
			System.out.println("- No es el mismo día");
		
		if(miFecha.isSame(miFecha2))
			System.out.println("- Es la misma fecha");
		else
			System.out.println("- No es la misma fecha");
		
		if(miFecha.isSameYearNoif(miFecha2))
			System.out.println("- Es el mismo año");
		else
			System.out.println("- No es el mismo año");

		if(miFecha.isSameMonthNoif(miFecha2))
			System.out.println("- Es el mismo mes");
		else
			System.out.println("- No es el mismo mes");
		
		if(miFecha.isSameDayNoif(miFecha2))
			System.out.println("- Es el mismo día");
		else
			System.out.println("- No es el mismo día");
		
		if(miFecha.isSameNoif(miFecha2))
			System.out.println("- Es la misma fecha");
		else
			System.out.println("- No es la misma fecha");
		
		miFecha2.getMonth();
		
		if(miFecha2.checkDay())
			System.out.println("El día es incompatible");
		else
			System.out.println("El día es correcto");
		
		miFecha2.getSeason();
		
		System.out.println("Quedan "+miFecha2.daysLeft()+" meses para acabar el año");
		
		System.out.println("Fechas hasta fin de mes:");
		miFecha2.datesLeft();
		
		miFecha2.sameMonth();
	}
}