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
    public static int calculateSum(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
//        System.out.println("Сумма элеметов массива: " + sum);
    }

    public static int calculateSum(int a, int b) {
        int sum = a + b;
//        System.out.println("Сумма элементов: " + sum);
        return sum;
    }


    public static void printGreetings(String name) {
        System.out.println("ПРИВЕТ, " + name);
    }

    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 6;
        int[] arr = {1, 2, 3};
        printGreetings("Иван");
        int sumOfAAnDB = calculateSum(num1, num2);
        int sumOfArrayElements = calculateSum(arr);
        System.out.println(sumOfAAnDB);
        System.out.println(sumOfArrayElements);
    }

    public static int getClientOs(String name) {
        if (name.equals("iOS")) {
            return 0;
        } else {
            return 1;
        }
    }

    public static void OS(String[] args) {
        String osName = "iOS";
        int clientOS = getClientOs(osName);
        System.out.println(clientOS);
    }
}