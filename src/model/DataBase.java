package model;

import java.util.HashMap;
import java.util.Map;

public class DataBase {
    private static Map<String, String[]> products = new HashMap<>();
    private static Map<String, PaymentMethod> payments = new HashMap<>();
    private static Map<String, Integer> stock = new HashMap<>();

    static {
        products.put("at", new String[]{"Arroz Tatiana", "30"});
        products.put("ff", new String[]{"Feijão Fejó", "20"});
        products.put("msa", new String[]{"Macarrão Santa Amália", "15"});

        stock.put("at", 10);
        stock.put("ff", 5);
        stock.put("msa", 8);

        CreditCard creditCard = new CreditCard(5.0);
        DebitCard debitCard = new DebitCard(0.0);
        Cash cash = new Cash(5.0);

        payments.put("cc", creditCard);
        payments.put("dc", debitCard);
        payments.put("c", cash);
    }

    public static String[] selectProduct(String code) {
        return products.get(code);
    }

    public static PaymentMethod selectPayment(String payment) {
        return payments.get(payment);
    }

    public static boolean isProductInStock(String code, int quantity) {
        return stock.getOrDefault(code, 0) >= quantity;
    }

    public static void updateStock(String code, int quantity) {
        stock.put(code, stock.get(code) - quantity);
    }
}
