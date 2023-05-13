public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("Задание 1");
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
    }
    public static void task2() {
        System.out.println("Задание 2");
        int[] arr = generateRandomArray();
        int maxArr = 0;
        int minArr = 200_000;
        for (int i : arr) {
            if (i > maxArr) {
                maxArr = i;
            }
            if (i < minArr) {
                minArr = i;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minArr + " рублей. Максимальная сумма трат за день составила " + maxArr + " рублей");
    }
    public static void task3(){
        System.out.println("Задание 3");
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        double midArr = (double) sum / arr.length;
        System.out.printf("Средняя сумма трат за месяц составила %.2f рублей\n", midArr);
    }
    public static void task4(){
        System.out.println("Задание 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = 0; i < reverseFullName.length; i++) {
            char fullName = reverseFullName[reverseFullName.length-1-i];
            System.out.print(fullName);
        }
    }
}