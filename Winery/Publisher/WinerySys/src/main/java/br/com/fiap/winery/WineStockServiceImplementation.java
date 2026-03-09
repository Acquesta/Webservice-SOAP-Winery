package br.com.fiap.winery;

import jakarta.jws.WebService;

@WebService(endpointInterface = "br.com.fiap.winery.WineStockService")
public class WineStockServiceImplementation implements WineStockService{
    @Override
    public String getMenu() {
        StringBuilder menu = new StringBuilder();

        menu.append("========================================\n");
        menu.append("        MENU DE VINHOS - WINERY     \n");
        menu.append("========================================\n\n");

        menu.append("[ Uva: Cabernet Sauvignon ]\n");
        menu.append(" 1. Vinho Tinto Reserva (Safra 2018) - R$ 120,00\n");
        menu.append(" 2. Vinho Tinto Suave - R$ 85,00\n\n");

        menu.append("[ Uva: Chardonnay ]\n");
        menu.append(" 3. Vinho Branco Seco - R$ 90,00\n");
        menu.append(" 4. Espumante Brut - R$ 150,00\n\n");

        menu.append("[ Uva: Merlot ]\n");
        menu.append(" 5. Vinho Tinto Fino - R$ 110,00\n");
        menu.append("========================================\n");

        return menu.toString();
    }

    @Override
    public String placeOrder(String name, int quantity) {
        return "Pedido confirmado! Você solicitou " + quantity + " unidade(s) do vinho '" + name + "'.";
    }
}
