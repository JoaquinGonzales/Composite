package fileSystemTests;

import fileSystem.File;
import fileSystem.Folder;
import org.junit.jupiter.api.Test;

public class TestFolder {
    @Test
    public void testFolder()
    {
        File file1 = new File(10, "file1");
        File file2 = new File(40, "file2");
        File file3 = new File(30, "file3");
        File file4 = new File(20, "file4");

        Folder folder = new Folder("folder1");
        folder.add(file1);
        folder.add(file2);
        folder.add(file3);
        folder.add(file4);

        folder.showDetails();
    }
}
