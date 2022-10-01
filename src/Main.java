import java.time.LocalDate;
import java.util.Arrays;
import java.util.Random;

public class Main {

    //    public static void printIssues(int issuesCount) {
//        System.out.println(issuesCount);
//    }
//    public static void printSeparator() {
//        System.out.println("=+=+=+=+=+=+=+=+=+");
//        System.out.println("=+=+=+=+=+=+=+=+=+");
//
//    }
//public static int sum(int[] numbers){
//        int sum = 0;
//    for (int i = 0; i < numbers.length; i++) {
//        sum += numbers[i];
//    }
//        return sum;
//}
//    public static void main(String[] args) {
//        int[] issuesByMonth = {4, 6, 7, 9, 2, 5, 12, 3, 7, 10, 6, 7, 1, 8,};
//        printSeparator();
//        for (int i = 0; i < issuesByMonth.length; i++) {
//            printIssues(issuesByMonth[i]);
//            if ((i + 1) % 3 == 0) {
//                printSeparator();
//            }
//        }
//        printSeparator();
//        int total = sum(issuesByMonth);
//        printIssues(total);
//    }
//    public static int calculateSum(int[] arr) {
//        int sum = 0;
//        for (int i : arr) {
//            sum += i;
//        }
//        System.out.println("Сумма элеметов массива: " + sum);
//
//        return sum;
//    }
//
//    public static int calculateSum(int a, int b) {
//        int sum = a + b;
//        System.out.println("Сумма элементов: " + sum);
//        return sum;
//    }
//
//
//    public static void printGreetings(String name) {
//        System.out.println("ПРИВЕТ, " + name);
//    }
//
//    public static void printSeason(int monthNumber) {
//        if (monthNumber <= 0 || monthNumber > 12) {
//            System.out.println("Некоректное значение месяца");
//            return;
//        }
//        switch (monthNumber) {
//            case 12:
//            case 1:
//            case 2:
//                System.out.println("Зима ");
//                break;
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("Весна ");
//                break;
//            case 6:
//            case 7:
//            case 8:
//                System.out.println("Лето ");
//                break;
//            case 9:
//            case 10:
//            case 11:
//                System.out.println("Осень ");
//
//        }
//    }
//
//
//    public static void main(String[] args) {
//        int num1 = 5;
//        int num2 = 6;
//        int[] arr = {1, 2, 3};
//        printGreetings("Иван");
//        calculateSum(num1, num2);
//        calculateSum(arr);
//        printSeason(9);
//
    public static void main(String[] args) {
        System.out.println("Задание 1");
        leapYear(2024);
        System.out.println("Задание 2");
        osVersion(0, 2014);
        System.out.println("Задание 3");
        int deliveryDays = calculateDeliveryDays(95);
        System.out.println(" Потребуется дней: " + deliveryDays);
        System.out.println("Задание 4");
        int a = 24567;
        int b = 232652637;
        minMAx(a, b);
        System.out.println();
        System.out.println("Задание 5");
        int c = 8;
        System.out.printf("Число %s четное: %s ", c, evenOdd(c));
        System.out.println();
        System.out.println("Задание 6: разворот массива");
        int[] testArray = {1, 2, 3, 4, 5, 7, 8, 2, 9, 7, 8};
        System.out.println(Arrays.toString(testArray));
        reverseArray(testArray);
        System.out.println(Arrays.toString(testArray));
        System.out.println("Задание 7: число в квадрат");
        int d = 123;
        System.out.printf(" Квадрат числа %s равен: %s ", d, quadro(d));
        System.out.println();
        System.out.println("Задание 8: число в куб");
        int e = 2;
        System.out.printf(" Куб числа %s равен: %s ", e, tripple(e));
        System.out.println();
        System.out.println("Задание 9");
        int f = 9;
        int g = 8;
        System.out.printf("Число %s больше %s : %s ", f, g, moreLess(f, g));
        System.out.println();
        System.out.println("Задание 10: Сортировка массива");
        int[] sortArray = {18, 4, 5, 34, 54, 25, 15, 48, 59, 1, 42, 26};
        System.out.println(Arrays.toString(sortArray));
        arraySort(sortArray);
        System.out.println(Arrays.toString(sortArray));
        System.out.println("Задание 11");
        double h = 9;
        System.out.println(randomNumbers(h));
        System.out.println("Задание 12");
        int j = 27;
        System.out.println(generate(j));
        System.out.println("Задание 13");
        double k = 18.2458;
        System.out.println(roundUp(k));
        System.out.println("Задание 13");
        int[] array = generateRandomArray(5);
        double average = calculateAverage(array);
        System.out.printf(" Average = %s %n", average);

    }

    public static void leapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " год високосный ");
        } else {
            System.out.println(year + " год не является високосным ");
        }
    }

    public static void osVersion(int osType, int manufactureYear) {
        if (osType != 1 & osType != 0) {
            throw new IllegalArgumentException(" Неправильная ОС");
        }
        int currentYear = LocalDate.now().getYear();
        if (manufactureYear > currentYear) {
            throw new IllegalArgumentException(" Неправильный год выпуска ");
        }
        String osString = osType == 0 ? " iOS" : " Android";
        String versionString = manufactureYear < 2015 ? " lite" : " full";
        System.out.printf(" Установите %s версию для %s по ссылке %n", versionString, osString);

    }

    public static int calculateDeliveryDays(int deliveryDistance) {
        if (deliveryDistance <= 20) {
            return 1;
        } else {
            return (int) Math.round((double) deliveryDistance / 40) + 1;
        }
    }

    public static int minMAx(int num1, int num2) {
        int min = Math.min(num1, num2);
        System.out.printf("Среди чисел %s и %s минимальным является: %s", num1, num2, min);
        return min;
    }

    public static boolean evenOdd(int a) {
        return a % 2 == 0;
    }

    public static void reverseArray(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int tmp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = tmp;
        }
    }

    public static long quadro(int num) {
        return (long) Math.pow(num, 2);
    }

    public static long tripple(int num) {
        return (long) Math.pow(num, 3);
    }

    public static boolean moreLess(int a, int b) {
        return a >= b;
    }

    public static void arraySort(int[] arr) {
        Arrays.sort(arr);
    }

    public static double randomNumbers(double n) {
        return new Random().nextDouble() + n;
    }

    public static int generate(int num) {
        return new Random().nextInt(num * 2 + 1) - num;
    }

    public static long roundUp(double num) {
        return Math.round(num);
    }

    public static double calculateAverage(int[] spendings) {
        int sum = sumArray(spendings);
        return (double) sum / spendings.length;
    }

    private static int sumArray(int[] spendings) {
        int sum = 0;
        for (int s : spendings) {
            sum += s;
                }
        return sum;
    }

    private static int[] generateRandomArray(int size) {
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10000);
        }
        return array;
    }
}
