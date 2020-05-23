public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();


        int miles = service.calculate(3434, 20);
        System.out.println(miles);
        int miles2 = service.calculate(1454, 20);
        System.out.println(miles2);
        int miles3 = service.calculate(56456, 20);
        System.out.println(miles3);
        int miles4 = service.calculate(33333333, 20);
        System.out.println(miles4);
    }

}