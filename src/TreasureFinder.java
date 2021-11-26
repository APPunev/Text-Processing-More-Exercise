import java.util.Arrays;
import java.util.Scanner;

public class TreasureFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[] key = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();


        String input = scanner.nextLine();


        while(!input.equals("find")){
            String decodedMessage = "";
            int i = -1;
            int j = -1;
            char[] inputToChar = input.toCharArray();
            if (inputToChar.length > key.length) {
                for (char c : inputToChar) {
                    j++;
                    i++;
                    c = (char)(c - key[i]);
                    decodedMessage += c;
                    if (i == key.length - 1) {
                        i = -1;
                    }
                }
            }
            //hidden&gold&at<10N70W>
            int startTreasure = decodedMessage.indexOf("&");
            String subTreasure = decodedMessage.substring(startTreasure + 1);
            int endTreasure = subTreasure.indexOf("&");
            String treasure = subTreasure.substring(0,endTreasure);

            int startCoordinates = subTreasure.indexOf("<");
            String subCoordinates = subTreasure.substring(startCoordinates + 1);
            int endCoordinates = subCoordinates.indexOf(">");
            String coordinates = subCoordinates.substring(0,endCoordinates);

            System.out.printf("Found %s at %s%n",treasure, coordinates);

            input = scanner.nextLine();
        }
    }
}
