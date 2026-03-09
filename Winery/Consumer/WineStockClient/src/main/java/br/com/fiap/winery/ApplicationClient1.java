package br.com.fiap.winery;

import java.net.URL;

import javax.xml.namespace.QName;

import jakarta.xml.ws.Service;

public class ApplicationClient1 {
    public static void main(String[] args) {
        try {
            // Instancia objeto URL para receber a String da URL do arquivo wsdl
            URL url = new URL("http://localhost:8085/WineStockService?wsdl");
            
            // Instancia objeto QName para receber targetNameSpace e localPart
            QName qName = new QName("http://winery.fiap.com.br/", "WineStockServiceImplementationService");
            
            // Instancia objeto Service com o método create
            Service service = Service.create(url, qName);
            
            // Instancia objeto WineStockService com o método getPort
            WineStockService wineStockService = service.getPort(WineStockService.class);
            
            // Cria variável String menu e atribui o método getMenu
            String menu = wineStockService.getMenu();
            
            // Imprime o conteúdo de menu
            System.out.println(menu);
            
        } catch (Exception e) {
            System.err.println("Erro ao consumir o serviço: " + e.getMessage());
            e.printStackTrace();
        }
    }
}