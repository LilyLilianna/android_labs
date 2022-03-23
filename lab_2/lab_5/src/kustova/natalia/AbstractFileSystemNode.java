package kustova.natalia;

public class AbstractFileSystemNode implements FileSystemNode{
    private FileSystemNode parent;
    private String name;

    public void setParent(FileSystemNode parent) {
        this.parent = parent;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public final FileSystemNode getParentElement() {
        return parent;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public final String getPath() {
        if(parent == null) return "://" + name;
        return parent.getPath() + "/" + name;
    }
}
