import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        System.out.println("______________________________________________");
        System.out.println("Bienvenid/@ al convertidor de Monedas\t");
        System.out.println("_____                                     ____");
        System.out.println("Que opcion quieres realizar");
        System.out.println("(1). Dólar -->  Peso Argentino\n");
        System.out.println("(2). Peso Argenrino --> Dólar\n ");
        System.out.println("(3). Dólar --> Real Brasileño\n ");
        System.out.println("(4). Real Brasileño --> Dólar\n ");
        System.out.println("(5). Dólar --> Peso Colombiano\n ");
        System.out.println("(6). Peso Colombiano --> Dólar\n");
        System.out.println("_____                                     ____");
        System.out.println("(7). Salír\n");
        Scanner lectura = new Scanner(System.in);
        int eleccion = 0;
        String ingresado = "";
        String aConvertir = "";
        double numeros = 0;
        while (eleccion != 7) {
            System.out.println("Digita la opcion que deseas realizar");
            eleccion = lectura.nextInt();

            if (eleccion != 7) {

                System.out.println("digita el numero que deseas Convertir: ");
                numeros = lectura.nextInt();
                switch (eleccion) {
                    case 1:
                        ingresado = "USD";
                        aConvertir = "ARS";
                        break;
                    case 2:
                        ingresado = "ARS";
                        aConvertir = "USD";
                        break;
                    case 3:
                        ingresado = "USD";
                        aConvertir = "BRL";
                        break;
                    case 4:
                        ingresado = "BRL";
                        aConvertir = "USD";
                        break;
                    case 5:
                        ingresado = "USD";
                        aConvertir = "COP";
                        break;
                    case 6:
                        ingresado = "COP";
                        aConvertir = "USD";
                        break;
                    default:
                        System.out.println("Opcion no valida");
                }
            }
            ConsultarMonedas consulta = new ConsultarMonedas();
            Monedas conversor = consulta.buscarMonedas(ingresado, aConvertir, numeros);
            System.out.println(conversor);
        }

        System.out.println("Gracias por usar nuestro Conversor\n");
        System.out.println("Te esperamos pronto");

        


    }
}