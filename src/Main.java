public class Main {
    public static void main(String[] args)   {
        BonusMilesService service = new BonusMilesService();
//        int price = 10_000;
//        int miles = service.calculate(price); // должно получиться 500
//        System.out.println(miles);

        System.out.println();
        System.out.println("стоимость билета 10 000 ");
        System.out.println("бонус "+ service.calculate(10000));

        System.out.println();
        System.out.println("стоимость билета 7 000 ");
        System.out.println("бонус "+ service.calculate(7000));

        System.out.println();
        System.out.println("стоимость билета 4 578 ");
        System.out.println("бонус "+ service.calculate(4578));
        }
}