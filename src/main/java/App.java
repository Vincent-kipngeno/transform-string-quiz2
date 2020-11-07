import java.io.Console;
import java.io.IOException;

public class App {
    public static void main(String[] args) {
        Console myConsole = System.console();

        System.out.println("Enter the string to be transformed: ");
        String stringToTransform = myConsole.readLine();
        System.out.println("Transformed string is: ");
        System.out.println(transformString(stringToTransform));
    }

    private static  String transformString(String stringToTransform) {
        // split the string at intervals of 4, instantiate each splitString in a StringBuilder then reverse and add it to finalTransformedString
        String finalTransformedString = "";
        for (int i = 0; i < stringToTransform.length(); i += 4) {
            String splitString = stringToTransform.substring(i, Math.min(i + 4, stringToTransform.length()));
            StringBuilder stringBuilder = new StringBuilder(splitString);
            finalTransformedString = String.format("%s%s", finalTransformedString, stringBuilder.reverse().toString());
        }

        return finalTransformedString;
    }
}

