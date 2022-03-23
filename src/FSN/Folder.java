package FSN;

import java.util.ArrayList;

public class Folder extends AbstractFileSystemNode{
    ArrayList<FileSystemNode> files = new ArrayList<>();

    public  Folder(String name,FileSystemNode ... args){
        this.name = name;
        for(FileSystemNode f: args){
            f.setRoot(this);
            files.add(f);
        }
    }

    public ArrayList<FileSystemNode> getChildren(){
        return files;
    }
}
