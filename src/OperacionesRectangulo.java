import java.util.Scanner;

public class OperacionesRectangulo {

	public static void main (String[] args) {
	
	  double altura;
	  double base;
          double result;

	  Rectangulo rectangulo= new Rectangulo();
          System.out.print("Estamos trabajando con un rectangulo");

	  Scanner sc = new Scanner(System.in);
          System.out.print("\ningresa la altura: ");
          altura = sc.nextDouble();

	  System.out.print("\ningresa la base: ");
          base = sc.nextDouble();
	  
	  rectangulo.setAltura(altura);
	  rectangulo.setBase(base);

	
	  result =  rectangulo.area();
	  System.out.println("El area del rectangulo: " + result); 
			
	  result =  rectangulo.perimetro();
	  System.out.println("El perimetro del rectangulo: " + result); 
	}

}