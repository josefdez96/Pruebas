import java.util.*;
public class TetAnimal {
	public static void main(String[] args){
	Animal animal1 = new Animal();
	Scanner teclado = new Scanner(System.in);
	System.out.print("Teclee el Nombre del Animal: ");
	animal1.setNombre(teclado.nextLine());
	System.out.print("Teclee la edad del animal: ");
	int edad = teclado.nextInt();
	animal1.setEdad(edad);
	animal1.nace();
	System.ou.println("Me llamo " + animal1.getNombre() +
	                  " y tengo + animal1.getEdad( + " años");
	}
}