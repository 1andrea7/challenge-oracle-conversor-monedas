public record Monedas(String base_code,
                      String target_code,
                      double conversion_rates,
                      double conversion_result) {
    @Override
    public String toString() {
        return "( " + base_code + " )" + "Valor Final: " +
                conversion_result +
                "( " + target_code + " )";
    }
}
