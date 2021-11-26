import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HTML {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String title = scanner.nextLine();

        String content = scanner.nextLine();

        String comment = scanner.nextLine();

        List<String> commentList = new ArrayList<>();

        while(!comment.equals("end of comments")){
            commentList.add(comment);
            comment = scanner.nextLine();
        }
        System.out.println("<h1>");
        System.out.println(title);
        System.out.println("</h1>");
        System.out.println("<article>");
        System.out.println(content);
        System.out.println("</article>");
        for (String s : commentList) {
            System.out.println("<div>");
            System.out.println(s);
            System.out.println("</div>");
        }

    }
}
