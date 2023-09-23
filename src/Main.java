// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int ticketCost = 20016; // Стоимость билета
        int milesPerRuble = 20; // Количество рублей для одной бонусной мили

        int bonusMiles = ticketCost / milesPerRuble; // Расчет количества бонусных миль

        System.out.println("За купленный билет начислено " + bonusMiles + " миль");

    }
}
