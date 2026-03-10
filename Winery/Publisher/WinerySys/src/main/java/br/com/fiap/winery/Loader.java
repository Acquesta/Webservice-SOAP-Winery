package br.com.fiap.winery;

import jakarta.xml.ws.Endpoint;

public class Loader {
    public static void main(String[] args) {
        WineStockServiceImplementation wineStock = new WineStockServiceImplementation();

        Endpoint.publish("http://localhost:8085/WineStockService", wineStock);
        
        System.out.println("Serviço publicado!");

        System.out.println("Pressione Ctrl+C para parar o servidor...");
        try {
            Thread.sleep(Long.MAX_VALUE);
        } catch (InterruptedException e) {
            System.out.println("Servidor interrompido.");
        }
    }
}