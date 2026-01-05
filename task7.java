import java.util.Scanner;
public static void main(String[] args) {
    System.out.println("Enter the username:");
    String defaultvalue = "user";
    Scanner scanner = new Scanner(System.in);
    String username = scanner.nextLine();
    String inputLine = scanner.nextLine();
    if (inputLine == null || inputLine.trim().isEmpty()) {
        username = defaultvalue;
    } else {
        username = inputLine;
    }
    signIn(username);
}
public static void signIn(String username){
    if (username.equals("user")) {
        return;
    }
    else {
        System.out.println("Welcome " + username);
        System.out.println("Missed you very much, " + username);
    }
}
