public class Main {
    public static void main(String[] args) {
        int cost = 11_345; //стоимость билета в рублях
        int rub = 20; //количество рублей для одной бонусной мили

        int mile = cost / rub; //бонусных милей

        System.out.println("Начислено:");
        System.out.println(mile + " бонусных милей");
    }
}
