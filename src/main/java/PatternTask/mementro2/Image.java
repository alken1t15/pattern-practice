package PatternTask.mementro2;


public class Image {
    private String name;
    private String size;

    public void set(String name, String size) {
        this.name = name;
        this.size = size;
    }

    public void load(SaveImage saveImage) {
        name = saveImage.getName();
        size = saveImage.getSize();
    }

    public SaveImage save() {
        return new SaveImage(name, size);
    }

    @Override
    public String toString() {
        return "Image{" +
                "name='" + name + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}