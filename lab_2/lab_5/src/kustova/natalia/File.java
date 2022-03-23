package kustova.natalia;

public class File extends AbstractFileSystemNode {

    public File(String name) {
        setName(name);
    }

    public String getFileType() {
        String fileName = getName();
        return fileName.substring(fileName.lastIndexOf('.'));
    }
}
