package kustova.natalia;

public class Main {

    public static void main(String[] args) {
	// write your code here
        File file1_1 = new File("Child1_1.txt");
        File file1_2 = new File("Child1_2.mp4");
        File file2_1 = new File("Child2_1.kek");
        File file2_2 = new File("Child2_2.jpeg");
        File file2_3 = new File("Child2_3.lol");
        Folder child1Folder = new Folder("FirstFolder", file1_1, file1_2);
        Folder child2Folder = new Folder("SecondFolder", file2_1, file2_2, file2_3);
        Folder rootFolder = new Folder("RootFolder", child1Folder, child2Folder);
        System.out.println("Path: " + file2_3.getPath());
        System.out.println(rootFolder.getChildNodes());
        System.out.println("File type: " + ((File)child2Folder.getChildNode(1)).getFileType());
    }
}
