import java.util.Scanner;

public class CasoDetective {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nombres = {"Victoria Mendoza", "Bruno Castellano", "Simon Quiroga", "Aurelio Vasquez"};
        
        int opcion = 0;

        System.out.println("=== CASO HIDDEN: INVESTIGACION ===");
        System.out.print("Cual es tu nombre?: ");
        String nombre = sc.nextLine();
        
        //edad
        System.out.print("¿Cual es tu edad?: ");
        int edad = sc.nextInt();
        
        if (edad < 12)
        {
            System.out.println("Los menores de 12 años no pueden ser detectives");
        }
        else if (edad >=12 && edad<=17)
        {
            System.out.println("Puedes ser detective junior");
        }
        else if (edad >=18 && edad<=59)
        {
            System.out.println("¡Bienvenido al equipo de detectives!");
        }
        else if (edad >= 60)
        {
            System.out.println("Detective senior con experiencia");
        }
        
        //pistas
        System.out.print("¡Cuantas pistas encontraste?: ");
        int pistas = sc.nextInt();
        
        if (pistas >= 5)
        {
            System.out.println("¡Eres un detective EXPERTO!");
            System.out.println("Puedes resolver el caso.");
        } 
        else if (pistas >= 3)
        {
           System.out.println("¡Buen trabajo detective!");
            System.out.println("Necesitas unas pistas más.");
        }
        else if (pistas >= 1)
        {
            System.out.println("¡Vas por buen camino!");
            System.out.println("¡Sigue investigando!");
        }
        else if (pistas == 0)
        {
            System.out.println("¡NO PUEDES TENER 0 PISTAS!");
            System.out.println("Necesitas al menos una.");
        }

        while (opcion != 3) {
            System.out.println("1. Interrogar");
            System.out.println("2. Resolver");
            System.out.println("3. Salir");
            opcion = sc.nextInt();

            if (opcion == 1) {
                System.out.println("¿A quien interrogas?");
                for (int i = 0; i < 4; i++) {
                    System.out.println(i + ". " + nombres[i]);
                }
                int s = sc.nextInt();
               
               
                if (s == 0) System.out.println("Victoria: 'Lavaba mi blusa por una mancha de vino tinto.' (Nota: ¡Sirvieron vino blanco!)");
                else if (s == 1) System.out.println("Bruno: 'Me hice la cicatriz arreglando una valla, puedes comprobarlo.'");
                else if (s == 2) System.out.println("Simon: '¡No escribi la nota! Solo la recogi del escritorio.'");
                else if (s == 3) System.out.println("Aurelio: 'Me fui a las 22:30...' (Nota: El taxista dice que lo recogio a las 00:15)");
                

            } else if (opcion == 2) {
                System.out.print("Escribe el nombre del culpable: ");
                sc.nextLine();
                String culpable = sc.nextLine().toLowerCase();

                if (culpable.contains("aurelio")) {
                    System.out.println("¡CORRECTO! Don Aurelio mintio sobre su hora de salida y enveneno la copa.");
                    opcion = 3;
                } else {
                    System.out.println("Incorrecto. Sigue buscando pistas.");
                }
            }
        }
        System.out.println("Buen trabajo, detective " + nombre);
    }
}
