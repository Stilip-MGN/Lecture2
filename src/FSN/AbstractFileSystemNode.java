package FSN;

public abstract class AbstractFileSystemNode implements FileSystemNode {
    public String name;
    public FileSystemNode root;

    @Override
    public final FileSystemNode getRoot() {
        return root;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public final String getPath() {
        String result = "";
        if (root != null)
            result = root.getPath();
        return String.format("%s/%s", result, getName());
    }

    @Override
    public void setRoot(FileSystemNode root) {
        this.root = root;
    }
}
