import entity.Comment;
import entity.Post;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        Post post1 = new Post(
                LocalDateTime.parse("21/06/2018 13:05:44", dateTimeFormatter),
                "Traveling to New Zealand",
                "I'm going to visit this wonderful country!",
                12,
                List.of(
                        new Comment("Have a nice trip"),
                        new Comment("Wow that's awesome!")
                )
        );

        Post post2 = new Post(
                LocalDateTime.parse("28/07/2018 23:14:19", dateTimeFormatter),
                "Good night guys",
                "See you tomorrow",
                5,
                List.of(
                        new Comment("Good night"),
                        new Comment("May the Force be with you")
                )
        );

        System.out.println(post1);
        System.out.println(post2);
    }
}
