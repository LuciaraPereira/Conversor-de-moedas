import com.google.gson.Gson;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class BuscadorDeMoedas {
    public Moedas buscaMoeda(String moedaBase) {
        String endereco = "https://v6.exchangerate-api.com/v6/e7977d6353fdaaa9d9cb4410/latest/" + moedaBase;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Moedas.class);
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException("Erro ao buscar dados da API", e);
        }
    }
}
