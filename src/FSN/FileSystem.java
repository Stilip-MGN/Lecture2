package FSN;

public class FileSystem {
    //Отобразите расширение N-го дочернего файла какой-либо папки.
    //-Не понял задания, измените формулировку.
    public static void main(String[] args) {
        File file1 = new File("file1",".txt");
        File file2 = new File("file2",".exe");
        Folder folder1 = new Folder("folder1",file1,file2);

        Folder folder2 = new Folder("folder2");

        Folder root = new Folder("Root",folder1,folder1);

        System.out.println(file2.getPath());
        System.out.println(((File)(folder1.getChildren().get(1))).extension);
    }
}
