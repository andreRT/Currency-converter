import java.util.Map;

public record Moneda(Map<String, Double> conversion_rates) {
    public Map<String, Double> getConversion_rates() {
        return conversion_rates;
    }

    @Override
    public String toString() {
        return "Moneda{" +
                "conversion_rates=" + conversion_rates +
                '}';
    }
}
