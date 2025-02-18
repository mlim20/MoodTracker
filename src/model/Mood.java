package src.model;

import java.text.SimpleDateFormat;

public class Mood {
    private int rating;

    private SimpleDateFormat date;

    public Mood(int rating, SimpleDateFormat date) {
        this.rating = rating;
        this.date = date;
    }

    public int getRating() {
        return rating;
    }

    public SimpleDateFormat date() {
        return date;
    }
}
