package classwork.fileExample.fileExample;


import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileExample {

    public static void main(String[] args) throws IOException {
//        String property = System.getProperty("user.dir");
//        System.out.println(property);

//        String directoryPath = "/Users/karen/data/lessons/Java 2022-23/JavaCore/src/classwork/fileExample/testFolder/petrosFolder/folder1/folder2/folder3";
        String path = "/Users/karen/data/lessons/Java 2022-23/JavaCore/src/classwork/fileExample/testFolder/asdf.txt";
        File file = new File(path);
        if (file.exists()) {
            file.delete();
        }
        System.out.println(File.separator);
        long lastModified = file.lastModified();
        Date date = new Date(lastModified);


//        System.out.println("isDirectory: " + file.isDirectory());
//        System.out.println("isFile: " + file.isFile());
//        System.out.println("file size: " + file.length());
//
//        File directory = new File(directoryPath);
//        if(!directory.exists()) {
//            directory.mkdirs();
//        }
//
//        File[] list = directory.listFiles();
//        for (File f : list) {
//            if(f.isFile()) {
//                System.out.print("name: " + f.getName());
//                System.out.println(" size: " + f.length());
//            }
//        }
//
////        boolean newFile = file.createNewFile();
////        if (newFile) {
////            System.out.println("File created");
////        } else {
////            System.out.println("File not created");
////        }
//

    }

}
