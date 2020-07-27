
public class Fase4 {

	public static void main(String[] args) {
		String noms = new String("Aurora León Sarabia");
		
		System.out.println (noms);
		
		int dia = 24; 
		int mes= 7;
		int theany= 1988;
		
		System.out.println(dia + "/" + mes + "/" + theany);
		

		int any = 1948;
		byte bisiesto = 4;
		short miany= 1988;
		
		int diferenciaanys = miany - any;
		int anysbisiestos= diferenciaanys/bisiesto;

		
		for (int i = any; i <= miany; i = i + bisiesto) {
			any = i;
		}
				
		boolean isMianyBisiesto = (miany == any);
		
		if (isMianyBisiesto) {
			System.out.println("sí es bisiesto");
		} else  {
			System.out.println("no lo es");
		}
	}

}
