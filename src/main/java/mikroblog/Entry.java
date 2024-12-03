package mikroblog;

public class Entry {
    int id;
    String author;
    String text;
    String date;
    int likes;

    public Entry(int id, String author, String text, String date, int likes) {
        this.id = id;
        this.author = author;
        this.text = text;
        this.date = date;
        this.likes = likes;
    }

    public int getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public String getText() {
        return text;
    }

    public String getDate() {
        return date;
    }

    public int getLikes() {
        return likes;
    }
}
