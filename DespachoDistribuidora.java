import java.util.Scanner;  // Importa la clase Scanner de la biblioteca java.util para leer la entrada del usuario

public class DespachoDistribuidora {  // Define una clase pública llamada DespachoDistribuidora, que debe coincidir con el nombre del archivo
    public static void main(String[] args) {  // Método principal, punto de entrada de la aplicación. 'public' hace que el método sea accesible desde cualquier lugar. 'static' significa que este método pertenece a la clase y no a instancias. 'void' indica que no devuelve valor.
        
        Scanner scanner = new Scanner(System.in);  // Crea una instancia de la clase Scanner para leer datos del flujo de entrada estándar (teclado). 'System.in' es la entrada estándar del sistema.

        // Declaración de variables para almacenar datos ingresados por el usuario
        String marca;  // Declara una variable de tipo String para almacenar la marca del vehículo
        String modelo;  // Declara una variable de tipo String para almacenar el modelo del vehículo
        String cilindrada;  // Declara una variable de tipo String para almacenar la cilindrada del vehículo
        String tipoCombustible;  // Declara una variable de tipo String para almacenar el tipo de combustible del vehículo
        int capacidadPasajeros;  // Declara una variable de tipo int (entero) para almacenar la capacidad de pasajeros del vehículo

        // Solicitar y leer datos del usuario
        System.out.print("Ingrese la marca: ");  // Muestra un mensaje en la consola solicitando la marca del vehículo
        marca = scanner.nextLine();  // Lee una línea de texto ingresada por el usuario y la asigna a la variable 'marca'

        System.out.print("Ingrese el modelo: ");  // Muestra un mensaje en la consola solicitando el modelo del vehículo
        modelo = scanner.nextLine();  // Lee una línea de texto ingresada por el usuario y la asigna a la variable 'modelo'

        System.out.print("Ingrese la cilindrada: ");  // Muestra un mensaje en la consola solicitando la cilindrada del vehículo
        cilindrada = scanner.nextLine();  // Lee una línea de texto ingresada por el usuario y la asigna a la variable 'cilindrada'

        System.out.print("Ingrese el tipo de combustible: ");  // Muestra un mensaje en la consola solicitando el tipo de combustible
        tipoCombustible = scanner.nextLine();  // Lee una línea de texto ingresada por el usuario y la asigna a la variable 'tipoCombustible'

        System.out.print("Ingrese la capacidad en pasajeros: ");  // Muestra un mensaje en la consola solicitando la capacidad de pasajeros
        capacidadPasajeros = scanner.nextInt();  // Lee un entero ingresado por el usuario y lo asigna a la variable 'capacidadPasajeros'

        // Mostrar los datos ingresados por el usuario
        System.out.println("La marca que ha ingresado es: " + marca);  // Muestra el texto combinado con el valor de la variable 'marca' en la consola
        System.out.println("El modelo que ha ingresado es: " + modelo);  // Muestra el texto combinado con el valor de la variable 'modelo' en la consola
        System.out.println("La cilindrada que ha ingresado es: " + cilindrada);  // Muestra el texto combinado con el valor de la variable 'cilindrada' en la consola
        System.out.println("El tipo de combustible es: " + tipoCombustible);  // Muestra el texto combinado con el valor de la variable 'tipoCombustible' en la consola
        System.out.println("Tiene una capacidad de " + capacidadPasajeros + " pasajeros.");  // Muestra el texto combinado con el valor de la variable 'capacidadPasajeros' en la consola
        
        scanner.close();  // Cierra el objeto Scanner para liberar los recursos asociados con él. Es una buena práctica cerrar el Scanner cuando ya no se necesita.
    }  // Cierra el método main
}  // Cierra la clase DespachoDistribuidora
