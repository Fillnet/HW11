public class Main {
    public static void printIssues(int issuesCount) {
        System.out.println(issuesCount);
    }
    public static void printSeparator() {
        System.out.println("=+=+=+=+=+=+=+=+=+");
        System.out.println("=+=+=+=+=+=+=+=+=+");

    }
public static int sum(int[] numbers){
        int sum = 0;
    for (int i = 0; i < numbers.length; i++) {
        sum += numbers[i];
    }
        return sum;
}
    public static void main(String[] args) {
        int[] issuesByMonth = {4, 6, 7, 9, 2, 5, 12, 3, 7, 10, 6, 7, 1, 8,};
        printSeparator();
        for (int i = 0; i < issuesByMonth.length; i++) {
            printIssues(issuesByMonth[i]);
            if ((i + 1) % 3 == 0) {
                printSeparator();
            }
        }
        printSeparator();
        int total = sum(issuesByMonth);
        printIssues(total);
    }
}