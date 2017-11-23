package addressbook;

public class groupObject {
    private final String name;
    private final String logo;
    private final String comment;

    public groupObject(String name, String logo, String comment) {
        this.name = name;
        this.logo = logo;
        this.comment = comment;
    }

    public String getName() {
        return name;
    }

    public String getLogo() {
        return logo;
    }

    public String getComment() {
        return comment;
    }
}
