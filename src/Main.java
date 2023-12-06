public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    private static int[] generateRandomMoney() {
        java.util.Random random = new java.util.Random();
        int[] money = new int[30];
        for (int i = 0; i < money.length; i++) {
            money[i] = random.nextInt(100000) + 100000;
        }
        return money;
    }

    private static void task1() {
        System.out.println("Задача №1.");
        int[] money = generateRandomMoney();
        int moneySum = 0;
        for (int i = 0; i < money.length - 1; i++) {
            moneySum += money[i];
            System.out.println(money[i]);
        }
        System.out.println("\nСумма трат за месяц составила " + moneySum + "рублей");
    }

    private static void task2() {
        System.out.println("Задача №2.");
        int[] money = generateRandomMoney();
        int moneyMin = money[0];
        for (int i = 0; i < money.length - 1; i++) {
            System.out.println(money[i]);
        }
        for (int i = 0; i < money.length - 1; i++) {
            if (money[i] < moneyMin)
                moneyMin = money[i];
        }
        System.out.println("Минимальная сумма трат за день составила " + moneyMin + " рублей.");

        int moneyMax = money[0];
        for (int i = 0; i < money.length - 1; i++) {
            if (money[i] > moneyMax)
                moneyMax = money[i];
        }
        System.out.println("Максимальная сумма трат за день составила " + moneyMax + " рублей.");
    }

    private static void task3() {
        System.out.println("Задача №3.");
        int[] money = generateRandomMoney();
        int moneySum = 0;
        for (int i = 0; i < money.length - 1; i++) {
            moneySum += money[i];
            System.out.println(money[i]);
        }
        int moneyMidl = moneySum / 30;
        System.out.println("\nСумма трат за месяц составила " + moneyMidl + "рублей");
    }

    private static void task4() {
        System.out.println("Задача №4.");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}