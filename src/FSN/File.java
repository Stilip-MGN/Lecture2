package FSN;

public class File extends AbstractFileSystemNode{
    public String extension;

    public File(String name, String extension){
        this.name = name;
        this.extension = extension;
    }

    public String getExtension(){
        return extension;
    }

    @Override
    public String getName() {
        return name+extension;
    }
}
