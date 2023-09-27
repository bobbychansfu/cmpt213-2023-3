package ca.sfu.cmpt.filefilter;

import java.io.File;
import java.io.FileFilter;

public class DemoFileFilter {
    public static void main(String[] args) {
        demoClassFilter();
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

}
