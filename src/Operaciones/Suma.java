package Operaciones;

public class Suma extends Super{
	int resultado;
	
	void enviarSuma(int num1, int num2) {
		resultado = num1 + num2;
		
		super.setOperacion(resultado);
	}
		
}
