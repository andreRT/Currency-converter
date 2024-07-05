import java.util.Scanner;

public class ObtenerTasaCambio {
    Scanner lectura = new Scanner(System.in);
    private ConsultarMonedas consulta;

    public ObtenerTasaCambio() {
        this.consulta = new ConsultarMonedas();
    }

    public Double obtenerTasaCambio(String divisaBase, String divisaObjetivo) {
        try {
            Moneda valor = consulta.buscarMoneda(divisaBase);
            Double tasaCambio = valor.getConversion_rates().get(divisaObjetivo);
            if (tasaCambio == null) {
                throw new RuntimeException("No se encontró la tasa de cambio para la divisa objetivo.");
            }
            return tasaCambio;
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
            System.out.println("Ha ocurrido un error");
            return null;
        }
    }

    public void convertirMonto(String divisaBase, String divisaObjetivo, Double tasaCambio){
        System.out.println("Va a convertir " + divisaBase +" a " + divisaObjetivo);
        System.out.println("Ingrese el monto a convertir");
        Double monto = lectura.nextDouble();
        Double conversion = monto * tasaCambio;
        System.out.println(monto + " " + divisaBase + " equivalen a " + conversion + " " + divisaObjetivo);
    }
}
