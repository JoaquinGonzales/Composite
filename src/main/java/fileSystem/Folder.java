package fileSystem;

import fileSystem.File;
import fileSystem.FileSystemComponent;

import java.util.ArrayList;
import java.util.List;

public class Folder {

    private String name;
    private List<FileSystemComponent> files;

    public Folder(String name) {
        this.name = name;
        this.files = new ArrayList<>();
    }


    public void add(File file)
    {
        this.files.add(file);
        }

    public void showDetails()
    {
        int aux = 0;
        for (FileSystemComponent file: files) {
            System.out.println(file.showDetails());
            aux += file.getSize();
        }
        System.out.println(String.format("Carpeta: %s, tamaño total: %s KB",this.name, aux ));
    }
}
