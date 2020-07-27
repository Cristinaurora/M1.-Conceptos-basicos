
public class Fase3 {

	public static void main(String[] args) {
		
		int any = 1948;
		byte bisiesto = 4;
		short miany= 1988;
		
		for (int i = any; i <= miany; i = i + bisiesto) {
			System.out.println(i);
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
