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

        final String WSDL2 = "http://localhost:8086/WineWarningService?wsdl";
        final String TARGET2 = "http://winery.fiap.com.br/";
        final String NAME2 = "WineWarningServiceImplementationService";

        URL url = new URL(WSDL);

        URL url2 = new URL(WSDL2);

        QName qName2 = new QName(TARGET2, NAME2);

        QName qName = new QName(TARGET, NAME);

        Service service = Service.create(url, qName);
        Service service2 = Service.create(url2, qName2);


        WineStockService wineStockService = service.getPort(WineStockService.class);
        WineWarningService wineWarningService = service2.getPort(WineWarningService.class);

        String order = wineStockService.placeOrder("Vinho Tinto Fino", 2);

        System.out.println(order);

        String warn = wineWarningService.sendWarn();

        System.out.println(warn);
    }
}