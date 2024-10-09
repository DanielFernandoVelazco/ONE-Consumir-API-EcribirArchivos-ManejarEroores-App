package com.alura.screenmatch.principal;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PrincipalConBusqueda {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Escraba el nombre de una pelicula: ");
        var pelicula = teclado.nextLine();

        String direccion = "https://www.omdbapi.com/?t=" + pelicula + "&apikey=45f25040";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().
                uri(URI.create(direccion))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
    }
}
