package fileSystem;
import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystemComponent{

    private String name;
    private int totalSize;
    private List<FileSystemComponent> files;

    public Folder(String name) {
        this.name = name;
        this.files = new ArrayList<>();
    }


    public void add(File file)
    {
        this.files.add(file);
        }

    @Override
    public int getSize() {
        for (FileSystemComponent file: files) {
            totalSize += file.getSize();
        }
        return totalSize;
    }

    @Override
    public void showDetails()
    {
        for (FileSystemComponent file: files) {
            file.showDetails();
        }
        System.out.println(String.format("Carpeta: %s, tamaño total: %s KB",this.name, this.getSize()));
    }
}
