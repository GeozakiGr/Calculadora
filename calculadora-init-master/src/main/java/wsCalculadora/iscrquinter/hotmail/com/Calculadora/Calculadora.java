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
	public double seno(double x)
	{
		double y = Math.toRadians(x);
		return Math.sin(y);
		}
	
	public double coseno(double x){
		double y = Math.toRadians(x);
		return Math.cos(y);

	}
	public double tangente(double x){
		double y = Math.toRadians(x);
		return Math.tan(y);

	}
		
	
    
}