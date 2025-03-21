package entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Post {
    private LocalDateTime createdAt;
    private String title;
    private String content;
    private Integer likes;
    private List<Comment> comments = new ArrayList<>();

    public Post() {}

    public Post(LocalDateTime createdAt, String title, String content, Integer likes, List<Comment> comments) {
        this.createdAt = createdAt;
        this.title = title;
        this.content = content;
        this.likes = likes;
        this.comments = comments;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");

        String commentsToString = comments.stream().toString();

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(title )
                .append("\n")
                .append(getLikes())
                .append(" likes - ")
                .append(dateTimeFormatter.format(createdAt))
                .append("\n")
                .append(content)
                .append("\n")
                .append("Comments:\n")
                .append(commentsToString);

        return stringBuilder.toString();
    }
}
