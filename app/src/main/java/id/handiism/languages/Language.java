package id.handiism.languages;

public class Language {
    private final String name; // contain name
    private final String inventor; // contain programming language inventor
    private final int image; // contain programming language logo
    private final String description; // contain few description of programming language

    public Language(String name, String inventor, int image, String description) {
        this.name = name;
        this.inventor = inventor;
        this.image = image;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getInventor() {
        return inventor;
    }

    public int getImage() {
        return image;
    }

    public String getDescription() {
        return description;
    }
}
