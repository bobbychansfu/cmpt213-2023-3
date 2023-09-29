package ca.sfu.cmpt.filefilter;

import java.io.File;
import java.io.FileFilter;

public class DemoFileFilter {
    public static void main(String[] args) {
        demoClassFilter();
        demoInnerFilter();
        demoAnonFilter();
        demoLambdaFilter();
    }

    private static void dumpFiles(File[] files){
        for (File subFile : files){
            System.out.println("file: " + subFile.getAbsolutePath());
        }
    }

    private static void demoClassFilter() {
        FileFilter filter = new TxtFilter();
        File folder = new File("./files");
        // System.out.println(folder.isDirectory());
        File[] fileList = folder.listFiles(filter);

        dumpFiles(fileList);
    }

    private static void demoInnerFilter() {
        class TxtInnerFilter implements FileFilter {
            @Override
            public boolean accept(File file){
                return file.getName().endsWith(".txt");
            }
        }
        FileFilter filter = new TxtInnerFilter();
        File folder = new File("./files");
        // System.out.println(folder.isDirectory());
        File[] fileList = folder.listFiles(filter);

        dumpFiles(fileList);
        
    }

    private static void demoAnonFilter() {  
        FileFilter filter = new FileFilter() {
            @Override
            public boolean accept(File file){
                return file.getName().endsWith(".txt");
            }
        };
        File folder = new File("./files");
        // System.out.println(folder.isDirectory());
        File[] fileList = folder.listFiles(filter);

        dumpFiles(fileList);
    }

    private static void demoLambdaFilter() {  
        File folder = new File("./files");
        // System.out.println(folder.isDirectory());
        File[] fileList = folder.listFiles(
            (File file) -> file.getName().endsWith(".txt")
        );
        dumpFiles(fileList);
    }
}
