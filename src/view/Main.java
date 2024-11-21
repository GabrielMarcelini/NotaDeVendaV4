package view;

import model.Sale;

public class Main {
    public static void main(String[] args) {
        Sale sale = new Sale();

        if (sale.createSaleItem("at", 2)) {
            System.out.println("Produto adicionado com sucesso!");
        }

        if (sale.createSaleItem("ff", 6)) { 
            System.out.println("Produto adicionado com sucesso!");
        }

        if (sale.createSaleItem("msa", 2)) {
            System.out.println("Produto adicionado com sucesso!");
        }

        sale.setPaymentMethod("c");

        for (String item : sale.getItems()) {
            System.out.println(item);
        }

        System.out.println(String.format("Total: %.2f", sale.getTotal()));
        System.out.println(String.format("Forma de pagamento: '%s'", sale.getPaymentMethod()));
        System.out.println(String.format("Valor a ser pago: R$%.2f", sale.getFinalPrice()));
    }
}