package es.unileon.prg1.pdate;

public class pdatePrincipal {
	public static void main(String[] args)	{
		
		Date miFecha = new Date();
		Date miFecha2 = new Date(1,11,2019);
		System.out.println(miFecha);
		System.out.println(miFecha2);
		
		if(miFecha.isSameYear(miFecha2))
			System.out.println("Es el mismo año");
		else
			System.out.println("No es el mismo año");
		
		if(miFecha.isSameMonth(miFecha2))
			System.out.println("Es el mismo mes");
		else
			System.out.println("No es el mismo mes");
		
		if(miFecha.isSameDay(miFecha2))
			System.out.println("Es el mismo día");
		else
			System.out.println("No es el mismo día");
	}
}