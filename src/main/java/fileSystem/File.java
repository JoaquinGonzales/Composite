package fileSystem;

public class File implements FileSystemComponent {
    private int size;
    private String name;

    public File(int size, String name) {
        this.size = size;
        this.name = name;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public String showDetails() {
        return String.format("Archivo: %s, Tamaño: %s KB", this.name, this.size);
    }
}
