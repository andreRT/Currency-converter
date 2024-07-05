import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ObtenerTasaCambio obtenerTasa = new ObtenerTasaCambio();
        Double tasaCambio;
        String divisaBase;
        String divisaObjetivo;
        int bandera = 1;
        while(bandera==1){
            System.out.println("\n**********************************************\n" +
                    "----Conversor de Monedas----\n\n" +
                    "Seleccione una opción\n" +
                    "1) Dolar -> Peso Argentino\n" +
                    "2) Peso Argentino -> Dolar\n" +
                    "3) Dolar -> Real Brasileño\n" +
                    "4) Real Brasileño -> Dolar\n" +
                    "5) Dolar -> Peso Colombiano\n" +
                    "6) Peso Colombiano -> Dolar\n" +
                    "7) Dolar -> Peso Mexicano\n" +
                    "8) Peso Mexicano -> Dolar\n" +
                    "9) Salir\n\n" +
                    "Escriba únicamente el número de la opción");

            int opcion = lectura.nextInt();

            switch (opcion){
                case 1:
                    divisaBase = "USD";
                    divisaObjetivo = "ARS";
                    tasaCambio = obtenerTasa.obtenerTasaCambio(divisaBase, divisaObjetivo);
                    obtenerTasa.convertirMonto(divisaBase, divisaObjetivo, tasaCambio);
                    break;
                case 2:
                    divisaBase = "ARS";
                    divisaObjetivo = "USD";
                    tasaCambio = obtenerTasa.obtenerTasaCambio(divisaBase, divisaObjetivo);
                    obtenerTasa.convertirMonto(divisaBase, divisaObjetivo, tasaCambio);
                    break;
                case 3:
                    divisaBase = "USD";
                    divisaObjetivo = "BRL";
                    tasaCambio = obtenerTasa.obtenerTasaCambio(divisaBase, divisaObjetivo);
                    obtenerTasa.convertirMonto(divisaBase, divisaObjetivo, tasaCambio);
                    break;
                case 4:
                    divisaBase = "BRL";
                    divisaObjetivo = "USD";
                    tasaCambio = obtenerTasa.obtenerTasaCambio(divisaBase, divisaObjetivo);
                    obtenerTasa.convertirMonto(divisaBase, divisaObjetivo, tasaCambio);
                    break;
                case 5:
                    divisaBase = "USD";
                    divisaObjetivo = "COP";
                    tasaCambio = obtenerTasa.obtenerTasaCambio(divisaBase, divisaObjetivo);
                    obtenerTasa.convertirMonto(divisaBase, divisaObjetivo, tasaCambio);
                    break;
                case 6:
                    divisaBase = "COP";
                    divisaObjetivo = "USD";
                    tasaCambio = obtenerTasa.obtenerTasaCambio(divisaBase, divisaObjetivo);
                    obtenerTasa.convertirMonto(divisaBase, divisaObjetivo, tasaCambio);
                    break;
                case 7:
                    divisaBase = "USD";
                    divisaObjetivo = "MXN";
                    tasaCambio = obtenerTasa.obtenerTasaCambio(divisaBase, divisaObjetivo);
                    obtenerTasa.convertirMonto(divisaBase, divisaObjetivo, tasaCambio);
                    break;
                case 8:
                    divisaBase = "MXN";
                    divisaObjetivo = "USD";
                    tasaCambio = obtenerTasa.obtenerTasaCambio(divisaBase, divisaObjetivo);
                    obtenerTasa.convertirMonto(divisaBase, divisaObjetivo, tasaCambio);
                    break;
                case 9:
                    bandera = 0;
                    System.out.println("Hasta luego!!");
                    break;
            }

            System.out.println("Programa Finalizado");
        }

    }
}
