package ShowResult;

public class ShowResult {
    public static void show(double answer) {
        System.out.println();
        System.out.print("Answer (ответ): ");
        if (answer % 1.0 == 0.0) {
            System.out.println((long) answer);
        } else {
            System.out.println(answer);
        }
    }
}
