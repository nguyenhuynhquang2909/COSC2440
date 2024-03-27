package Week4.Problem1;

import java.util.Scanner;

public class DataInput {
    private Scanner sc;
    public DataInput() {
        sc = new Scanner(System.in);
    }
    public String getInput(String prompt) {
        System.out.println(prompt);
        return sc.nextLine();
    }
    public void closeScanner() {
        sc.close();
    }
}
