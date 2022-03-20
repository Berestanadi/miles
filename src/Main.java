public class Main {
    public static void main(String[] args) {
        // входные данные
        int ticketprice = 7500; // стоимость билета
        int amountmiles = 20; // количество рублей за 1 бонусную милю

        // логика программы
        int bonus = ticketprice / amountmiles;
        System.out.println("Вам начисленно бонусных миль:" + bonus);

    }
}
