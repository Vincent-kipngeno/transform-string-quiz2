import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException {

    }

    public static  String transformString(String stringToTransform) {
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

