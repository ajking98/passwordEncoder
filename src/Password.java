import java.util.Scanner;
public class Password {
    /**
     * The executeable main method that will run when called
     * @param args any array of char making a string which is the password
     */
    public static void main(String[] args) {
        System.out.print("What is your name?");
        Scanner sc2 = new Scanner(System.in);
        System.out.print("Set Password:");
        Scanner sc = new Scanner(System.in);
        String firstCode = sc.next();
        if (identityChecker(firstCode)) {
            System.out.println("Welcome, Ahmed Gedi");
            encoder(sc.next());
        } else {
            System.out.println("Wrong Password, Try Again");
        }
    }

    /**
     * The encoder method that will turn the input into a crazy encoded message
     * @param input the input to encode
     */
    public static String encoder(String input) {
        int[] convertedIntArr = new int[input.length()];
        String encondedMessage = "";
        for (int i = 0; i < input.length(); i++) {
            char indexedChar = input.charAt(i);
            int ascii = (int) indexedChar;
            convertedIntArr[i] = ascii - 10;
            if (convertedIntArr[i] > 0 && convertedIntArr[i] < 33) {
                convertedIntArr[i] = 64;
            }
            System.out.println(convertedIntArr[i]);
        }

        for (int j = 0; j < input.length(); j++) {
            char newChar = (char) convertedIntArr[j];
            encondedMessage += Character.toString(newChar);
        }

        System.out.println(encondedMessage);
        return encondedMessage;
    }

    /**
     *
     * @param input the input to check if it admin
     * @return a boolean value to decide identity of user
     */
    public static boolean identityChecker(String input) {
        if (input.equals("ahmedg123")) {
            return true;
        }
        return false;
    }
}