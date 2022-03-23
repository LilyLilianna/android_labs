package kustova.natalia;

import java.util.ArrayList;

public class Folder extends AbstractFileSystemNode {

    private ArrayList<FileSystemNode> arrayList;

    public Folder(String name, FileSystemNode ... fileSystemNodes) {
        setName(name);
        arrayList = new ArrayList<>(fileSystemNodes.length);
        for (FileSystemNode cureNode : fileSystemNodes) {
            ((AbstractFileSystemNode)cureNode).setParent(this);
            arrayList.add(cureNode);
        }
    }

    public String getChildNodes() {
        StringBuilder result = new StringBuilder();
        result.append("Child nodes: ");
        for (FileSystemNode curNode : arrayList) {
            result.append("\n" + curNode.getName());
        }
        return result.toString();
    }

    public FileSystemNode getChildNode(int indxNode) {
        return arrayList.get(indxNode);
    }
}
