public class Main {
    public static void main(String[] args) {
        boolean user = true;
        long TicketPriceKopecks = 101995;
        int AmountRuble = 20;
        long BonusMiles = TicketPriceKopecks/AmountRuble/100;
        System.out.println(BonusMiles);
    }
}