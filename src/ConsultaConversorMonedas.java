import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaConversorMonedas {
    public MonedasApi buscaMoneda(String moneda){
        String apiKey = "e6eb86d491ded379a965ae61";
        URI direccion = URI
                .create("https://v6.exchangerate-api.com/v6/" + apiKey + "/latest/"
                        + moneda);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            // System.out.println(response.body());

            // Parsear la respuesta como un objeto JSON
            JsonElement jsonElement = JsonParser.parseString(response.body());
            JsonObject jsonObject = jsonElement.getAsJsonObject();

            // Obtener el objeto 'conversion_rates' del JSON
            JsonObject conversionRates = jsonObject.getAsJsonObject("conversion_rates");

            return new Gson().fromJson(conversionRates, MonedasApi.class);
        } catch (Exception e) {
            throw new RuntimeException("No se pudo convertir:" + e.getMessage());
        }
    }
}
