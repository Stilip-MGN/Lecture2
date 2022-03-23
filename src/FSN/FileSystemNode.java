package FSN;

public interface FileSystemNode {
    FileSystemNode getRoot();
    String getName();
    String getPath();

    void setRoot(FileSystemNode root);
}
