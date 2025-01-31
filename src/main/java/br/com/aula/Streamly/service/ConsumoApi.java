package br.com.aula.Streamly.service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsumoApi {
    public String obterDados(String endereco) {
        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .GET()
                .header("accept", "application/json")
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiJ9.eyJhdWQiOiJjZTVhOGU2OGQ0OWJiZjIwOGIxNjQwMDI0MDNlOWI1MiIsIm5iZiI6MTczNzY3MTI5Ni45NCwic3ViIjoiNjc5MmMyODBmZWFjOWI3MTI2MjM3N2ZjIiwic2NvcGVzIjpbImFwaV9yZWFkIl0sInZlcnNpb24iOjF9.dpSttnK-vNU4yRWOBkDw0J0c366aWofigcZtp1MiZLs")
                .build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            if (response.statusCode() != 200) {
                throw new IOException("Erro na requisicao: " + response.statusCode());
            }
            return response.body();
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException("Erro ao consumir API", e);
        }
    }
}
