package Program;

public class CarroCombustivel {

	public static void main(String[] args) {

		
	int distancia = 500;
	double tanqueGasolina = 50;
	double quilometrosPorLitro = 12;
	double consumoPorQuilometro = 1 / quilometrosPorLitro;
	
	for (int decorrido = 1; decorrido <= distancia; decorrido ++){
	
		tanqueGasolina -= consumoPorQuilometro;
		System.out.println("Quilometros rodados: "+ decorrido);
		
		if(tanqueGasolina <=0) {
		System.out.println("Acabou a gasolina.");
		break;
		
		}
	
	}
	}
}





