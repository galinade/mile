public class Main {
    public static void main(String[] args) {
        int ticketPrice = 1250;//рублей
        int mile = 20;//рублей одна бонусная миля
        int bonusMiles = ticketPrice / mile;

        System.out.println("Количество бонусных милей:" + bonusMiles);
    }
}
