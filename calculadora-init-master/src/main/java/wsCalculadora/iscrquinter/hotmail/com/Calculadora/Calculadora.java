package wsCalculadora.iscrquinter.hotmail.com.Calculadora;

public class Calculadora {

	public double suma(double x, double y) {
		return x + y;
	}

	public double resta(double x, double y) {
		return x-y;
	}

	public double multiplica(double x, double y) {
		return x * y;
	}
	public double divide(double x, double y){
	try {
		return x/y;
	
	} catch (Exception e) {
		return 0;
	}
		
	}
    
}