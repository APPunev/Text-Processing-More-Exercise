import java.util.Scanner;

public class MorseCodeTranslator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String[] words = input.split("\\|");

        for (int i = 0; i < words.length; i++) {
            String[] letter = words[i].split(" ");
            String currentWord = "";

            for (int j = 0; j < letter.length; j++) {
                switch (letter[j]){
                    case ".-":
                        currentWord += "A";
                        break;
                    case "-...":
                        currentWord += "B";
                        break;
                    case "-.-.":
                        currentWord += "C";
                        break;
                    case "-..":
                        currentWord += "D";
                        break;
                    case ".":
                        currentWord += "E";
                        break;
                    case "..-.":
                        currentWord += "F";
                        break;
                    case "--.":
                        currentWord += "G";
                        break;
                    case "....":
                        currentWord += "H";
                        break;
                    case "..":
                        currentWord += "I";
                        break;
                    case ".---":
                        currentWord += "J";
                        break;
                    case "-.-":
                        currentWord += "K";
                        break;
                    case ".-..":
                        currentWord += "L";
                        break;
                    case "--":
                        currentWord += "M";
                        break;
                    case "-.":
                        currentWord += "N";
                        break;
                    case "---":
                        currentWord += "O";
                        break;
                    case ".--.":
                        currentWord += "P";
                        break;
                    case "--.-":
                        currentWord += "Q";
                        break;
                    case ".-.":
                        currentWord += "R";
                        break;
                    case "...":
                        currentWord += "S";
                        break;
                    case "-":
                        currentWord += "T";
                        break;
                    case "..-":
                        currentWord += "U";
                        break;
                    case "...-":
                        currentWord += "V";
                        break;
                    case ".--":
                        currentWord += "W";
                        break;
                    case "-..-":
                        currentWord += "X";
                        break;
                    case "-.--":
                        currentWord += "Y";
                        break;
                    case "--..":
                        currentWord += "Z";
                        break;
                    case " ":
                        currentWord += " ";
                        break;
                }
            }
            words[i] = currentWord;
        }
        System.out.println(String.join(" ",words));
    }
}
