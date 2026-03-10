package br.com.fiap.winery;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;

import jakarta.xml.ws.Service;

public class ApplicationClient2 {
    public static void main(String[] args) throws MalformedURLException {
        final String WSDL = "http://localhost:8085/WineStockService?wsdl";
        final String TARGET = "http://winery.fiap.com.br/";
        final String NAME = "WineStockServiceImplementationService";

            URL url = new URL(WSDL);

            QName qName = new QName(TARGET, NAME);

            Service service = Service.create(url, qName);

            WineStockService wineStockService = service.getPort(WineStockService.class);

            String order = wineStockService.placeOrder("Vinho Tinto Fino", 2);

            System.out.println(order);
    }
}