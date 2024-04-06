import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);      //Creo un objeto Scanner para guardar datos introducidos por teclado
        System.out.println("Escribe un frase: ");   //Pregunta la usuario para que introduzca una clase
        String frase = scan.nextLine();             //Variable que guardara la frase
        String[] palabras = frase.split(" "); //Array que separa la frase en las distintas palabras que la componen
        int vocal = 0;                              //Variables para contar vocales y consonantes
        int consonante =0;                          //Se inicializan a 0
        scan.close();                               //Se cierra el Scanner

        //Recorremos el array, cada elemento es una palabra de la frase introducida por el usuario
        for (int i = 0; i < palabras.length; i++) {
            char firstletter = palabras[i].toLowerCase().charAt(0);               //variable char que guarda la primera letra de cada palabra, en minusculas
            if (Character.toString(firstletter).matches("[aeiou]")){        //la condicion evalua que la primera letra haga match con las vocales, antes se pasa a String para poder usar el metodo matches
                System.out.println("'"+ palabras[i] + "' empieza por vocal");     //Imprimimos si es vocal
                vocal++;                                                          //Se incrementa la variable vocal
            } else{
                System.out.println("'"+ palabras[i]+ "' empieza por consonante"); //Imprimimos si es consonante
                consonante++;                                                     //Se incrementa la variable consonante
            }
        }


        //Este otro metodo para hacer el ejercicio usa un bucle do while y el if compara la firstLetter con las cinco
        //vocales, la principal diferencia es que en cada vuelta del bucle extrae la siguiente palabra de la frase con
        //el metodo scan.next() y la condicion del bucle es que siga habiendo next en la frase con el metodo scan.hasNext()

        //do {

        //    String palabra = scan.next();
        //    char firstLetter = palabra.toLowerCase().charAt(0);

        //    if (firstLetter == 'a' || firstLetter == 'e' || firstLetter == 'i' ||
        //        firstLetter == 'o' ||firstLetter == 'u'){

        //        System.out.println("'"+ palabra + "' empieza por vocal");
        //        vocal++;
        //    } else{
        //        System.out.println("'"+ palabra+ "' empieza por consonante");
        //        consonante++;
        //    }

        //} while (scan.hasNext());
        // scan.close();

        System.out.println("Tu frase tiene "+ vocal+" vocales y "+ consonante + " consonantes");
    }
}