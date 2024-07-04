import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultarMonedas {

    public Monedas buscarMonedas(String monedaIngresada, String monedaAConvertir, double numeros){
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/54a1e4a8a7e0c3f34a3b14a4/pair/" + monedaIngresada + "/" + monedaAConvertir + "/"+ numeros);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

            try {
                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());
                return new Gson().fromJson(response.body(), Monedas.class);
            } catch (Exception e) {
                throw new RuntimeException("No se encontro la moneda");
            }
    }
}
