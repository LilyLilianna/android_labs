package kustova.natalia;

public interface FileSystemNode {
    FileSystemNode getParentElement();
    String getName();
    String getPath();
}
