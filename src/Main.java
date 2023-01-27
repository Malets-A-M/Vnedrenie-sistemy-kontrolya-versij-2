public class Main {
    public static void main(String[] args) {
        SalesManager salesManager = new SalesManager(new int[]{1, 6, 5, 20});
        System.out.println(salesManager.max());
        System.out.println(salesManager.average());
    }
}
