package Exercise_17_Review;

public class Clothing {
    private String size;
    private String type;
    private Boolean isNew;
    private Boolean isImported;

    public Clothing(){}

    public Clothing(String size, String type, Boolean isNew, Boolean isImported) {
        this.size = size;
        this.type = type;
        this.isNew = isNew;
        this.isImported = isImported;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Boolean getIsNew() {
        return isNew;
    }

    public void setIsNew(Boolean isNew) {
        this.isNew = isNew;
    }

    public Boolean getIsImported() {
        return isImported;
    }

    public void setIsImported(Boolean isImported) {
        this.isImported = isImported;
    }

    @Override
    public String toString() {
        return "Ropa{" +
                "Size='" + this.size + '\'' +
                ", Type='" + this.type + '\'' +
                ", Es nueva=" + this.isNew +
                ", Es importada=" + this.isImported +
                '}';
    }
}
