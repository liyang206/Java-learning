package com.CoreJava1.FileAndIO;

import java.io.File;
import java.io.IOException;

public class FileSearchDemo1 {
    public static void main(String[] args) {
        String fileName = "QQ.exe";
        File file = new File("C:/");
        try {
            fileSearch(file,fileName);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void fileSearch(File file, String fileName) throws Exception {
        if ( file == null || !file.exists() ) {
            return;
        }

        if ( !file.isDirectory() && file.getName().equals(fileName)) {
            System.out.println(fileName+ "的绝对路径为"+ file.getAbsolutePath());
            Runtime r = Runtime.getRuntime();
            r.exec(file.getAbsolutePath());
            System.exit(0);
        } else if (file.isDirectory()) {
            File[] files = file.listFiles();

            if (files != null && files.length > 0) {
                for (File f : files) {
                    fileSearch(f, fileName);
                }
            }

        }
        return;
    }
}
