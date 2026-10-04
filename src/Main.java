public class Main {

    public static void main(String[] args) {
        Duck turkeyAdapter = new TurkeyClassAdapter();

        System.out.println("The TurkeyAdapter says...");
        testDuck(turkeyAdapter);
    }

    static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}